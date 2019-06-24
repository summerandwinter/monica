package com.summer.monica.model.protocol.shadowscoks;

import com.summer.monica.model.outbounds.OutboundConfig;
import com.summer.monica.model.protocol.shadowscoks.Server;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class ShadowscoksOutbound extends OutboundConfig {
  private List<Server> servers;

}
