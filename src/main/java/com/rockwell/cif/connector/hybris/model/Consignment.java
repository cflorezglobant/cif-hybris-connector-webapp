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

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Representation of a Consignment
 */
@ApiModel(description = "Representation of a Consignment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class Consignment {
  @SerializedName("code")
  private String code = null;

  @SerializedName("deliveryPointOfService")
  private PointOfService deliveryPointOfService = null;

  @SerializedName("entries")
  private List<ConsignmentEntry> entries = null;

  @SerializedName("shippingAddress")
  private Address shippingAddress = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("statusDate")
  private OffsetDateTime statusDate = null;

  @SerializedName("statusDisplay")
  private String statusDisplay = null;

  @SerializedName("trackingID")
  private String trackingID = null;

  public Consignment code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Consignment code
   * @return code
  **/
  @ApiModelProperty(value = "Consignment code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Consignment deliveryPointOfService(PointOfService deliveryPointOfService) {
    this.deliveryPointOfService = deliveryPointOfService;
    return this;
  }

   /**
   * Delivery point of service
   * @return deliveryPointOfService
  **/
  @ApiModelProperty(value = "Delivery point of service")
  public PointOfService getDeliveryPointOfService() {
    return deliveryPointOfService;
  }

  public void setDeliveryPointOfService(PointOfService deliveryPointOfService) {
    this.deliveryPointOfService = deliveryPointOfService;
  }

  public Consignment entries(List<ConsignmentEntry> entries) {
    this.entries = entries;
    return this;
  }

  public Consignment addEntriesItem(ConsignmentEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<ConsignmentEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * List of consignment entries
   * @return entries
  **/
  @ApiModelProperty(value = "List of consignment entries")
  public List<ConsignmentEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<ConsignmentEntry> entries) {
    this.entries = entries;
  }

  public Consignment shippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Shipping address
   * @return shippingAddress
  **/
  @ApiModelProperty(value = "Shipping address")
  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Consignment status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Consignment status
   * @return status
  **/
  @ApiModelProperty(value = "Consignment status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Consignment statusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
    return this;
  }

   /**
   * Consignment status date
   * @return statusDate
  **/
  @ApiModelProperty(value = "Consignment status date")
  public OffsetDateTime getStatusDate() {
    return statusDate;
  }

  public void setStatusDate(OffsetDateTime statusDate) {
    this.statusDate = statusDate;
  }

  public Consignment statusDisplay(String statusDisplay) {
    this.statusDisplay = statusDisplay;
    return this;
  }

   /**
   * Consignment status display
   * @return statusDisplay
  **/
  @ApiModelProperty(value = "Consignment status display")
  public String getStatusDisplay() {
    return statusDisplay;
  }

  public void setStatusDisplay(String statusDisplay) {
    this.statusDisplay = statusDisplay;
  }

  public Consignment trackingID(String trackingID) {
    this.trackingID = trackingID;
    return this;
  }

   /**
   * Consignment tracking identifier
   * @return trackingID
  **/
  @ApiModelProperty(value = "Consignment tracking identifier")
  public String getTrackingID() {
    return trackingID;
  }

  public void setTrackingID(String trackingID) {
    this.trackingID = trackingID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consignment consignment = (Consignment) o;
    return Objects.equals(this.code, consignment.code) &&
        Objects.equals(this.deliveryPointOfService, consignment.deliveryPointOfService) &&
        Objects.equals(this.entries, consignment.entries) &&
        Objects.equals(this.shippingAddress, consignment.shippingAddress) &&
        Objects.equals(this.status, consignment.status) &&
        Objects.equals(this.statusDate, consignment.statusDate) &&
        Objects.equals(this.statusDisplay, consignment.statusDisplay) &&
        Objects.equals(this.trackingID, consignment.trackingID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, deliveryPointOfService, entries, shippingAddress, status, statusDate, statusDisplay, trackingID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consignment {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    deliveryPointOfService: ").append(toIndentedString(deliveryPointOfService)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDate: ").append(toIndentedString(statusDate)).append("\n");
    sb.append("    statusDisplay: ").append(toIndentedString(statusDisplay)).append("\n");
    sb.append("    trackingID: ").append(toIndentedString(trackingID)).append("\n");
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

