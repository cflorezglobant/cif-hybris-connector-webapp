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
 * Representation of a special opening day
 */
@ApiModel(description = "Representation of a special opening day")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class SpecialOpeningDay {
  @SerializedName("closed")
  private Boolean closed = null;

  @SerializedName("closingTime")
  private Time closingTime = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("formattedDate")
  private String formattedDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("openingTime")
  private Time openingTime = null;

  public SpecialOpeningDay closed(Boolean closed) {
    this.closed = closed;
    return this;
  }

   /**
   * Flag stating if special opening day is closed
   * @return closed
  **/
  @ApiModelProperty(value = "Flag stating if special opening day is closed")
  public Boolean isClosed() {
    return closed;
  }

  public void setClosed(Boolean closed) {
    this.closed = closed;
  }

  public SpecialOpeningDay closingTime(Time closingTime) {
    this.closingTime = closingTime;
    return this;
  }

   /**
   * Closing time of opening day
   * @return closingTime
  **/
  @ApiModelProperty(value = "Closing time of opening day")
  public Time getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(Time closingTime) {
    this.closingTime = closingTime;
  }

  public SpecialOpeningDay comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment field
   * @return comment
  **/
  @ApiModelProperty(value = "Comment field")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public SpecialOpeningDay date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date of special opening day
   * @return date
  **/
  @ApiModelProperty(value = "Date of special opening day")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public SpecialOpeningDay formattedDate(String formattedDate) {
    this.formattedDate = formattedDate;
    return this;
  }

   /**
   * Text representation of the date of special opening day
   * @return formattedDate
  **/
  @ApiModelProperty(value = "Text representation of the date of special opening day")
  public String getFormattedDate() {
    return formattedDate;
  }

  public void setFormattedDate(String formattedDate) {
    this.formattedDate = formattedDate;
  }

  public SpecialOpeningDay name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the special opening day event
   * @return name
  **/
  @ApiModelProperty(value = "Name of the special opening day event")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpecialOpeningDay openingTime(Time openingTime) {
    this.openingTime = openingTime;
    return this;
  }

   /**
   * Starting time of opening day
   * @return openingTime
  **/
  @ApiModelProperty(value = "Starting time of opening day")
  public Time getOpeningTime() {
    return openingTime;
  }

  public void setOpeningTime(Time openingTime) {
    this.openingTime = openingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialOpeningDay specialOpeningDay = (SpecialOpeningDay) o;
    return Objects.equals(this.closed, specialOpeningDay.closed) &&
        Objects.equals(this.closingTime, specialOpeningDay.closingTime) &&
        Objects.equals(this.comment, specialOpeningDay.comment) &&
        Objects.equals(this.date, specialOpeningDay.date) &&
        Objects.equals(this.formattedDate, specialOpeningDay.formattedDate) &&
        Objects.equals(this.name, specialOpeningDay.name) &&
        Objects.equals(this.openingTime, specialOpeningDay.openingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(closed, closingTime, comment, date, formattedDate, name, openingTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialOpeningDay {\n");
    
    sb.append("    closed: ").append(toIndentedString(closed)).append("\n");
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    formattedDate: ").append(toIndentedString(formattedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
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
