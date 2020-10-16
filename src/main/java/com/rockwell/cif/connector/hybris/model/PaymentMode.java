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
 * Representation of a Payment Mode
 */
@ApiModel(description = "Representation of a Payment Mode")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class PaymentMode {
  @SerializedName("code")
  private String code = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  public PaymentMode code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Payment mode code
   * @return code
  **/
  @ApiModelProperty(value = "Payment mode code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PaymentMode description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Payment mode description
   * @return description
  **/
  @ApiModelProperty(value = "Payment mode description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentMode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Payment mode name
   * @return name
  **/
  @ApiModelProperty(value = "Payment mode name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMode paymentMode = (PaymentMode) o;
    return Objects.equals(this.code, paymentMode.code) &&
        Objects.equals(this.description, paymentMode.description) &&
        Objects.equals(this.name, paymentMode.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

