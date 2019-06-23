package com.monica.service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.monica.common.Constants;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
public class InboundService {

  public static JsonObject getInbounds() {
    JsonObject resp = new JsonObject();
    try {
      byte[] data = Files.readAllBytes(Paths.get(Constants.V2RAY_CONFIG_PATH));
      String content = new String(data, StandardCharsets.UTF_8);
      resp = (JsonObject) new JsonParser().parse(content);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return resp;
  }
}
