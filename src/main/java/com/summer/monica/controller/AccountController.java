package com.summer.monica.controller;

import com.summer.monica.common.ApiResponse;
import com.summer.monica.service.InboundService;
import io.javalin.http.Context;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
public class AccountController {

  public static void list(Context ctx) {
    ctx.json(new ApiResponse<>(InboundService.getInbounds()));
  }

  public static void edit(Context ctx) {
    ctx.json(new ApiResponse());
  }

  public static void add(Context ctx) {
    ctx.json(new ApiResponse());
  }

}
