package com.summer.monica.model;

import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/24
 */
@Data
public class V2rayConfig {
  private Log log;
  private Api api;
  private Dns dns;
  private Map<String, String> stats;
  private Routing routing;
  private Policy policy;
  private Reverse reverse;
  private List<Inbound> inbounds;
  private List<Outbound> outbounds;
  private Transport transport;

}
