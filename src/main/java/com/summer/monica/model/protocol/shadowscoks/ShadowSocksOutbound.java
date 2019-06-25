package com.summer.monica.model.protocol.shadowscoks;

import com.summer.monica.model.Outbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class ShadowSocksOutbound extends Outbound {
  private ShadowSocksOutboundSetting settings;

}
