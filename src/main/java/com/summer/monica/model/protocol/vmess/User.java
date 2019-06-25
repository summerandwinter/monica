package com.summer.monica.model.protocol.vmess;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class User {
  private String id;
  private Integer alterId;
  private String security;
  private Integer level;

}
