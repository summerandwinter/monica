package com.monica.model;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class InboundConfiguration {

  private String email;
  private String method;
  private String password;
  private Integer level;
  private Boolean ota;
  private String network;

}
