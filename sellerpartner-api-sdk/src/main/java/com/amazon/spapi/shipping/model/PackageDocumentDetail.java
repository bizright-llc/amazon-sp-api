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
 * The post-purchase details of a package that will be shipped using a shipping service.
 */
@ApiModel(description = "The post-purchase details of a package that will be shipped using a shipping service.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-27T19:00:59.419+08:00")
public class PackageDocumentDetail {
  @SerializedName("packageClientReferenceId")
  private String packageClientReferenceId = null;

  @SerializedName("packageDocuments")
  private PackageDocumentList packageDocuments = null;

  @SerializedName("trackingId")
  private String trackingId = null;

  public PackageDocumentDetail packageClientReferenceId(String packageClientReferenceId) {
    this.packageClientReferenceId = packageClientReferenceId;
    return this;
  }

   /**
   * Get packageClientReferenceId
   * @return packageClientReferenceId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPackageClientReferenceId() {
    return packageClientReferenceId;
  }

  public void setPackageClientReferenceId(String packageClientReferenceId) {
    this.packageClientReferenceId = packageClientReferenceId;
  }

  public PackageDocumentDetail packageDocuments(PackageDocumentList packageDocuments) {
    this.packageDocuments = packageDocuments;
    return this;
  }

   /**
   * Get packageDocuments
   * @return packageDocuments
  **/
  @ApiModelProperty(required = true, value = "")
  public PackageDocumentList getPackageDocuments() {
    return packageDocuments;
  }

  public void setPackageDocuments(PackageDocumentList packageDocuments) {
    this.packageDocuments = packageDocuments;
  }

  public PackageDocumentDetail trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @ApiModelProperty(value = "")
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageDocumentDetail packageDocumentDetail = (PackageDocumentDetail) o;
    return Objects.equals(this.packageClientReferenceId, packageDocumentDetail.packageClientReferenceId) &&
        Objects.equals(this.packageDocuments, packageDocumentDetail.packageDocuments) &&
        Objects.equals(this.trackingId, packageDocumentDetail.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageClientReferenceId, packageDocuments, trackingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageDocumentDetail {\n");
    
    sb.append("    packageClientReferenceId: ").append(toIndentedString(packageClientReferenceId)).append("\n");
    sb.append("    packageDocuments: ").append(toIndentedString(packageDocuments)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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
