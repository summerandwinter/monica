package com.summer.monica.model;

import com.summer.monica.model.outbounds.Mux;
import com.summer.monica.model.outbounds.OutboundConfig;
import com.summer.monica.model.outbounds.ProxySettings;
import com.summer.monica.model.transport.StreamSetting;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Outbound {
  private String sendThrough;
  private String protocol;
  private String tag;
  private StreamSetting streamSettings;
  private OutboundConfig settings;
  private ProxySettings proxySettings;
  private Mux mux;

}
