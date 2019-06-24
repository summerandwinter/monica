package com.summer.monica.model;

import com.summer.monica.model.inbounds.Allocate;
import com.summer.monica.model.inbounds.InboundConfig;
import com.summer.monica.model.inbounds.Sniffing;
import com.summer.monica.model.transport.StreamSetting;
import java.util.Map;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Inbound {

  private String port;
  private String listen;
  private String protocol;
  private String tag;
  private Map<String, Object> streamSettings;
  private Sniffing sniffing;
  private Allocate allocate;
  private Map<String, Object> settings;
  private String remark;

}
