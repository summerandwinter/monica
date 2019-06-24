package com.summer.monica.handler;

import io.javalin.http.Context;
import io.javalin.http.RequestLogger;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */

public class HttpLoggerHandler implements RequestLogger {
  private static Logger log = LoggerFactory.getLogger(HttpLoggerHandler.class);

  @Override
  public void handle(@NotNull Context ctx, @NotNull Float time) throws Exception {
    log.info("收到一个请求： {}，耗时：{}", ctx.path(), time);
  }
}
