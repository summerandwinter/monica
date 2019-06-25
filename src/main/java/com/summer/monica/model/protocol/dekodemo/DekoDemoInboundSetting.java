package com.summer.monica.model.protocol.dekodemo;

import com.summer.monica.model.inbounds.BaseInboundSetting;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class DekoDemoInboundSetting extends BaseInboundSetting {
  private String address;
  private Integer port;
  private String network;
  private Integer timeout;
  private Boolean followRedirect;
  private Integer userLevel;

}
