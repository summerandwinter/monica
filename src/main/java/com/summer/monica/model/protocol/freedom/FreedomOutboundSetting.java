package com.summer.monica.model.protocol.freedom;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.summer.monica.model.outbounds.BaseOutboundSetting;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
@JsonDeserialize(as = FreedomOutboundSetting.class)
public class FreedomOutboundSetting extends BaseOutboundSetting {
  private String domainStrategy;
  private String redirect;
  private Integer userLevel;

}
