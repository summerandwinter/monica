package com.summer.monica.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.summer.monica.model.inbounds.BaseInboundSetting;
import com.summer.monica.model.protocol.shadowscoks.ShadowSocksInboundSetting;
import com.summer.monica.model.protocol.socks.SocksInboundSetting;
import com.summer.monica.model.protocol.vmess.VmessInboundSetting;
import java.io.IOException;

/**
 *
 * 1. add @JsonDeserialize(using = SettingDeserializer.class) to super class
 * 2. @JsonDeserialize(as = (ShadowSocksInboundSetting.class))
 * @link https://stackoverflow.com/questions/29371384/custom-jsondeserializer-using-inheritance-causes-stackoverflowerror
 * @author summerandwinter
 * @date 2019/6/25
 */
public class SettingDeserializer  extends JsonDeserializer<BaseInboundSetting> {

  private static final String SHADOW_SOCKS_ID = "method";
  private static final String V_MESS_ID = "clients";
  private static final String SOCKS_ID = "auth";


  private ObjectMapper mapper = new ObjectMapper();
  @Override
  public BaseInboundSetting deserialize(JsonParser jsonParser,
      DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
    JsonNode node = jsonParser.getCodec().readTree(jsonParser);
    if (node.has(SHADOW_SOCKS_ID)) {
      return mapper.treeToValue(node, ShadowSocksInboundSetting.class);
    } else if (node.has(V_MESS_ID)) {
      return mapper.treeToValue(node, VmessInboundSetting.class);
    } else if (node.has(SOCKS_ID)) {
      return mapper.treeToValue(node, SocksInboundSetting.class);
    }
    return null;
  }
}
