package com.summer.monica.model.protocol.socks;

import com.summer.monica.model.outbounds.BaseOutboundSetting;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class SocksOutboundSetting extends BaseOutboundSetting {
  private List<Server> servers;

}
