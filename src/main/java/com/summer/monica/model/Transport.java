package com.summer.monica.model;

import com.summer.monica.model.transport.DomainSocket;
import com.summer.monica.model.transport.Http;
import com.summer.monica.model.transport.Kcp;
import com.summer.monica.model.transport.QUIC;
import com.summer.monica.model.transport.Tcp;
import com.summer.monica.model.transport.WebSocket;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Transport {
  private Tcp tcpSettings;
  private Kcp kcpSettings;
  private WebSocket wsSettings;
  private Http httpSettings;
  private DomainSocket dsSettings;
  private QUIC quicSettings;

}
