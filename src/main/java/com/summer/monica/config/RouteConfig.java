package com.summer.monica.config;

import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.get;

import com.summer.monica.controller.AccountController;
import com.summer.monica.controller.GithubController;
import com.summer.monica.controller.UserController;
import io.javalin.apibuilder.EndpointGroup;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
public class RouteConfig implements EndpointGroup {

  @Override
  public void addEndpoints() {
    path("api", () -> {
      path("user", () -> {
        get("login", UserController::login);
        get("logout", UserController::logout);
      });
      path("account", () -> {
        get("list", AccountController::list);
        get("edit", AccountController::edit);
        get("add", AccountController::add);
      });
      path("github", () -> {
        get("getDownloadUrl", GithubController::getDownloadUrl);
      });
    });
  }
}
