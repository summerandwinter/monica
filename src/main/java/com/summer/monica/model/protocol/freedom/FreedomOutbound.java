package com.summer.monica.model.protocol.freedom;

import com.summer.monica.model.Outbound;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class FreedomOutbound extends Outbound {
  private FreedomOutboundSetting settings;

}
