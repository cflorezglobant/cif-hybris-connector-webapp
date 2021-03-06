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

import java.util.Objects;

/**
 * Error message
 */
@ApiModel(description = "Error message")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class Error {
  @SerializedName("errorCode")
  private String errorCode = null;

  @SerializedName("exceptionMessage")
  private String exceptionMessage = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("subjectType")
  private String subjectType = null;

  @SerializedName("type")
  private String type = null;

  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code
   * @return errorCode
  **/
  @ApiModelProperty(value = "Error code")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public Error exceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
    return this;
  }

   /**
   * Get exceptionMessage
   * @return exceptionMessage
  **/
  @ApiModelProperty(value = "")
  public String getExceptionMessage() {
    return exceptionMessage;
  }

  public void setExceptionMessage(String exceptionMessage) {
    this.exceptionMessage = exceptionMessage;
  }

  public Error language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Descriptive, human readable error message.
   * @return message
  **/
  @ApiModelProperty(value = "Descriptive, human readable error message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Error reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Additional classification specific for each error type e.g. &#39;noStock&#39;.
   * @return reason
  **/
  @ApiModelProperty(value = "Additional classification specific for each error type e.g. 'noStock'.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Error subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Identifier of the related object e.g. &#39;1&#39;.
   * @return subject
  **/
  @ApiModelProperty(value = "Identifier of the related object e.g. '1'.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Error subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

   /**
   * Type of the object related to the error e.g. &#39;entry&#39;.
   * @return subjectType
  **/
  @ApiModelProperty(value = "Type of the object related to the error e.g. 'entry'.")
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public Error type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the error e.g. &#39;LowStockError&#39;.
   * @return type
  **/
  @ApiModelProperty(value = "Type of the error e.g. 'LowStockError'.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.exceptionMessage, error.exceptionMessage) &&
        Objects.equals(this.language, error.language) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.position, error.position) &&
        Objects.equals(this.reason, error.reason) &&
        Objects.equals(this.subject, error.subject) &&
        Objects.equals(this.subjectType, error.subjectType) &&
        Objects.equals(this.type, error.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, exceptionMessage, language, message, position, reason, subject, subjectType, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    exceptionMessage: ").append(toIndentedString(exceptionMessage)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

