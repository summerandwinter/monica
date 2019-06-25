package com.summer.monica.model.protocol.blackhole;


import com.summer.monica.model.outbounds.BaseOutboundSetting;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class BlackHoleOutboundSetting extends BaseOutboundSetting {
  private Response response;
}
