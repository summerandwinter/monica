package com.summer.monica.service;


import com.summer.monica.common.Constants;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
public class InboundService {

  public static String getInbounds() {
    String resp = "{}";
    try {
      byte[] data = Files.readAllBytes(Paths.get(Constants.V2RAY_CONFIG_PATH));
      String content = new String(data, StandardCharsets.UTF_8);
      resp = content;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return resp;
  }
}