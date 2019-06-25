package com.summer.monica.model.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/25
 */
@Data
public class Asset {

  @JsonProperty("browser_download_url")
  private String browserDownloadUrl;

}
