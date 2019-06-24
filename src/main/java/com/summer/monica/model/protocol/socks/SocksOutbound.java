package com.summer.monica.model.protocol.socks;

import com.summer.monica.model.outbounds.OutboundConfig;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class SocksOutbound extends OutboundConfig {
  private List<Server> servers;

}