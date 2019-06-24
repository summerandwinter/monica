package com.summer.monica.common;

import com.summer.monica.enums.ApiResponseStatus;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
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

  public ApiResponse(T body) {
    this(ApiResponseStatus.SUCCESS);
    this.data = body;
  }

  public ApiResponse(ApiResponseStatus status, T body) {
    this(status);
    this.data = body;
  }
}
