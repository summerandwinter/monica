package com.summer.monica.model.protocol.vmess;

import com.summer.monica.model.Inbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class VmessInbound extends Inbound {
  private VmessInboundSetting settings;

}
