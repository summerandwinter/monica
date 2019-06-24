package com.summer.monica.controller;

import com.summer.monica.common.ApiResponse;
import io.javalin.http.Context;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
public class UserController {

  public static void login(Context ctx) {
    ctx.json(new ApiResponse());
  }

  public static void logout(Context ctx) {
    ctx.json(new ApiResponse());
  }

}
