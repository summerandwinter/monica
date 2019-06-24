package com.summer.monica.model;

import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Dns {
  private Map<String, String> hosts;
  private List<Object> servers;
  private String clientIp;
  private String tag;

}
