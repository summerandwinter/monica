package com.summer.monica.model.protocol.mtproto;

import com.summer.monica.model.Inbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class MtProtoInbound extends Inbound {
  private MtProtoInboundSetting settings;

}
