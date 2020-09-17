package com.sensetime.evoa.gateway.model;
import java.util.List;

/**
 * @author sunBing
 * @date 2020/6/9 0009
 */
public class Ext {

    private List<Roles> roles;
    private List<Permissions> permissions;
    private Identity identity;
    public void setRoles(List<Roles> roles) {
         this.roles = roles;
     }
     public List<Roles> getRoles() {
         return roles;
     }

    public void setPermissions(List<Permissions> permissions) {
         this.permissions = permissions;
     }
     public List<Permissions> getPermissions() {
         return permissions;
     }

    public void setIdentity(Identity identity) {
         this.identity = identity;
     }
     public Identity getIdentity() {
         return identity;
     }

}