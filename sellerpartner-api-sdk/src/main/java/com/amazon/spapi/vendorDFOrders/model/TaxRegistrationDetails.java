/*
 * Selling Partner API for Direct Fulfillment Orders
 * The Selling Partner API for Direct Fulfillment Orders provides programmatic access to a direct fulfillment vendor's order data.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.vendorDFOrders.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Tax registration details of the entity.
 */
@ApiModel(description = "Tax registration details of the entity.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-26T09:21:51.838+08:00")
public class TaxRegistrationDetails {
  /**
   * Tax registration type for the entity.
   */
  @JsonAdapter(TaxRegistrationTypeEnum.Adapter.class)
  public enum TaxRegistrationTypeEnum {
    VAT("VAT"),
    
    GST("GST");

    private String value;

    TaxRegistrationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxRegistrationTypeEnum fromValue(String text) {
      for (TaxRegistrationTypeEnum b : TaxRegistrationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TaxRegistrationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxRegistrationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxRegistrationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TaxRegistrationTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("taxRegistrationType")
  private TaxRegistrationTypeEnum taxRegistrationType = null;

  @SerializedName("taxRegistrationNumber")
  private String taxRegistrationNumber = null;

  @SerializedName("taxRegistrationAddress")
  private Address taxRegistrationAddress = null;

  @SerializedName("taxRegistrationMessages")
  private String taxRegistrationMessages = null;

  public TaxRegistrationDetails taxRegistrationType(TaxRegistrationTypeEnum taxRegistrationType) {
    this.taxRegistrationType = taxRegistrationType;
    return this;
  }

   /**
   * Tax registration type for the entity.
   * @return taxRegistrationType
  **/
  @ApiModelProperty(value = "Tax registration type for the entity.")
  public TaxRegistrationTypeEnum getTaxRegistrationType() {
    return taxRegistrationType;
  }

  public void setTaxRegistrationType(TaxRegistrationTypeEnum taxRegistrationType) {
    this.taxRegistrationType = taxRegistrationType;
  }

  public TaxRegistrationDetails taxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
    return this;
  }

   /**
   * Tax registration number for the party. For example, VAT ID.
   * @return taxRegistrationNumber
  **/
  @ApiModelProperty(required = true, value = "Tax registration number for the party. For example, VAT ID.")
  public String getTaxRegistrationNumber() {
    return taxRegistrationNumber;
  }

  public void setTaxRegistrationNumber(String taxRegistrationNumber) {
    this.taxRegistrationNumber = taxRegistrationNumber;
  }

  public TaxRegistrationDetails taxRegistrationAddress(Address taxRegistrationAddress) {
    this.taxRegistrationAddress = taxRegistrationAddress;
    return this;
  }

   /**
   * Address associated with the tax registration number.
   * @return taxRegistrationAddress
  **/
  @ApiModelProperty(value = "Address associated with the tax registration number.")
  public Address getTaxRegistrationAddress() {
    return taxRegistrationAddress;
  }

  public void setTaxRegistrationAddress(Address taxRegistrationAddress) {
    this.taxRegistrationAddress = taxRegistrationAddress;
  }

  public TaxRegistrationDetails taxRegistrationMessages(String taxRegistrationMessages) {
    this.taxRegistrationMessages = taxRegistrationMessages;
    return this;
  }

   /**
   * Tax registration message that can be used for additional tax related details.
   * @return taxRegistrationMessages
  **/
  @ApiModelProperty(value = "Tax registration message that can be used for additional tax related details.")
  public String getTaxRegistrationMessages() {
    return taxRegistrationMessages;
  }

  public void setTaxRegistrationMessages(String taxRegistrationMessages) {
    this.taxRegistrationMessages = taxRegistrationMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRegistrationDetails taxRegistrationDetails = (TaxRegistrationDetails) o;
    return Objects.equals(this.taxRegistrationType, taxRegistrationDetails.taxRegistrationType) &&
        Objects.equals(this.taxRegistrationNumber, taxRegistrationDetails.taxRegistrationNumber) &&
        Objects.equals(this.taxRegistrationAddress, taxRegistrationDetails.taxRegistrationAddress) &&
        Objects.equals(this.taxRegistrationMessages, taxRegistrationDetails.taxRegistrationMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRegistrationType, taxRegistrationNumber, taxRegistrationAddress, taxRegistrationMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRegistrationDetails {\n");
    
    sb.append("    taxRegistrationType: ").append(toIndentedString(taxRegistrationType)).append("\n");
    sb.append("    taxRegistrationNumber: ").append(toIndentedString(taxRegistrationNumber)).append("\n");
    sb.append("    taxRegistrationAddress: ").append(toIndentedString(taxRegistrationAddress)).append("\n");
    sb.append("    taxRegistrationMessages: ").append(toIndentedString(taxRegistrationMessages)).append("\n");
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

