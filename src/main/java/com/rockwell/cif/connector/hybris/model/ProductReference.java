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
 * Representation of a Product Reference
 */
@ApiModel(description = "Representation of a Product Reference")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class ProductReference {
  @SerializedName("description")
  private String description = null;

  @SerializedName("preselected")
  private Boolean preselected = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("referenceType")
  private String referenceType = null;

  @SerializedName("target")
  private Product target = null;

  public ProductReference description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Reference description
   * @return description
  **/
  @ApiModelProperty(value = "Reference description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductReference preselected(Boolean preselected) {
    this.preselected = preselected;
    return this;
  }

   /**
   * Flag stating if product reference is preselected
   * @return preselected
  **/
  @ApiModelProperty(value = "Flag stating if product reference is preselected")
  public Boolean isPreselected() {
    return preselected;
  }

  public void setPreselected(Boolean preselected) {
    this.preselected = preselected;
  }

  public ProductReference quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Reference quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Reference quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public ProductReference referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

   /**
   * Reference type
   * @return referenceType
  **/
  @ApiModelProperty(value = "Reference type")
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public ProductReference target(Product target) {
    this.target = target;
    return this;
  }

   /**
   * Target product
   * @return target
  **/
  @ApiModelProperty(value = "Target product")
  public Product getTarget() {
    return target;
  }

  public void setTarget(Product target) {
    this.target = target;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReference productReference = (ProductReference) o;
    return Objects.equals(this.description, productReference.description) &&
        Objects.equals(this.preselected, productReference.preselected) &&
        Objects.equals(this.quantity, productReference.quantity) &&
        Objects.equals(this.referenceType, productReference.referenceType) &&
        Objects.equals(this.target, productReference.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, preselected, quantity, referenceType, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReference {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preselected: ").append(toIndentedString(preselected)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

