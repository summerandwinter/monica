package com.summer.monica.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

  public static V2rayConfig getInbounds() {
    V2rayConfig resp = null;
    try {
      ObjectMapper mapper = new ObjectMapper();
      Gson gson = new GsonBuilder()
          .setLenient() // json宽松
          //支持Map的key为复杂对象的形式
          .enableComplexMapKeySerialization()
          .serializeNulls()  //智能null
          .setPrettyPrinting()  // 调教格式
          //默认是GSON把HTML 转义的
          .disableHtmlEscaping()
          .create();
      byte[] data = Files.readAllBytes(Paths.get(Constants.V2RAY_CONFIG_PATH));
      String content = new String(data, StandardCharsets.UTF_8);
      resp = gson.fromJson(content, V2rayConfig.class);
      // resp = mapper.readValue(content, V2rayConfig.class);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return resp;
  }
}