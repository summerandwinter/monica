package com.summer.monica.model.inbounds;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Allocate {

  private String strategy;
  private Integer refresh;
  private Integer concurrency;

}
