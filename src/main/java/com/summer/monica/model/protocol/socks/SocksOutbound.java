package com.summer.monica.model.protocol.socks;

import com.summer.monica.model.Outbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class SocksOutbound extends Outbound {
  private SocksOutboundSetting settings;

}
