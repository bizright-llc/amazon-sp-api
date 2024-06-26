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
 * Substitution preferences for an order item.
 */
@ApiModel(description = "Substitution preferences for an order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-07T14:29:58.712+08:00")
public class SubstitutionPreferences {
  /**
   * The type of substitution that these preferences represent.
   */
  @JsonAdapter(SubstitutionTypeEnum.Adapter.class)
  public enum SubstitutionTypeEnum {
    CUSTOMER_PREFERENCE("CUSTOMER_PREFERENCE"),
    
    AMAZON_RECOMMENDED("AMAZON_RECOMMENDED"),
    
    DO_NOT_SUBSTITUTE("DO_NOT_SUBSTITUTE");

    private String value;

    SubstitutionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubstitutionTypeEnum fromValue(String text) {
      for (SubstitutionTypeEnum b : SubstitutionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubstitutionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubstitutionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubstitutionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubstitutionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SubstitutionType")
  private SubstitutionTypeEnum substitutionType = null;

  @SerializedName("SubstitutionOptions")
  private SubstitutionOptionList substitutionOptions = null;

  public SubstitutionPreferences substitutionType(SubstitutionTypeEnum substitutionType) {
    this.substitutionType = substitutionType;
    return this;
  }

   /**
   * The type of substitution that these preferences represent.
   * @return substitutionType
  **/
  @ApiModelProperty(required = true, value = "The type of substitution that these preferences represent.")
  public SubstitutionTypeEnum getSubstitutionType() {
    return substitutionType;
  }

  public void setSubstitutionType(SubstitutionTypeEnum substitutionType) {
    this.substitutionType = substitutionType;
  }

  public SubstitutionPreferences substitutionOptions(SubstitutionOptionList substitutionOptions) {
    this.substitutionOptions = substitutionOptions;
    return this;
  }

   /**
   * Substitution options for the order item.
   * @return substitutionOptions
  **/
  @ApiModelProperty(value = "Substitution options for the order item.")
  public SubstitutionOptionList getSubstitutionOptions() {
    return substitutionOptions;
  }

  public void setSubstitutionOptions(SubstitutionOptionList substitutionOptions) {
    this.substitutionOptions = substitutionOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubstitutionPreferences substitutionPreferences = (SubstitutionPreferences) o;
    return Objects.equals(this.substitutionType, substitutionPreferences.substitutionType) &&
        Objects.equals(this.substitutionOptions, substitutionPreferences.substitutionOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(substitutionType, substitutionOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubstitutionPreferences {\n");
    
    sb.append("    substitutionType: ").append(toIndentedString(substitutionType)).append("\n");
    sb.append("    substitutionOptions: ").append(toIndentedString(substitutionOptions)).append("\n");
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

