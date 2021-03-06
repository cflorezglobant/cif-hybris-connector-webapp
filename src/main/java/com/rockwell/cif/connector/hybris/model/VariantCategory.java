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
 * Representation of a Variant Category
 */
@ApiModel(description = "Representation of a Variant Category")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class VariantCategory {
  @SerializedName("hasImage")
  private Boolean hasImage = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private Integer priority = null;

  public VariantCategory hasImage(Boolean hasImage) {
    this.hasImage = hasImage;
    return this;
  }

   /**
   * Flag if varian category has image assigned
   * @return hasImage
  **/
  @ApiModelProperty(value = "Flag if varian category has image assigned")
  public Boolean isHasImage() {
    return hasImage;
  }

  public void setHasImage(Boolean hasImage) {
    this.hasImage = hasImage;
  }

  public VariantCategory name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Variant category name
   * @return name
  **/
  @ApiModelProperty(value = "Variant category name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VariantCategory priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority number of variant category
   * @return priority
  **/
  @ApiModelProperty(value = "Priority number of variant category")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantCategory variantCategory = (VariantCategory) o;
    return Objects.equals(this.hasImage, variantCategory.hasImage) &&
        Objects.equals(this.name, variantCategory.name) &&
        Objects.equals(this.priority, variantCategory.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasImage, name, priority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantCategory {\n");
    
    sb.append("    hasImage: ").append(toIndentedString(hasImage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

