/*
 * Commerce Webservices v2
 * These services manage all of the common commerce functionality, and also include customizations from installed AddOns.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockwell.cif.connector.hybris.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representation of an Order entry list consumed
 */
@ApiModel(description = "Representation of an Order entry list consumed")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class OrderEntryList {
  @SerializedName("orderEntries")
  private List<OrderEntry> orderEntries = null;

  public OrderEntryList orderEntries(List<OrderEntry> orderEntries) {
    this.orderEntries = orderEntries;
    return this;
  }

  public OrderEntryList addOrderEntriesItem(OrderEntry orderEntriesItem) {
    if (this.orderEntries == null) {
      this.orderEntries = new ArrayList<OrderEntry>();
    }
    this.orderEntries.add(orderEntriesItem);
    return this;
  }

   /**
   * List of order entries
   * @return orderEntries
  **/
  @ApiModelProperty(value = "List of order entries")
  public List<OrderEntry> getOrderEntries() {
    return orderEntries;
  }

  public void setOrderEntries(List<OrderEntry> orderEntries) {
    this.orderEntries = orderEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderEntryList orderEntryList = (OrderEntryList) o;
    return Objects.equals(this.orderEntries, orderEntryList.orderEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderEntryList {\n");
    
    sb.append("    orderEntries: ").append(toIndentedString(orderEntries)).append("\n");
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

