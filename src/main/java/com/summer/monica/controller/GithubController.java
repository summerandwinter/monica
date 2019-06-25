package com.summer.monica.controller;

import com.summer.monica.common.ApiResponse;
import com.summer.monica.service.GithubService;
import io.javalin.http.Context;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/25
 */
public class GithubController {

  public static void getDownloadUrl(Context ctx) {
    ctx.json(new ApiResponse<>(GithubService.getLatestDownloadUrl()));
  }

}
