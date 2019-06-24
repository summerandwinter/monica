package com.summer.monica.model.transport;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Sockopt {
  private Integer mark;
  private Boolean tcpFastOpen;
  private String tproxy;

}
