package com.monica.controller;

import com.google.gson.JsonObject;
import com.monica.service.InboundService;
import com.monica.common.ApiResponse;
import spark.Request;
import spark.Response;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
public class UserController {

  public static ApiResponse login(Request req, Response res) {
    JsonObject data = InboundService.getInbounds();
    return new ApiResponse<>(data);
  }

}
