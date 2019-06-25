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
  private Tcp tcpSettings;
  private Kcp kcpSettings;
  private WebSocket wsSettings;
  private Http httpSettings;
  private DomainSocket dsSettings;
  private QUIC quicSettings;
  private Sockopt sockopt;

}
