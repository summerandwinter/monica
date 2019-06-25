package com.summer.monica.model.protocol.mtproto;

import com.summer.monica.model.inbounds.BaseInboundSetting;
import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class MtProtoInboundSetting extends BaseInboundSetting {
  private List<User> users;
}
