package com.summer.monica.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.summer.monica.model.outbounds.Mux;
import com.summer.monica.model.outbounds.ProxySettings;
import com.summer.monica.model.protocol.blackhole.BlackHoleOutbound;
import com.summer.monica.model.protocol.dekodemo.DekoDemoInbound;
import com.summer.monica.model.protocol.dns.DnsOutbound;
import com.summer.monica.model.protocol.freedom.FreedomOutbound;
import com.summer.monica.model.protocol.mtproto.MtProtoOutbound;
import com.summer.monica.model.protocol.shadowscoks.ShadowSocksOutbound;
import com.summer.monica.model.protocol.socks.SocksOutbound;
import com.summer.monica.model.protocol.vmess.VmessOutbound;
import com.summer.monica.model.transport.StreamSetting;
import lombok.Data;

/**
 * @author summerandwinter
 * @date 2019/6/24
 */
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "protocol", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = VmessOutbound.class, name = "vmess"),
    @JsonSubTypes.Type(value = ShadowSocksOutbound.class, name = "shadowsocks"),
    @JsonSubTypes.Type(value = MtProtoOutbound.class, name = "mtproto"),
    @JsonSubTypes.Type(value = SocksOutbound.class, name = "socks"),
    @JsonSubTypes.Type(value = DekoDemoInbound.class, name = "dokodemo-door"),
    @JsonSubTypes.Type(value = BlackHoleOutbound.class, name = "blackhole"),
    @JsonSubTypes.Type(value = DnsOutbound.class, name = "dns"),
    @JsonSubTypes.Type(value = FreedomOutbound.class, name = "freedom")
})
public class Outbound {
  private String sendThrough;
  private String protocol;
  private String tag;
  private StreamSetting streamSettings;
  private ProxySettings proxySettings;
  private Mux mux;

}
