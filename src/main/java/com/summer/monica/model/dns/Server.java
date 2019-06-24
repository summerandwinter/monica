package com.summer.monica.model.dns;

import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Server {

  private String address;
  private Integer port;
  private List<String> domains;

}
