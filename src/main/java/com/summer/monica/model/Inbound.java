package com.summer.monica.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.summer.monica.model.inbounds.Allocate;
import com.summer.monica.model.inbounds.Sniffing;
import com.summer.monica.model.protocol.dekodemo.DekoDemoInbound;
import com.summer.monica.model.protocol.http.HttpInbound;
import com.summer.monica.model.protocol.mtproto.MtProtoInbound;
import com.summer.monica.model.protocol.shadowscoks.ShadowSocksInbound;
import com.summer.monica.model.protocol.socks.SockInbound;
import com.summer.monica.model.protocol.vmess.VmessInbound;
import com.summer.monica.model.transport.StreamSetting;
import lombok.Data;

/**
 * @author yi.liu@bmsoft.com.cn
 * @date 2019/6/23
 */
@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "protocol", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = VmessInbound.class, name = "vmess"),
    @JsonSubTypes.Type(value = ShadowSocksInbound.class, name = "shadowsocks"),
    @JsonSubTypes.Type(value = MtProtoInbound.class, name = "mtproto"),
    @JsonSubTypes.Type(value = HttpInbound.class, name = "http"),
    @JsonSubTypes.Type(value = DekoDemoInbound.class, name = "dokodemo-door"),
    @JsonSubTypes.Type(value = SockInbound.class, name = "socks")
})
public class Inbound {
  private String port;
  private String listen;
  private String protocol;
  private String tag;
  private StreamSetting streamSettings;
  private Sniffing sniffing;
  private Allocate allocate;
  private String remark;

}
