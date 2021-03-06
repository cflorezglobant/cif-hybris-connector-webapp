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
 * Representation of a Base Site List
 */
@ApiModel(description = "Representation of a Base Site List")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class BaseSiteList {
  @SerializedName("baseSites")
  private List<BaseSite> baseSites = null;

  public BaseSiteList baseSites(List<BaseSite> baseSites) {
    this.baseSites = baseSites;
    return this;
  }

  public BaseSiteList addBaseSitesItem(BaseSite baseSitesItem) {
    if (this.baseSites == null) {
      this.baseSites = new ArrayList<BaseSite>();
    }
    this.baseSites.add(baseSitesItem);
    return this;
  }

   /**
   * List of basesites
   * @return baseSites
  **/
  @ApiModelProperty(value = "List of basesites")
  public List<BaseSite> getBaseSites() {
    return baseSites;
  }

  public void setBaseSites(List<BaseSite> baseSites) {
    this.baseSites = baseSites;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSiteList baseSiteList = (BaseSiteList) o;
    return Objects.equals(this.baseSites, baseSiteList.baseSites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseSites);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSiteList {\n");
    
    sb.append("    baseSites: ").append(toIndentedString(baseSites)).append("\n");
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

