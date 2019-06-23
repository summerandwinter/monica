package com.monica.model;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Inbound {

  private String port;
  private String listen;
  private String protocol;
  private String tag;
  private StreamSetting streamSettings;
  private Sniffing sniffing;
  private Allocate allocate;
  private InboundConfiguration settings;

}
