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
 * The request schema to get query collections form history API .
 */
@ApiModel(description = "The request schema to get query collections form history API .")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-27T19:00:59.419+08:00")
public class GetCollectionFormHistoryRequest {
  @SerializedName("clientReferenceDetails")
  private ClientReferenceDetails clientReferenceDetails = null;

  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("carrierId")
  private String carrierId = null;

  @SerializedName("shipFromAddress")
  private Address shipFromAddress = null;

  @SerializedName("dateRange")
  private DateRange dateRange = null;

  public GetCollectionFormHistoryRequest clientReferenceDetails(ClientReferenceDetails clientReferenceDetails) {
    this.clientReferenceDetails = clientReferenceDetails;
    return this;
  }

   /**
   * Get clientReferenceDetails
   * @return clientReferenceDetails
  **/
  @ApiModelProperty(value = "")
  public ClientReferenceDetails getClientReferenceDetails() {
    return clientReferenceDetails;
  }

  public void setClientReferenceDetails(ClientReferenceDetails clientReferenceDetails) {
    this.clientReferenceDetails = clientReferenceDetails;
  }

  public GetCollectionFormHistoryRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * max Number of Results for query .
   * @return maxResults
  **/
  @ApiModelProperty(value = "max Number of Results for query .")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public GetCollectionFormHistoryRequest carrierId(String carrierId) {
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Get carrierId
   * @return carrierId
  **/
  @ApiModelProperty(value = "")
  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }

  public GetCollectionFormHistoryRequest shipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
    return this;
  }

   /**
   * Get shipFromAddress
   * @return shipFromAddress
  **/
  @ApiModelProperty(value = "")
  public Address getShipFromAddress() {
    return shipFromAddress;
  }

  public void setShipFromAddress(Address shipFromAddress) {
    this.shipFromAddress = shipFromAddress;
  }

  public GetCollectionFormHistoryRequest dateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

   /**
   * Get dateRange
   * @return dateRange
  **/
  @ApiModelProperty(value = "")
  public DateRange getDateRange() {
    return dateRange;
  }

  public void setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCollectionFormHistoryRequest getCollectionFormHistoryRequest = (GetCollectionFormHistoryRequest) o;
    return Objects.equals(this.clientReferenceDetails, getCollectionFormHistoryRequest.clientReferenceDetails) &&
        Objects.equals(this.maxResults, getCollectionFormHistoryRequest.maxResults) &&
        Objects.equals(this.carrierId, getCollectionFormHistoryRequest.carrierId) &&
        Objects.equals(this.shipFromAddress, getCollectionFormHistoryRequest.shipFromAddress) &&
        Objects.equals(this.dateRange, getCollectionFormHistoryRequest.dateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceDetails, maxResults, carrierId, shipFromAddress, dateRange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCollectionFormHistoryRequest {\n");
    
    sb.append("    clientReferenceDetails: ").append(toIndentedString(clientReferenceDetails)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    shipFromAddress: ").append(toIndentedString(shipFromAddress)).append("\n");
    sb.append("    dateRange: ").append(toIndentedString(dateRange)).append("\n");
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

