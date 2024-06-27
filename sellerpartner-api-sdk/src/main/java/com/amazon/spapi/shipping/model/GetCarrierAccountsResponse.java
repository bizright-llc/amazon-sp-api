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
 * The Response  for the GetCarrierAccountsResponse operation.
 */
@ApiModel(description = "The Response  for the GetCarrierAccountsResponse operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-27T19:00:59.419+08:00")
public class GetCarrierAccountsResponse {
  @SerializedName("activeAccounts")
  private ActiveAccounts activeAccounts = null;

  public GetCarrierAccountsResponse activeAccounts(ActiveAccounts activeAccounts) {
    this.activeAccounts = activeAccounts;
    return this;
  }

   /**
   * Get activeAccounts
   * @return activeAccounts
  **/
  @ApiModelProperty(required = true, value = "")
  public ActiveAccounts getActiveAccounts() {
    return activeAccounts;
  }

  public void setActiveAccounts(ActiveAccounts activeAccounts) {
    this.activeAccounts = activeAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCarrierAccountsResponse getCarrierAccountsResponse = (GetCarrierAccountsResponse) o;
    return Objects.equals(this.activeAccounts, getCarrierAccountsResponse.activeAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCarrierAccountsResponse {\n");
    
    sb.append("    activeAccounts: ").append(toIndentedString(activeAccounts)).append("\n");
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

