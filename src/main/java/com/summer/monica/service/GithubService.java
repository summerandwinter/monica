package com.summer.monica.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.summer.monica.common.Constants;
import com.summer.monica.model.github.Release;
import java.io.IOException;
import java.net.URL;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/25
 */
public class GithubService {
  private static ObjectMapper mapper = new ObjectMapper();
  static {
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
  }
  public static String getLatestDownloadUrl() {
    String url = "";
    try {
      Release release = mapper.readValue(new URL(Constants.GITHUB_RELEASE_URL), Release.class);
      if (release != null && release.getAssets().size() > 0) {
        url = release.getAssets().get(0).getBrowserDownloadUrl();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return url;
  }

}
