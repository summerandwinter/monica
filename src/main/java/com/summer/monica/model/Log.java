package com.summer.monica.model;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Log {

  private String access;
  private String error;
  private String loglevel;

}
