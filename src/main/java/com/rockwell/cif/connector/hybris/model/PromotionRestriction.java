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
 * Representation of a Promotion Restriction
 */
@ApiModel(description = "Representation of a Promotion Restriction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class PromotionRestriction {
  @SerializedName("description")
  private String description = null;

  @SerializedName("restrictionType")
  private String restrictionType = null;

  public PromotionRestriction description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the promotion restriction
   * @return description
  **/
  @ApiModelProperty(value = "Description of the promotion restriction")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PromotionRestriction restrictionType(String restrictionType) {
    this.restrictionType = restrictionType;
    return this;
  }

   /**
   * Type of the promotion restriction
   * @return restrictionType
  **/
  @ApiModelProperty(value = "Type of the promotion restriction")
  public String getRestrictionType() {
    return restrictionType;
  }

  public void setRestrictionType(String restrictionType) {
    this.restrictionType = restrictionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionRestriction promotionRestriction = (PromotionRestriction) o;
    return Objects.equals(this.description, promotionRestriction.description) &&
        Objects.equals(this.restrictionType, promotionRestriction.restrictionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, restrictionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionRestriction {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    restrictionType: ").append(toIndentedString(restrictionType)).append("\n");
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
