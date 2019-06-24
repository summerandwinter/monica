package com.summer.monica.model.inbounds;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.summer.monica.model.protocol.mtproto.MTProtoInbound;
import com.summer.monica.model.protocol.shadowscoks.ShadowsocksInbound;
import com.summer.monica.model.protocol.socks.SocksInbound;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/24
 */
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "typeName")
@JsonSubTypes({
    @JsonSubTypes.Type(value = SocksInbound.class, name = "socks"),
    @JsonSubTypes.Type(value = ShadowsocksInbound.class, name = "shadowsocks"),
    @JsonSubTypes.Type(value = MTProtoInbound.class, name = "mtproto")
})
public class InboundConfig {

}
