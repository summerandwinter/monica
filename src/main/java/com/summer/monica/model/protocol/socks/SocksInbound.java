package com.summer.monica.model.protocol.socks;

import java.util.List;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class SocksInbound {
  private String auth;
  private Boolean udp;
  private String ip;
  private Integer userLevel;
  private List<Account> accounts;

}
