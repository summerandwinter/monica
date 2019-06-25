package com.summer.monica.model.protocol.http;

import com.summer.monica.model.inbounds.BaseInboundSetting;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class HttpInboundSetting extends BaseInboundSetting {
  private Integer timeout;
  private List<Account> accounts;
  private Boolean allowTransparent;
  private Integer userLevel;

}
