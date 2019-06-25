package com.summer.monica.model.protocol.socks;

import com.summer.monica.model.inbounds.BaseInboundSetting;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class SocksInboundSetting extends BaseInboundSetting {
  private String auth;
  private Boolean udp;
  private String ip;
  private Integer userLevel;
  private List<Account> accounts;

}
