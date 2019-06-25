package com.summer.monica.model.protocol.shadowscoks;

import com.summer.monica.model.Inbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class ShadowSocksInbound extends Inbound {
  private ShadowSocksInboundSetting settings;

}
