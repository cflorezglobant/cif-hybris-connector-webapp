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
 * Representation of a Consent Template List
 */
@ApiModel(description = "Representation of a Consent Template List")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class ConsentTemplateList {
  @SerializedName("consentTemplates")
  private List<ConsentTemplate> consentTemplates = null;

  public ConsentTemplateList consentTemplates(List<ConsentTemplate> consentTemplates) {
    this.consentTemplates = consentTemplates;
    return this;
  }

  public ConsentTemplateList addConsentTemplatesItem(ConsentTemplate consentTemplatesItem) {
    if (this.consentTemplates == null) {
      this.consentTemplates = new ArrayList<ConsentTemplate>();
    }
    this.consentTemplates.add(consentTemplatesItem);
    return this;
  }

   /**
   * List of consent templates
   * @return consentTemplates
  **/
  @ApiModelProperty(value = "List of consent templates")
  public List<ConsentTemplate> getConsentTemplates() {
    return consentTemplates;
  }

  public void setConsentTemplates(List<ConsentTemplate> consentTemplates) {
    this.consentTemplates = consentTemplates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentTemplateList consentTemplateList = (ConsentTemplateList) o;
    return Objects.equals(this.consentTemplates, consentTemplateList.consentTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentTemplates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentTemplateList {\n");
    
    sb.append("    consentTemplates: ").append(toIndentedString(consentTemplates)).append("\n");
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

