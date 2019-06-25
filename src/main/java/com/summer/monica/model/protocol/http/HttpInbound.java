package com.summer.monica.model.protocol.http;

import com.summer.monica.model.Inbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class HttpInbound extends Inbound {
  private HttpInboundSetting settings;

}
