package com.summer.monica;

import com.summer.monica.config.RouteConfig;
import com.summer.monica.handler.HttpLoggerHandler;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;

/**
 * @author yi.liu
 * @date 2019/6/24
 */
public class App {

  public static void main(String[] args) {
    Javalin app = Javalin.create(App::config);
    initHandler(app);
    app.start(7000);
  }

  private static void config(JavalinConfig config) {
    config.requestLogger(new HttpLoggerHandler());
  }
  private static void initHandler(Javalin app) {
    app.get("/", ctx -> ctx.result("hello world"));
    app.routes(new RouteConfig());
  }

}
