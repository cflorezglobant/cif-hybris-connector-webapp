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
 * Representation of a Variant Matrix Element
 */
@ApiModel(description = "Representation of a Variant Matrix Element")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class VariantMatrixElement {
  @SerializedName("elements")
  private List<VariantMatrixElement> elements = null;

  @SerializedName("isLeaf")
  private Boolean isLeaf = null;

  @SerializedName("parentVariantCategory")
  private VariantCategory parentVariantCategory = null;

  @SerializedName("variantOption")
  private VariantOption variantOption = null;

  @SerializedName("variantValueCategory")
  private VariantValueCategory variantValueCategory = null;

  public VariantMatrixElement elements(List<VariantMatrixElement> elements) {
    this.elements = elements;
    return this;
  }

  public VariantMatrixElement addElementsItem(VariantMatrixElement elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<VariantMatrixElement>();
    }
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * List of elements with the type of variant matrix element
   * @return elements
  **/
  @ApiModelProperty(value = "List of elements with the type of variant matrix element")
  public List<VariantMatrixElement> getElements() {
    return elements;
  }

  public void setElements(List<VariantMatrixElement> elements) {
    this.elements = elements;
  }

  public VariantMatrixElement isLeaf(Boolean isLeaf) {
    this.isLeaf = isLeaf;
    return this;
  }

   /**
   * Get isLeaf
   * @return isLeaf
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLeaf() {
    return isLeaf;
  }

  public void setIsLeaf(Boolean isLeaf) {
    this.isLeaf = isLeaf;
  }

  public VariantMatrixElement parentVariantCategory(VariantCategory parentVariantCategory) {
    this.parentVariantCategory = parentVariantCategory;
    return this;
  }

   /**
   * Parent variant category for variant matrix element
   * @return parentVariantCategory
  **/
  @ApiModelProperty(value = "Parent variant category for variant matrix element")
  public VariantCategory getParentVariantCategory() {
    return parentVariantCategory;
  }

  public void setParentVariantCategory(VariantCategory parentVariantCategory) {
    this.parentVariantCategory = parentVariantCategory;
  }

  public VariantMatrixElement variantOption(VariantOption variantOption) {
    this.variantOption = variantOption;
    return this;
  }

   /**
   * Variant option for variant matrix element
   * @return variantOption
  **/
  @ApiModelProperty(value = "Variant option for variant matrix element")
  public VariantOption getVariantOption() {
    return variantOption;
  }

  public void setVariantOption(VariantOption variantOption) {
    this.variantOption = variantOption;
  }

  public VariantMatrixElement variantValueCategory(VariantValueCategory variantValueCategory) {
    this.variantValueCategory = variantValueCategory;
    return this;
  }

   /**
   * Variant value category for variant matrix element
   * @return variantValueCategory
  **/
  @ApiModelProperty(value = "Variant value category for variant matrix element")
  public VariantValueCategory getVariantValueCategory() {
    return variantValueCategory;
  }

  public void setVariantValueCategory(VariantValueCategory variantValueCategory) {
    this.variantValueCategory = variantValueCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantMatrixElement variantMatrixElement = (VariantMatrixElement) o;
    return Objects.equals(this.elements, variantMatrixElement.elements) &&
        Objects.equals(this.isLeaf, variantMatrixElement.isLeaf) &&
        Objects.equals(this.parentVariantCategory, variantMatrixElement.parentVariantCategory) &&
        Objects.equals(this.variantOption, variantMatrixElement.variantOption) &&
        Objects.equals(this.variantValueCategory, variantMatrixElement.variantValueCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, isLeaf, parentVariantCategory, variantOption, variantValueCategory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantMatrixElement {\n");
    
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    isLeaf: ").append(toIndentedString(isLeaf)).append("\n");
    sb.append("    parentVariantCategory: ").append(toIndentedString(parentVariantCategory)).append("\n");
    sb.append("    variantOption: ").append(toIndentedString(variantOption)).append("\n");
    sb.append("    variantValueCategory: ").append(toIndentedString(variantValueCategory)).append("\n");
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
