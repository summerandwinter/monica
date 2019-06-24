package com.summer.monica.model.transport;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class HttpHeader extends Header {
  private HTTPRequest request;
  private HTTPResponse response;

}
