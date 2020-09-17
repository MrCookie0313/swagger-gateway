package com.sensetime.evoa.gateway.model;

/**
 * @author sunBing
 * @date 2020/6/9 0009
 */
public class Permissions {

    private String resource;
    private String domain;
    private String action;
    public void setResource(String resource) {
         this.resource = resource;
     }
     public String getResource() {
         return resource;
     }

    public void setDomain(String domain) {
         this.domain = domain;
     }
     public String getDomain() {
         return domain;
     }

    public void setAction(String action) {
         this.action = action;
     }
     public String getAction() {
         return action;
     }

}