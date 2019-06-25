package com.summer.monica.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.summer.monica.common.Constants;
import com.summer.monica.model.V2rayConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
public class InboundService {
  private static ObjectMapper mapper = new ObjectMapper();

  public static V2rayConfig getInbounds() {
    V2rayConfig resp = null;
    try {
      byte[] data = Files.readAllBytes(Paths.get(Constants.V2RAY_CONFIG_PATH));
      String content = new String(data, StandardCharsets.UTF_8);
      resp = mapper.readValue(content, V2rayConfig.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return resp;
  }


 }