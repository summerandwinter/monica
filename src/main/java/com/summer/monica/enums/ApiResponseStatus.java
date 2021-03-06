package com.summer.monica.enums;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
public enum ApiResponseStatus {

  /**
   * 用户不存在
   */
  SUCCESS(0, "ok"),
  PAGE_NOT_FOUND(1404, "Page Not Found"),
  INTERNAL_SERVER_ERROR(1500, "Internal Server Error"),
  USER_NOT_EXISTS(1000, "User not exits"),
  SESSION_EXPIRED(1002, "Network Authentication Required");

  private final int value;
  private final String reasonPhrase;
  ApiResponseStatus(int value, String reasonPhrase) {
    this.value = value;
    this.reasonPhrase = reasonPhrase;
  }
  public int value() {
    return this.value;
  }

  public String getReasonPhrase() {
    return this.reasonPhrase;
  }
}
