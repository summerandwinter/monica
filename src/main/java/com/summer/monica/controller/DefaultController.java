package com.summer.monica.controller;

import io.javalin.http.Context;

/**
 * @author summerandwinter
 * @date 2019/6/28
 */
public class DefaultController {
  public static void index(Context ctx) {
    if (!"/".equals(ctx.path())) {
      ctx.redirect("/");
    }

  }

}
