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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Details of an order.
 */
@ApiModel(description = "Details of an order.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-06-25T18:31:25.555+08:00")
public class OrderDetails {
  @SerializedName("purchaseOrderDate")
  private OffsetDateTime purchaseOrderDate = null;

  @SerializedName("purchaseOrderChangedDate")
  private OffsetDateTime purchaseOrderChangedDate = null;

  @SerializedName("purchaseOrderStateChangedDate")
  private OffsetDateTime purchaseOrderStateChangedDate = null;

  /**
   * Type of purchase order.
   */
  @JsonAdapter(PurchaseOrderTypeEnum.Adapter.class)
  public enum PurchaseOrderTypeEnum {
    REGULARORDER("RegularOrder"),
    
    CONSIGNEDORDER("ConsignedOrder"),
    
    NEWPRODUCTINTRODUCTION("NewProductIntroduction"),
    
    RUSHORDER("RushOrder");

    private String value;

    PurchaseOrderTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PurchaseOrderTypeEnum fromValue(String text) {
      for (PurchaseOrderTypeEnum b : PurchaseOrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PurchaseOrderTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PurchaseOrderTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PurchaseOrderTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PurchaseOrderTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("purchaseOrderType")
  private PurchaseOrderTypeEnum purchaseOrderType = null;

  @SerializedName("importDetails")
  private ImportDetails importDetails = null;

  @SerializedName("dealCode")
  private String dealCode = null;

  /**
   * Payment method used.
   */
  @JsonAdapter(PaymentMethodEnum.Adapter.class)
  public enum PaymentMethodEnum {
    INVOICE("Invoice"),
    
    CONSIGNMENT("Consignment"),
    
    CREDITCARD("CreditCard"),
    
    PREPAID("Prepaid");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodEnum fromValue(String text) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("paymentMethod")
  private PaymentMethodEnum paymentMethod = null;

  @SerializedName("buyingParty")
  private PartyIdentification buyingParty = null;

  @SerializedName("sellingParty")
  private PartyIdentification sellingParty = null;

  @SerializedName("shipToParty")
  private PartyIdentification shipToParty = null;

  @SerializedName("billToParty")
  private PartyIdentification billToParty = null;

  @SerializedName("shipWindow")
  private String shipWindow = null;

  @SerializedName("deliveryWindow")
  private String deliveryWindow = null;

  @SerializedName("items")
  private List<OrderItem> items = new ArrayList<OrderItem>();

  public OrderDetails purchaseOrderDate(OffsetDateTime purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
    return this;
  }

   /**
   * The date the purchase order was placed. Must be in ISO-8601 date/time format.
   * @return purchaseOrderDate
  **/
  @ApiModelProperty(required = true, value = "The date the purchase order was placed. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getPurchaseOrderDate() {
    return purchaseOrderDate;
  }

  public void setPurchaseOrderDate(OffsetDateTime purchaseOrderDate) {
    this.purchaseOrderDate = purchaseOrderDate;
  }

  public OrderDetails purchaseOrderChangedDate(OffsetDateTime purchaseOrderChangedDate) {
    this.purchaseOrderChangedDate = purchaseOrderChangedDate;
    return this;
  }

   /**
   * The date when purchase order was last changed by Amazon after the order was placed. This date will be greater than &#39;purchaseOrderDate&#39;. This means the PO data was changed on that date and vendors are required to fulfill the  updated PO. The PO changes can be related to Item Quantity, Ship to Location, Ship Window etc. This field will not be present in orders that have not changed after creation. Must be in ISO-8601 date/time format.
   * @return purchaseOrderChangedDate
  **/
  @ApiModelProperty(value = "The date when purchase order was last changed by Amazon after the order was placed. This date will be greater than 'purchaseOrderDate'. This means the PO data was changed on that date and vendors are required to fulfill the  updated PO. The PO changes can be related to Item Quantity, Ship to Location, Ship Window etc. This field will not be present in orders that have not changed after creation. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getPurchaseOrderChangedDate() {
    return purchaseOrderChangedDate;
  }

  public void setPurchaseOrderChangedDate(OffsetDateTime purchaseOrderChangedDate) {
    this.purchaseOrderChangedDate = purchaseOrderChangedDate;
  }

  public OrderDetails purchaseOrderStateChangedDate(OffsetDateTime purchaseOrderStateChangedDate) {
    this.purchaseOrderStateChangedDate = purchaseOrderStateChangedDate;
    return this;
  }

   /**
   * The date when current purchase order state was changed. Current purchase order state is available in the field &#39;purchaseOrderState&#39;. Must be in ISO-8601 date/time format.
   * @return purchaseOrderStateChangedDate
  **/
  @ApiModelProperty(required = true, value = "The date when current purchase order state was changed. Current purchase order state is available in the field 'purchaseOrderState'. Must be in ISO-8601 date/time format.")
  public OffsetDateTime getPurchaseOrderStateChangedDate() {
    return purchaseOrderStateChangedDate;
  }

  public void setPurchaseOrderStateChangedDate(OffsetDateTime purchaseOrderStateChangedDate) {
    this.purchaseOrderStateChangedDate = purchaseOrderStateChangedDate;
  }

  public OrderDetails purchaseOrderType(PurchaseOrderTypeEnum purchaseOrderType) {
    this.purchaseOrderType = purchaseOrderType;
    return this;
  }

   /**
   * Type of purchase order.
   * @return purchaseOrderType
  **/
  @ApiModelProperty(value = "Type of purchase order.")
  public PurchaseOrderTypeEnum getPurchaseOrderType() {
    return purchaseOrderType;
  }

  public void setPurchaseOrderType(PurchaseOrderTypeEnum purchaseOrderType) {
    this.purchaseOrderType = purchaseOrderType;
  }

  public OrderDetails importDetails(ImportDetails importDetails) {
    this.importDetails = importDetails;
    return this;
  }

   /**
   * If the purchase order is an import order, the details for the import order.
   * @return importDetails
  **/
  @ApiModelProperty(value = "If the purchase order is an import order, the details for the import order.")
  public ImportDetails getImportDetails() {
    return importDetails;
  }

  public void setImportDetails(ImportDetails importDetails) {
    this.importDetails = importDetails;
  }

  public OrderDetails dealCode(String dealCode) {
    this.dealCode = dealCode;
    return this;
  }

   /**
   * If requested by the recipient, this field will contain a promotional/deal number. The discount code line is optional. It is used to obtain a price discount on items on the order.
   * @return dealCode
  **/
  @ApiModelProperty(value = "If requested by the recipient, this field will contain a promotional/deal number. The discount code line is optional. It is used to obtain a price discount on items on the order.")
  public String getDealCode() {
    return dealCode;
  }

  public void setDealCode(String dealCode) {
    this.dealCode = dealCode;
  }

  public OrderDetails paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method used.
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "Payment method used.")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public OrderDetails buyingParty(PartyIdentification buyingParty) {
    this.buyingParty = buyingParty;
    return this;
  }

   /**
   * Name/Address and tax details of the buying party.
   * @return buyingParty
  **/
  @ApiModelProperty(value = "Name/Address and tax details of the buying party.")
  public PartyIdentification getBuyingParty() {
    return buyingParty;
  }

  public void setBuyingParty(PartyIdentification buyingParty) {
    this.buyingParty = buyingParty;
  }

  public OrderDetails sellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
    return this;
  }

   /**
   * Name/Address and tax details of the selling party.
   * @return sellingParty
  **/
  @ApiModelProperty(value = "Name/Address and tax details of the selling party.")
  public PartyIdentification getSellingParty() {
    return sellingParty;
  }

  public void setSellingParty(PartyIdentification sellingParty) {
    this.sellingParty = sellingParty;
  }

  public OrderDetails shipToParty(PartyIdentification shipToParty) {
    this.shipToParty = shipToParty;
    return this;
  }

   /**
   * Name/Address and tax details of the ship to party. Find a list of fulfillment center addresses for a region on the [Resources page of Amazon Vendor Central](https://vendorcentral.amazon.com/hz/vendor/members/support/help/node/GPZ88XH8HQM97ZV6).
   * @return shipToParty
  **/
  @ApiModelProperty(value = "Name/Address and tax details of the ship to party. Find a list of fulfillment center addresses for a region on the [Resources page of Amazon Vendor Central](https://vendorcentral.amazon.com/hz/vendor/members/support/help/node/GPZ88XH8HQM97ZV6).")
  public PartyIdentification getShipToParty() {
    return shipToParty;
  }

  public void setShipToParty(PartyIdentification shipToParty) {
    this.shipToParty = shipToParty;
  }

  public OrderDetails billToParty(PartyIdentification billToParty) {
    this.billToParty = billToParty;
    return this;
  }

   /**
   * Name/Address and tax details of the bill to party.
   * @return billToParty
  **/
  @ApiModelProperty(value = "Name/Address and tax details of the bill to party.")
  public PartyIdentification getBillToParty() {
    return billToParty;
  }

  public void setBillToParty(PartyIdentification billToParty) {
    this.billToParty = billToParty;
  }

  public OrderDetails shipWindow(String shipWindow) {
    this.shipWindow = shipWindow;
    return this;
  }

   /**
   * This indicates the ship window. Format is start and end date separated by double hyphen (--). For example, 2007-03-01T13:00:00Z--2007-03-11T15:30:00Z.
   * @return shipWindow
  **/
  @ApiModelProperty(value = "This indicates the ship window. Format is start and end date separated by double hyphen (--). For example, 2007-03-01T13:00:00Z--2007-03-11T15:30:00Z.")
  public String getShipWindow() {
    return shipWindow;
  }

  public void setShipWindow(String shipWindow) {
    this.shipWindow = shipWindow;
  }

  public OrderDetails deliveryWindow(String deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
    return this;
  }

   /**
   * This indicates the delivery window. Format is start and end date separated by double hyphen (--). For example, 2007-03-01T13:00:00Z--2007-03-11T15:30:00Z.
   * @return deliveryWindow
  **/
  @ApiModelProperty(value = "This indicates the delivery window. Format is start and end date separated by double hyphen (--). For example, 2007-03-01T13:00:00Z--2007-03-11T15:30:00Z.")
  public String getDeliveryWindow() {
    return deliveryWindow;
  }

  public void setDeliveryWindow(String deliveryWindow) {
    this.deliveryWindow = deliveryWindow;
  }

  public OrderDetails items(List<OrderItem> items) {
    this.items = items;
    return this;
  }

  public OrderDetails addItemsItem(OrderItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items in this purchase order.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "A list of items in this purchase order.")
  public List<OrderItem> getItems() {
    return items;
  }

  public void setItems(List<OrderItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetails orderDetails = (OrderDetails) o;
    return Objects.equals(this.purchaseOrderDate, orderDetails.purchaseOrderDate) &&
        Objects.equals(this.purchaseOrderChangedDate, orderDetails.purchaseOrderChangedDate) &&
        Objects.equals(this.purchaseOrderStateChangedDate, orderDetails.purchaseOrderStateChangedDate) &&
        Objects.equals(this.purchaseOrderType, orderDetails.purchaseOrderType) &&
        Objects.equals(this.importDetails, orderDetails.importDetails) &&
        Objects.equals(this.dealCode, orderDetails.dealCode) &&
        Objects.equals(this.paymentMethod, orderDetails.paymentMethod) &&
        Objects.equals(this.buyingParty, orderDetails.buyingParty) &&
        Objects.equals(this.sellingParty, orderDetails.sellingParty) &&
        Objects.equals(this.shipToParty, orderDetails.shipToParty) &&
        Objects.equals(this.billToParty, orderDetails.billToParty) &&
        Objects.equals(this.shipWindow, orderDetails.shipWindow) &&
        Objects.equals(this.deliveryWindow, orderDetails.deliveryWindow) &&
        Objects.equals(this.items, orderDetails.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purchaseOrderDate, purchaseOrderChangedDate, purchaseOrderStateChangedDate, purchaseOrderType, importDetails, dealCode, paymentMethod, buyingParty, sellingParty, shipToParty, billToParty, shipWindow, deliveryWindow, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetails {\n");
    
    sb.append("    purchaseOrderDate: ").append(toIndentedString(purchaseOrderDate)).append("\n");
    sb.append("    purchaseOrderChangedDate: ").append(toIndentedString(purchaseOrderChangedDate)).append("\n");
    sb.append("    purchaseOrderStateChangedDate: ").append(toIndentedString(purchaseOrderStateChangedDate)).append("\n");
    sb.append("    purchaseOrderType: ").append(toIndentedString(purchaseOrderType)).append("\n");
    sb.append("    importDetails: ").append(toIndentedString(importDetails)).append("\n");
    sb.append("    dealCode: ").append(toIndentedString(dealCode)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    buyingParty: ").append(toIndentedString(buyingParty)).append("\n");
    sb.append("    sellingParty: ").append(toIndentedString(sellingParty)).append("\n");
    sb.append("    shipToParty: ").append(toIndentedString(shipToParty)).append("\n");
    sb.append("    billToParty: ").append(toIndentedString(billToParty)).append("\n");
    sb.append("    shipWindow: ").append(toIndentedString(shipWindow)).append("\n");
    sb.append("    deliveryWindow: ").append(toIndentedString(deliveryWindow)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

