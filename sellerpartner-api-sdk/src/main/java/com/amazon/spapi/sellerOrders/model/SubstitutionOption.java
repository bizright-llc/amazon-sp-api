/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API supports orders that are two years old or less. Orders more than two years old will not show in the API response.  **Note:** The Orders API supports orders from 2016 and after for the JP, AU, and SG marketplaces.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.sellerOrders.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Substitution options for an order item.
 */
@ApiModel(description = "Substitution options for an order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-07T14:29:58.712+08:00")
public class SubstitutionOption {
  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("QuantityOrdered")
  private Integer quantityOrdered = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("Measurement")
  private Measurement measurement = null;

  public SubstitutionOption ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public SubstitutionOption quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The number of items to be picked for this substitution option. 
   * @return quantityOrdered
  **/
  @ApiModelProperty(value = "The number of items to be picked for this substitution option. ")
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }

  public SubstitutionOption sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller stock keeping unit (SKU) of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public SubstitutionOption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the item.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the item.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SubstitutionOption measurement(Measurement measurement) {
    this.measurement = measurement;
    return this;
  }

   /**
   * Measurement information for the substitution option.
   * @return measurement
  **/
  @ApiModelProperty(value = "Measurement information for the substitution option.")
  public Measurement getMeasurement() {
    return measurement;
  }

  public void setMeasurement(Measurement measurement) {
    this.measurement = measurement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstitutionOption substitutionOption = (SubstitutionOption) o;
    return Objects.equals(this.ASIN, substitutionOption.ASIN) &&
        Objects.equals(this.quantityOrdered, substitutionOption.quantityOrdered) &&
        Objects.equals(this.sellerSKU, substitutionOption.sellerSKU) &&
        Objects.equals(this.title, substitutionOption.title) &&
        Objects.equals(this.measurement, substitutionOption.measurement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, quantityOrdered, sellerSKU, title, measurement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstitutionOption {\n");
    
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
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
