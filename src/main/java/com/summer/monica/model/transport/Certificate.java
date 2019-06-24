package com.summer.monica.model.transport;

import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class Certificate {

  private String usage;
  private String certificateFile;
  private String keyFile;
  private String[] certificate;
  private String[] key;

}
