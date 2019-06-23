package com.monica.common;

import com.monica.enums.ApiResponseStatus;
import com.sun.istack.internal.Nullable;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
public class ApiResponse<T> {

  private int code;
  private long timestamp;
  private String traceId;
  private String appTraceId;
  private String msg;
  private T data;

  public ApiResponse() {
    this(ApiResponseStatus.SUCCESS);
  }

  public ApiResponse(ApiResponseStatus status) {
    this.code = status.value();
    this.msg = status.getReasonPhrase();
    this.timestamp = System.currentTimeMillis();

  }

  public ApiResponse(@Nullable T body) {
    this(ApiResponseStatus.SUCCESS);
    this.data = body;
  }

  public ApiResponse(ApiResponseStatus status, @Nullable T body) {
    this(status);
    this.data = body;
  }

}
