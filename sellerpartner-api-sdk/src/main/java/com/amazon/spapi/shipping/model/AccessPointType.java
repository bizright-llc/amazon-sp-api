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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * The type of access point, like counter (HELIX), lockers, etc.
 */
@JsonAdapter(AccessPointType.Adapter.class)
public enum AccessPointType {
  
  HELIX("HELIX"),
  
  CAMPUS_LOCKER("CAMPUS_LOCKER"),
  
  OMNI_LOCKER("OMNI_LOCKER"),
  
  ODIN_LOCKER("ODIN_LOCKER"),
  
  DOBBY_LOCKER("DOBBY_LOCKER"),
  
  CORE_LOCKER("CORE_LOCKER"),
  
  _3P("3P"),
  
  CAMPUS_ROOM("CAMPUS_ROOM");

  private String value;

  AccessPointType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccessPointType fromValue(String text) {
    for (AccessPointType b : AccessPointType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccessPointType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccessPointType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccessPointType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccessPointType.fromValue(String.valueOf(value));
    }
  }
}

