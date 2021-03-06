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
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class PaymentRequest {
  @SerializedName("mappingLabels")
  private Map<String, String> mappingLabels = null;

  @SerializedName("parameters")
  private Map<String, String> parameters = null;

  @SerializedName("postUrl")
  private String postUrl = null;

  public PaymentRequest mappingLabels(Map<String, String> mappingLabels) {
    this.mappingLabels = mappingLabels;
    return this;
  }

  public PaymentRequest putMappingLabelsItem(String key, String mappingLabelsItem) {
    if (this.mappingLabels == null) {
      this.mappingLabels = new HashMap<String, String>();
    }
    this.mappingLabels.put(key, mappingLabelsItem);
    return this;
  }

   /**
   * Get mappingLabels
   * @return mappingLabels
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMappingLabels() {
    return mappingLabels;
  }

  public void setMappingLabels(Map<String, String> mappingLabels) {
    this.mappingLabels = mappingLabels;
  }

  public PaymentRequest parameters(Map<String, String> parameters) {
    this.parameters = parameters;
    return this;
  }

  public PaymentRequest putParametersItem(String key, String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, String>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }

  public PaymentRequest postUrl(String postUrl) {
    this.postUrl = postUrl;
    return this;
  }

   /**
   * Get postUrl
   * @return postUrl
  **/
  @ApiModelProperty(value = "")
  public String getPostUrl() {
    return postUrl;
  }

  public void setPostUrl(String postUrl) {
    this.postUrl = postUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.mappingLabels, paymentRequest.mappingLabels) &&
        Objects.equals(this.parameters, paymentRequest.parameters) &&
        Objects.equals(this.postUrl, paymentRequest.postUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappingLabels, parameters, postUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    
    sb.append("    mappingLabels: ").append(toIndentedString(mappingLabels)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    postUrl: ").append(toIndentedString(postUrl)).append("\n");
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

