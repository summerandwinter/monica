package com.summer.monica.model.protocol.vmess;

import com.summer.monica.model.Outbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class VmessOutbound extends Outbound {
  private VmessOutboundSetting settings;

}
