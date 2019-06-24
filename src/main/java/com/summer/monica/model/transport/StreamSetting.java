package com.summer.monica.model.transport;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class StreamSetting {
  private String network;
  private String security;
  private TLS tlsSettings;
  private Sockopt sockopt;

}
