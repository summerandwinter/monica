package com.summer.monica.model.transport;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class Kcp {
  private Integer mtu;
  private Integer tti;
  private Integer uplinkCapacity;
  private Integer downlinkCapacity;
  private Boolean congestion;
  private Integer readBufferSize;
  private Integer writeBufferSize;
  private Header header;

}
