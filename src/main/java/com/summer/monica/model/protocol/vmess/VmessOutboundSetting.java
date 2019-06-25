package com.summer.monica.model.protocol.vmess;

import com.summer.monica.model.outbounds.BaseOutboundSetting;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class VmessOutboundSetting extends BaseOutboundSetting {
  private List<Server> vnext;

}
