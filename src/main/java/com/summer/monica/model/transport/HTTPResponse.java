package com.summer.monica.model.transport;

import java.util.Map;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class HTTPResponse {
  private String version;
  private String status;
  private String reason;
  private Map<String, Object> headers;

}
