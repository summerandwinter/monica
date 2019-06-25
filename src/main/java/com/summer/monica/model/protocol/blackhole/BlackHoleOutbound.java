package com.summer.monica.model.protocol.blackhole;

import com.summer.monica.model.Outbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class BlackHoleOutbound extends Outbound {
  private BlackHoleOutboundSetting settings;

}
