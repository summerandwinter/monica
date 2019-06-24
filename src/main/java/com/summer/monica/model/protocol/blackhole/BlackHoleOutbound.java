package com.summer.monica.model.protocol.blackhole;


import com.summer.monica.model.outbounds.OutboundConfig;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class BlackHoleOutbound extends OutboundConfig {
  private Response response;
}
