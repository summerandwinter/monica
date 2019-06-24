package com.summer.monica.model.protocol.shadowscoks;

import com.summer.monica.model.inbounds.InboundConfig;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class ShadowsocksInbound extends InboundConfig {
  private String email;
  private String method;
  private String password;
  private Integer level;
  private Boolean ota;
  private String network;

}
