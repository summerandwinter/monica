package com.summer.monica.model.protocol.vmess;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class Client {
  private String id;
  private Integer level;
  private Integer alterId;
  private String email;

}
