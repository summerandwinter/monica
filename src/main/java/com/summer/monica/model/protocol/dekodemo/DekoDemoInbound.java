package com.summer.monica.model.protocol.dekodemo;

import com.summer.monica.model.Inbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class DekoDemoInbound extends Inbound {
  private DekoDemoInboundSetting settings;

}
