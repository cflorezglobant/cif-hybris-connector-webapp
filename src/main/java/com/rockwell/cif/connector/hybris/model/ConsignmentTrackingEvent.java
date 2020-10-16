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
import java.util.Objects;

/**
 * Consignment tracking event
 */
@ApiModel(description = "Consignment tracking event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class ConsignmentTrackingEvent {
  @SerializedName("detail")
  private String detail = null;

  @SerializedName("eventDate")
  private OffsetDateTime eventDate = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("referenceCode")
  private String referenceCode = null;

  public ConsignmentTrackingEvent detail(String detail) {
    this.detail = detail;
    return this;
  }

   /**
   * tracking detail
   * @return detail
  **/
  @ApiModelProperty(value = "tracking detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ConsignmentTrackingEvent eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * date of tracking event
   * @return eventDate
  **/
  @ApiModelProperty(value = "date of tracking event")
  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public ConsignmentTrackingEvent location(String location) {
    this.location = location;
    return this;
  }

   /**
   * consignment location
   * @return location
  **/
  @ApiModelProperty(value = "consignment location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ConsignmentTrackingEvent referenceCode(String referenceCode) {
    this.referenceCode = referenceCode;
    return this;
  }

   /**
   * logistics status
   * @return referenceCode
  **/
  @ApiModelProperty(value = "logistics status")
  public String getReferenceCode() {
    return referenceCode;
  }

  public void setReferenceCode(String referenceCode) {
    this.referenceCode = referenceCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsignmentTrackingEvent consignmentTrackingEvent = (ConsignmentTrackingEvent) o;
    return Objects.equals(this.detail, consignmentTrackingEvent.detail) &&
        Objects.equals(this.eventDate, consignmentTrackingEvent.eventDate) &&
        Objects.equals(this.location, consignmentTrackingEvent.location) &&
        Objects.equals(this.referenceCode, consignmentTrackingEvent.referenceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, eventDate, location, referenceCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsignmentTrackingEvent {\n");
    
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    referenceCode: ").append(toIndentedString(referenceCode)).append("\n");
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

