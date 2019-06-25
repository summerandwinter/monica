package com.summer.monica.model.github;

import java.util.List;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/25
 */
@Data
public class Release {
  private List<Asset> assets;

}
