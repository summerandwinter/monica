package com.summer.monica.model.protocol.shadowscoks;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Server {
  private String email;
  private String address;
  private Integer port;
  private String method;
  private String password;
  private Boolean ota;
  private Integer level;

}
