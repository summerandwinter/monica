package com.summer.monica.model.transport;

import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class HTTPRequest {
  private String version;
  private String method;
  private List<String> path;
  private Map<String, Object> headers;

}
