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
 * Response body fields which will be returned while fetching the list of countries. The DTO is in XML or .json format
 */
@ApiModel(description = "Response body fields which will be returned while fetching the list of countries. The DTO is in XML or .json format")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class Country {
  @SerializedName("isocode")
  private String isocode = null;

  @SerializedName("name")
  private String name = null;

  public Country isocode(String isocode) {
    this.isocode = isocode;
    return this;
  }

   /**
   * Country code in iso format
   * @return isocode
  **/
  @ApiModelProperty(value = "Country code in iso format")
  public String getIsocode() {
    return isocode;
  }

  public void setIsocode(String isocode) {
    this.isocode = isocode;
  }

  public Country name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the country
   * @return name
  **/
  @ApiModelProperty(value = "Name of the country")
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
    Country country = (Country) o;
    return Objects.equals(this.isocode, country.isocode) &&
        Objects.equals(this.name, country.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isocode, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Country {\n");
    
    sb.append("    isocode: ").append(toIndentedString(isocode)).append("\n");
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

