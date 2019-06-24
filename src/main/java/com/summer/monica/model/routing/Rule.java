package com.summer.monica.model.routing;

import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Rule {

  private String type;
  private List<String> domain;
  private List<String> ip;
  private String port;
  private String network;
  private List<String> source;
  private List<String> user;
  private List<String> inboundTag;
  private List<String> protocol;
  private String attrs;
  private String outboundTag;
  private String balancerTag;
}
