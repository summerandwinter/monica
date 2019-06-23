package com.monica;

import static spark.Spark.*;

import com.google.gson.Gson;
import com.monica.controller.UserController;
import com.monica.filter.ApiFilter;
import spark.Spark;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/22
 */
public class App {

  public static void main(String[] args) {
    init();
  }

  private static void init() {
    initPath();
  }
  private static void initPath() {
    Gson gson = new Gson();
    path("/api", () -> {
      Spark.before("/*", new ApiFilter());
      path("/user", () -> {
        get("/login", UserController::login, gson::toJson);
      });
    });
  }

}
