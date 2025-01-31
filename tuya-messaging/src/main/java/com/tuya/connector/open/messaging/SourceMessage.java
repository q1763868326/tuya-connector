package com.tuya.connector.open.messaging;

import java.io.Serializable;

/**
 * <p> TODO
 *
 * @author 丘枫（余秋风 qiufeng.yu@tuya.com）
 * @since 2021/3/24 5:35 下午
 */
public class SourceMessage implements Serializable {

    private String data;
    private Integer protocol;
    private String pv;
    private String sign;
    private Long t;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public String getPv() {
        return pv;
    }

    public void setPv(String pv) {
        this.pv = pv;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Long getT() {
        return t;
    }

    public void setT(Long t) {
        this.t = t;
    }


    @Override
    public String toString() {
        return "MessageVO{" +
            "data='" + data + '\'' +
            ", protocol=" + protocol +
            ", pv='" + pv + '\'' +
            ", sign='" + sign + '\'' +
            ", t=" + t +
            '}';
    }
}
