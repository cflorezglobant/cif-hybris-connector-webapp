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
 * Representation of a Delivery mode list
 */
@ApiModel(description = "Representation of a Delivery mode list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class DeliveryModeList {
  @SerializedName("deliveryModes")
  private List<DeliveryMode> deliveryModes = null;

  public DeliveryModeList deliveryModes(List<DeliveryMode> deliveryModes) {
    this.deliveryModes = deliveryModes;
    return this;
  }

  public DeliveryModeList addDeliveryModesItem(DeliveryMode deliveryModesItem) {
    if (this.deliveryModes == null) {
      this.deliveryModes = new ArrayList<DeliveryMode>();
    }
    this.deliveryModes.add(deliveryModesItem);
    return this;
  }

   /**
   * List of delivery modes
   * @return deliveryModes
  **/
  @ApiModelProperty(value = "List of delivery modes")
  public List<DeliveryMode> getDeliveryModes() {
    return deliveryModes;
  }

  public void setDeliveryModes(List<DeliveryMode> deliveryModes) {
    this.deliveryModes = deliveryModes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryModeList deliveryModeList = (DeliveryModeList) o;
    return Objects.equals(this.deliveryModes, deliveryModeList.deliveryModes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryModes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryModeList {\n");
    
    sb.append("    deliveryModes: ").append(toIndentedString(deliveryModes)).append("\n");
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

