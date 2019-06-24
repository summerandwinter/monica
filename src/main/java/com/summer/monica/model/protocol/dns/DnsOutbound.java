package com.summer.monica.model.protocol.dns;

import com.summer.monica.model.outbounds.OutboundConfig;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class DnsOutbound extends OutboundConfig {
  private String network;
  private String address;
  private Integer port;

}
