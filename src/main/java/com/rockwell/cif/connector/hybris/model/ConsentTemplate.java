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
 * Representation of a Consent Template
 */
@ApiModel(description = "Representation of a Consent Template")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class ConsentTemplate {
  @SerializedName("currentConsent")
  private Consent currentConsent = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private Integer version = null;

  public ConsentTemplate currentConsent(Consent currentConsent) {
    this.currentConsent = currentConsent;
    return this;
  }

   /**
   * Current consent
   * @return currentConsent
  **/
  @ApiModelProperty(value = "Current consent")
  public Consent getCurrentConsent() {
    return currentConsent;
  }

  public void setCurrentConsent(Consent currentConsent) {
    this.currentConsent = currentConsent;
  }

  public ConsentTemplate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Consent template description
   * @return description
  **/
  @ApiModelProperty(value = "Consent template description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConsentTemplate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Consent template identifier
   * @return id
  **/
  @ApiModelProperty(value = "Consent template identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConsentTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Consent template name
   * @return name
  **/
  @ApiModelProperty(value = "Consent template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConsentTemplate version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Consent template version
   * @return version
  **/
  @ApiModelProperty(value = "Consent template version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentTemplate consentTemplate = (ConsentTemplate) o;
    return Objects.equals(this.currentConsent, consentTemplate.currentConsent) &&
        Objects.equals(this.description, consentTemplate.description) &&
        Objects.equals(this.id, consentTemplate.id) &&
        Objects.equals(this.name, consentTemplate.name) &&
        Objects.equals(this.version, consentTemplate.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentConsent, description, id, name, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentTemplate {\n");
    
    sb.append("    currentConsent: ").append(toIndentedString(currentConsent)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

