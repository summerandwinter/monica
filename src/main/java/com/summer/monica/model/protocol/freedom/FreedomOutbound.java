package com.summer.monica.model.protocol.freedom;

import com.summer.monica.model.outbounds.OutboundConfig;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class FreedomOutbound extends OutboundConfig {
  private String domainStrategy;
  private String redirect;
  private Integer userLevel;

}
