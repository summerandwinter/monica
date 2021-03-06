package com.summer.monica.model;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
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
