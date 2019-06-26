package com.summer.monica;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.summer.monica.config.RouteConfig;
import com.summer.monica.handler.HttpLoggerHandler;
import io.javalin.Javalin;
import io.javalin.core.JavalinConfig;
import io.javalin.plugin.json.JavalinJackson;

/**
 * @author yi.liu
 * @date 2019/6/24
 */
public class App {

  public static void main(String[] args) {
    Javalin app = Javalin.create(App::config);
    initHandler(app);
    jacksonConfig();
    app.start(7000);
  }

  private static void config(JavalinConfig config) {
    config.requestLogger(new HttpLoggerHandler());
    config.addStaticFiles("/");
  }
  private static void jacksonConfig() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.setSerializationInclusion(Include.NON_NULL);
    JavalinJackson.configure(mapper);
  }
  private static void initHandler(Javalin app) {
    app.routes(new RouteConfig());
  }

}
