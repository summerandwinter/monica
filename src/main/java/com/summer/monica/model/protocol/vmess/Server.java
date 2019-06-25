package com.summer.monica.model.protocol.vmess;

import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/25
 */
@Data
public class Server {
  private String address;
  private Integer port;
  private List<User> users;

}
