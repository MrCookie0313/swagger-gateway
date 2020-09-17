package com.sensetime.evoa.gateway.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @author sunBing
 * @date 2020/6/9 0009
 */
public class Identity {

    @JsonProperty("created_at")
    private Date createdAt;
    private String id;
    private String name;
    private boolean status;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("family_name")
    private String familyName;
    @JsonProperty("updated_at")
    private Date updatedAt;
    private String email;
    @JsonProperty("identity_type")
    private String identityType;
    @JsonProperty("given_name")
    private String givenName;
    @JsonProperty("billing_date")
    private int billingDate;
    public void setCreatedAt(Date createdAt) {
         this.createdAt = createdAt;
     }
     public Date getCreatedAt() {
         return createdAt;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setStatus(boolean status) {
         this.status = status;
     }
     public boolean getStatus() {
         return status;
     }

    public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }
     public String getPhoneNumber() {
         return phoneNumber;
     }

    public void setFamilyName(String familyName) {
         this.familyName = familyName;
     }
     public String getFamilyName() {
         return familyName;
     }

    public void setUpdatedAt(Date updatedAt) {
         this.updatedAt = updatedAt;
     }
     public Date getUpdatedAt() {
         return updatedAt;
     }

    public void setEmail(String email) {
         this.email = email;
     }
     public String getEmail() {
         return email;
     }

    public void setIdentityType(String identityType) {
         this.identityType = identityType;
     }
     public String getIdentityType() {
         return identityType;
     }

    public void setGivenName(String givenName) {
         this.givenName = givenName;
     }
     public String getGivenName() {
         return givenName;
     }

    public void setBillingDate(int billingDate) {
         this.billingDate = billingDate;
     }
     public int getBillingDate() {
         return billingDate;
     }

}