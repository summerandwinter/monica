package com.summer.monica.model.transport;

import java.util.Map;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class WebSocket {
  private String path;
  private Map<String, String> headers;

}
