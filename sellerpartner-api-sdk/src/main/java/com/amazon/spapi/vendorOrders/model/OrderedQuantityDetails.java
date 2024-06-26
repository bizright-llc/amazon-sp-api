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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Details of item quantity ordered
 */
@ApiModel(description = "Details of item quantity ordered")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-25T18:31:25.555+08:00")
public class OrderedQuantityDetails {
  @SerializedName("updatedDate")
  private OffsetDateTime updatedDate = null;

  @SerializedName("orderedQuantity")
  private ItemQuantity orderedQuantity = null;

  @SerializedName("cancelledQuantity")
  private ItemQuantity cancelledQuantity = null;

  public OrderedQuantityDetails updatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

   /**
   * The date when the line item quantity was updated by buyer. Must be in ISO-8601 date/time format.
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date when the line item quantity was updated by buyer. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(OffsetDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  public OrderedQuantityDetails orderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
    return this;
  }

   /**
   * Item quantity ordered.
   * @return orderedQuantity
  **/
  @ApiModelProperty(value = "Item quantity ordered.")
  public ItemQuantity getOrderedQuantity() {
    return orderedQuantity;
  }

  public void setOrderedQuantity(ItemQuantity orderedQuantity) {
    this.orderedQuantity = orderedQuantity;
  }

  public OrderedQuantityDetails cancelledQuantity(ItemQuantity cancelledQuantity) {
    this.cancelledQuantity = cancelledQuantity;
    return this;
  }

   /**
   * Item quantity ordered.
   * @return cancelledQuantity
  **/
  @ApiModelProperty(value = "Item quantity ordered.")
  public ItemQuantity getCancelledQuantity() {
    return cancelledQuantity;
  }

  public void setCancelledQuantity(ItemQuantity cancelledQuantity) {
    this.cancelledQuantity = cancelledQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderedQuantityDetails orderedQuantityDetails = (OrderedQuantityDetails) o;
    return Objects.equals(this.updatedDate, orderedQuantityDetails.updatedDate) &&
        Objects.equals(this.orderedQuantity, orderedQuantityDetails.orderedQuantity) &&
        Objects.equals(this.cancelledQuantity, orderedQuantityDetails.cancelledQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedDate, orderedQuantity, cancelledQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderedQuantityDetails {\n");
    
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    orderedQuantity: ").append(toIndentedString(orderedQuantity)).append("\n");
    sb.append("    cancelledQuantity: ").append(toIndentedString(cancelledQuantity)).append("\n");
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

