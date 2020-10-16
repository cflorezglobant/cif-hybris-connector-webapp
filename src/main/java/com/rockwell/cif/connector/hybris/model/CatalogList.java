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
 * Representation of a Catalog List
 */
@ApiModel(description = "Representation of a Catalog List")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class CatalogList {
  @SerializedName("catalogs")
  private List<Catalog> catalogs = null;

  public CatalogList catalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
    return this;
  }

  public CatalogList addCatalogsItem(Catalog catalogsItem) {
    if (this.catalogs == null) {
      this.catalogs = new ArrayList<Catalog>();
    }
    this.catalogs.add(catalogsItem);
    return this;
  }

   /**
   * List of catalog items
   * @return catalogs
  **/
  @ApiModelProperty(value = "List of catalog items")
  public List<Catalog> getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogList catalogList = (CatalogList) o;
    return Objects.equals(this.catalogs, catalogList.catalogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogList {\n");
    
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
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

