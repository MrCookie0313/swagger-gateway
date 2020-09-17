package com.sensetime.evoa.gateway.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
/**
 * @author sunBing
 * @date 2020/6/9 0009
 */
public class JwtHeaderBean {

    private int iat;
    private String iss;
    private List<String> aud;
    private String nonce;
    private String sid;
    @JsonProperty("at_hash")
    private String atHash;
    @JsonProperty("auth_time")
    private int authTime;
    private Ext ext;
    private int exp;
    private String jti;
    private String sub;
    private int rat;
    public void setIat(int iat) {
         this.iat = iat;
     }
     public int getIat() {
         return iat;
     }

    public void setIss(String iss) {
         this.iss = iss;
     }
     public String getIss() {
         return iss;
     }

    public void setAud(List<String> aud) {
         this.aud = aud;
     }
     public List<String> getAud() {
         return aud;
     }

    public void setNonce(String nonce) {
         this.nonce = nonce;
     }
     public String getNonce() {
         return nonce;
     }

    public void setSid(String sid) {
         this.sid = sid;
     }
     public String getSid() {
         return sid;
     }

    public void setAtHash(String atHash) {
         this.atHash = atHash;
     }
     public String getAtHash() {
         return atHash;
     }

    public void setAuthTime(int authTime) {
         this.authTime = authTime;
     }
     public int getAuthTime() {
         return authTime;
     }

    public void setExt(Ext ext) {
         this.ext = ext;
     }
     public Ext getExt() {
         return ext;
     }

    public void setExp(int exp) {
         this.exp = exp;
     }
     public int getExp() {
         return exp;
     }

    public void setJti(String jti) {
         this.jti = jti;
     }
     public String getJti() {
         return jti;
     }

    public void setSub(String sub) {
         this.sub = sub;
     }
     public String getSub() {
         return sub;
     }

    public void setRat(int rat) {
         this.rat = rat;
     }
     public int getRat() {
         return rat;
     }

}