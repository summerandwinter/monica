package com.summer.monica.model.protocol.mtproto;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class User {
  private String email;
  private Integer level;
  private String secret;

}
