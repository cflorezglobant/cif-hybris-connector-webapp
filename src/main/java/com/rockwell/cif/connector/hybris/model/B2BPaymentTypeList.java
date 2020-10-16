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
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * B2BPaymentTypeList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class B2BPaymentTypeList {
  @SerializedName("paymentTypes")
  private List<B2BPaymentType> paymentTypes = null;

  public B2BPaymentTypeList paymentTypes(List<B2BPaymentType> paymentTypes) {
    this.paymentTypes = paymentTypes;
    return this;
  }

  public B2BPaymentTypeList addPaymentTypesItem(B2BPaymentType paymentTypesItem) {
    if (this.paymentTypes == null) {
      this.paymentTypes = new ArrayList<B2BPaymentType>();
    }
    this.paymentTypes.add(paymentTypesItem);
    return this;
  }

   /**
   * Get paymentTypes
   * @return paymentTypes
  **/
  @ApiModelProperty(value = "")
  public List<B2BPaymentType> getPaymentTypes() {
    return paymentTypes;
  }

  public void setPaymentTypes(List<B2BPaymentType> paymentTypes) {
    this.paymentTypes = paymentTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    B2BPaymentTypeList b2BPaymentTypeList = (B2BPaymentTypeList) o;
    return Objects.equals(this.paymentTypes, b2BPaymentTypeList.paymentTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class B2BPaymentTypeList {\n");
    
    sb.append("    paymentTypes: ").append(toIndentedString(paymentTypes)).append("\n");
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

