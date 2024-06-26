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


package com.amazon.spapi.sellerOrders.api;

import com.amazon.SellingPartnerAPIAA.LWAException;
import com.amazon.spapi.ApiException;
import com.amazon.spapi.sellerOrders.model.UpdateShipmentStatusRequest;
import org.junit.Ignore;
import org.junit.Test;

/**
* API tests for ShipmentApi
*/
@Ignore
public class ShipmentApiTest {

private final ShipmentApi api = new ShipmentApi();


/**
* 
*
* Update the shipment status for an order that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 15 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, refer to [Usage Plans and Rate Limits in the Selling Partner API](https://developer-docs.amazon.com/sp-api/docs/usage-plans-and-rate-limits-in-the-sp-api).
*
* @throws ApiException if the Api call fails
* @throws LWAException If calls to fetch LWA access token fails
*/
@Test
public void updateShipmentStatusTest() throws ApiException, LWAException {
    String orderId = null;
    UpdateShipmentStatusRequest payload = null;
api.updateShipmentStatus(orderId, payload);

// TODO: test validations
}

}