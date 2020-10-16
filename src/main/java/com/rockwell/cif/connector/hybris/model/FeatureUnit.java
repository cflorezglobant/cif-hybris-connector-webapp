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
 * Representation of a Feature Unit
 */
@ApiModel(description = "Representation of a Feature Unit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class FeatureUnit {
  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("unitType")
  private String unitType = null;

  public FeatureUnit name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the feature unit
   * @return name
  **/
  @ApiModelProperty(value = "Name of the feature unit")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureUnit symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol of the feature unit
   * @return symbol
  **/
  @ApiModelProperty(value = "Symbol of the feature unit")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public FeatureUnit unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Type of the feature unit
   * @return unitType
  **/
  @ApiModelProperty(value = "Type of the feature unit")
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureUnit featureUnit = (FeatureUnit) o;
    return Objects.equals(this.name, featureUnit.name) &&
        Objects.equals(this.symbol, featureUnit.symbol) &&
        Objects.equals(this.unitType, featureUnit.unitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, unitType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureUnit {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
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
