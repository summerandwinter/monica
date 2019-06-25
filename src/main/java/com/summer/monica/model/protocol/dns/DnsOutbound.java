package com.summer.monica.model.protocol.dns;

import com.summer.monica.model.Outbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class DnsOutbound extends Outbound {
  private DnsOutboundSetting settings;

}
