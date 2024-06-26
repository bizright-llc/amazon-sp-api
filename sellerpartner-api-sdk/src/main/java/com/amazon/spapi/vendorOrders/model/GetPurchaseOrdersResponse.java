/*
 * Selling Partner API for Retail Procurement Orders
 * The Selling Partner API for Retail Procurement Orders provides programmatic access to vendor orders data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.vendorOrders.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The response schema for the getPurchaseOrders operation.
 */
@ApiModel(description = "The response schema for the getPurchaseOrders operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-25T18:31:25.555+08:00")
public class GetPurchaseOrdersResponse {
  @SerializedName("payload")
  private OrderList payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetPurchaseOrdersResponse payload(OrderList payload) {
    this.payload = payload;
    return this;
  }

   /**
   * A list of orders.
   * @return payload
  **/
  @ApiModelProperty(value = "A list of orders.")
  public OrderList getPayload() {
    return payload;
  }

  public void setPayload(OrderList payload) {
    this.payload = payload;
  }

  public GetPurchaseOrdersResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPurchaseOrdersResponse getPurchaseOrdersResponse = (GetPurchaseOrdersResponse) o;
    return Objects.equals(this.payload, getPurchaseOrdersResponse.payload) &&
        Objects.equals(this.errors, getPurchaseOrdersResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPurchaseOrdersResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

