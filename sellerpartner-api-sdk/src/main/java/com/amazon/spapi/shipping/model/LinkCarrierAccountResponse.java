/*
 * Amazon Shipping API
 * The Amazon Shipping API is designed to support outbound shipping use cases both for orders originating on Amazon-owned marketplaces as well as external channels/marketplaces. With these APIs, you can request shipping rates, create shipments, cancel shipments, and track shipments.
 *
 * OpenAPI spec version: v2
 * Contact: swa-api-core@amazon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.shipping.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The Response  for the LinkCarrierAccount operation.
 */
@ApiModel(description = "The Response  for the LinkCarrierAccount operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-27T19:00:59.419+08:00")
public class LinkCarrierAccountResponse {
  @SerializedName("registrationStatus")
  private AccountStatus registrationStatus = null;

  public LinkCarrierAccountResponse registrationStatus(AccountStatus registrationStatus) {
    this.registrationStatus = registrationStatus;
    return this;
  }

   /**
   * Get registrationStatus
   * @return registrationStatus
  **/
  @ApiModelProperty(value = "")
  public AccountStatus getRegistrationStatus() {
    return registrationStatus;
  }

  public void setRegistrationStatus(AccountStatus registrationStatus) {
    this.registrationStatus = registrationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkCarrierAccountResponse linkCarrierAccountResponse = (LinkCarrierAccountResponse) o;
    return Objects.equals(this.registrationStatus, linkCarrierAccountResponse.registrationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkCarrierAccountResponse {\n");
    
    sb.append("    registrationStatus: ").append(toIndentedString(registrationStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

