package com.summer.monica.model.transport;

import java.util.List;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
public class TLS {
  private String serverName;
  private String allowInsecure;
  private List<String> alpn;
  private Certificate certificates;
  private Boolean disableSystemRoot;

}
