package com.summer.monica.model.policy;

import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
public class LevelPolicy {
  private Integer handshake;
  private Integer connIdle;
  private Integer uplinkOnly;
  private Integer downlinkOnly;
  private Boolean statsUserUplink;
  private Boolean statsUserDownlink;
  private Integer bufferSize;

}
