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
 * Representation of a Promotion list
 */
@ApiModel(description = "Representation of a Promotion list")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class PromotionList {
  @SerializedName("promotions")
  private List<Promotion> promotions = null;

  public PromotionList promotions(List<Promotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  public PromotionList addPromotionsItem(Promotion promotionsItem) {
    if (this.promotions == null) {
      this.promotions = new ArrayList<Promotion>();
    }
    this.promotions.add(promotionsItem);
    return this;
  }

   /**
   * List of promotions
   * @return promotions
  **/
  @ApiModelProperty(value = "List of promotions")
  public List<Promotion> getPromotions() {
    return promotions;
  }

  public void setPromotions(List<Promotion> promotions) {
    this.promotions = promotions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionList promotionList = (PromotionList) o;
    return Objects.equals(this.promotions, promotionList.promotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promotions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionList {\n");
    
    sb.append("    promotions: ").append(toIndentedString(promotions)).append("\n");
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

