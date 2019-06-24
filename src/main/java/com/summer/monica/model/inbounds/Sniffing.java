package com.summer.monica.model.inbounds;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Sniffing {

  private Boolean enabled;
  private String[] destOverride;

}
