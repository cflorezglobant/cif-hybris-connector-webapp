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
 * Representation of a Breadcrumb
 */
@ApiModel(description = "Representation of a Breadcrumb")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class Breadcrumb {
  @SerializedName("facetCode")
  private String facetCode = null;

  @SerializedName("facetName")
  private String facetName = null;

  @SerializedName("facetValueCode")
  private String facetValueCode = null;

  @SerializedName("facetValueName")
  private String facetValueName = null;

  @SerializedName("removeQuery")
  private SearchState removeQuery = null;

  @SerializedName("truncateQuery")
  private SearchState truncateQuery = null;

  public Breadcrumb facetCode(String facetCode) {
    this.facetCode = facetCode;
    return this;
  }

   /**
   * Code of the facet
   * @return facetCode
  **/
  @ApiModelProperty(value = "Code of the facet")
  public String getFacetCode() {
    return facetCode;
  }

  public void setFacetCode(String facetCode) {
    this.facetCode = facetCode;
  }

  public Breadcrumb facetName(String facetName) {
    this.facetName = facetName;
    return this;
  }

   /**
   * Name of the facet
   * @return facetName
  **/
  @ApiModelProperty(value = "Name of the facet")
  public String getFacetName() {
    return facetName;
  }

  public void setFacetName(String facetName) {
    this.facetName = facetName;
  }

  public Breadcrumb facetValueCode(String facetValueCode) {
    this.facetValueCode = facetValueCode;
    return this;
  }

   /**
   * Value code of the facet
   * @return facetValueCode
  **/
  @ApiModelProperty(value = "Value code of the facet")
  public String getFacetValueCode() {
    return facetValueCode;
  }

  public void setFacetValueCode(String facetValueCode) {
    this.facetValueCode = facetValueCode;
  }

  public Breadcrumb facetValueName(String facetValueName) {
    this.facetValueName = facetValueName;
    return this;
  }

   /**
   * Value name of the facet
   * @return facetValueName
  **/
  @ApiModelProperty(value = "Value name of the facet")
  public String getFacetValueName() {
    return facetValueName;
  }

  public void setFacetValueName(String facetValueName) {
    this.facetValueName = facetValueName;
  }

  public Breadcrumb removeQuery(SearchState removeQuery) {
    this.removeQuery = removeQuery;
    return this;
  }

   /**
   * Remove query
   * @return removeQuery
  **/
  @ApiModelProperty(value = "Remove query")
  public SearchState getRemoveQuery() {
    return removeQuery;
  }

  public void setRemoveQuery(SearchState removeQuery) {
    this.removeQuery = removeQuery;
  }

  public Breadcrumb truncateQuery(SearchState truncateQuery) {
    this.truncateQuery = truncateQuery;
    return this;
  }

   /**
   * Truncate query
   * @return truncateQuery
  **/
  @ApiModelProperty(value = "Truncate query")
  public SearchState getTruncateQuery() {
    return truncateQuery;
  }

  public void setTruncateQuery(SearchState truncateQuery) {
    this.truncateQuery = truncateQuery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Breadcrumb breadcrumb = (Breadcrumb) o;
    return Objects.equals(this.facetCode, breadcrumb.facetCode) &&
        Objects.equals(this.facetName, breadcrumb.facetName) &&
        Objects.equals(this.facetValueCode, breadcrumb.facetValueCode) &&
        Objects.equals(this.facetValueName, breadcrumb.facetValueName) &&
        Objects.equals(this.removeQuery, breadcrumb.removeQuery) &&
        Objects.equals(this.truncateQuery, breadcrumb.truncateQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetCode, facetName, facetValueCode, facetValueName, removeQuery, truncateQuery);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Breadcrumb {\n");
    
    sb.append("    facetCode: ").append(toIndentedString(facetCode)).append("\n");
    sb.append("    facetName: ").append(toIndentedString(facetName)).append("\n");
    sb.append("    facetValueCode: ").append(toIndentedString(facetValueCode)).append("\n");
    sb.append("    facetValueName: ").append(toIndentedString(facetValueName)).append("\n");
    sb.append("    removeQuery: ").append(toIndentedString(removeQuery)).append("\n");
    sb.append("    truncateQuery: ").append(toIndentedString(truncateQuery)).append("\n");
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

