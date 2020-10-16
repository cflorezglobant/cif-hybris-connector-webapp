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
 * Representation of a Variant Option Qualifier
 */
@ApiModel(description = "Representation of a Variant Option Qualifier")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class VariantOptionQualifier {
  @SerializedName("image")
  private Image image = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("qualifier")
  private String qualifier = null;

  @SerializedName("value")
  private String value = null;

  public VariantOptionQualifier image(Image image) {
    this.image = image;
    return this;
  }

   /**
   * Image associated with variant option qualifier
   * @return image
  **/
  @ApiModelProperty(value = "Image associated with variant option qualifier")
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public VariantOptionQualifier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of variant option qualifier
   * @return name
  **/
  @ApiModelProperty(value = "Name of variant option qualifier")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VariantOptionQualifier qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

   /**
   * Qualifier
   * @return qualifier
  **/
  @ApiModelProperty(value = "Qualifier")
  public String getQualifier() {
    return qualifier;
  }

  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  public VariantOptionQualifier value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value of variant option qualifier
   * @return value
  **/
  @ApiModelProperty(value = "Value of variant option qualifier")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantOptionQualifier variantOptionQualifier = (VariantOptionQualifier) o;
    return Objects.equals(this.image, variantOptionQualifier.image) &&
        Objects.equals(this.name, variantOptionQualifier.name) &&
        Objects.equals(this.qualifier, variantOptionQualifier.qualifier) &&
        Objects.equals(this.value, variantOptionQualifier.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, name, qualifier, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantOptionQualifier {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
