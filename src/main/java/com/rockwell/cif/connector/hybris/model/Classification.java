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
 * Representation of a Classification
 */
@ApiModel(description = "Representation of a Classification")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")
public class Classification {
  @SerializedName("code")
  private String code = null;

  @SerializedName("features")
  private List<Feature> features = null;

  @SerializedName("name")
  private String name = null;

  public Classification code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of the classification
   * @return code
  **/
  @ApiModelProperty(value = "Code of the classification")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Classification features(List<Feature> features) {
    this.features = features;
    return this;
  }

  public Classification addFeaturesItem(Feature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<Feature>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * List of features for given classification
   * @return features
  **/
  @ApiModelProperty(value = "List of features for given classification")
  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public Classification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the classification
   * @return name
  **/
  @ApiModelProperty(value = "Name of the classification")
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
    Classification classification = (Classification) o;
    return Objects.equals(this.code, classification.code) &&
        Objects.equals(this.features, classification.features) &&
        Objects.equals(this.name, classification.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, features, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

