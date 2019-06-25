package com.summer.monica.model.protocol.vmess;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.summer.monica.model.inbounds.BaseInboundSetting;
import java.util.List;
import lombok.Data;

/**
 *
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class VmessInboundSetting extends BaseInboundSetting {
  private List<Client> clients;
  @JsonProperty(value = "default")
  private Default defaultValue;
  private Detour detour;
  private Boolean disableInsecureEncryption;

}
