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
 * Representation of a Configuration Info
 */
@ApiModel(description = "Representation of a Configuration Info")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class ConfigurationInfo {
  @SerializedName("configurationLabel")
  private String configurationLabel = null;

  @SerializedName("configurationValue")
  private String configurationValue = null;

  @SerializedName("configuratorType")
  private String configuratorType = null;

  @SerializedName("status")
  private String status = null;

  public ConfigurationInfo configurationLabel(String configurationLabel) {
    this.configurationLabel = configurationLabel;
    return this;
  }

   /**
   * Label of configuration info
   * @return configurationLabel
  **/
  @ApiModelProperty(value = "Label of configuration info")
  public String getConfigurationLabel() {
    return configurationLabel;
  }

  public void setConfigurationLabel(String configurationLabel) {
    this.configurationLabel = configurationLabel;
  }

  public ConfigurationInfo configurationValue(String configurationValue) {
    this.configurationValue = configurationValue;
    return this;
  }

   /**
   * Value of configuration info
   * @return configurationValue
  **/
  @ApiModelProperty(value = "Value of configuration info")
  public String getConfigurationValue() {
    return configurationValue;
  }

  public void setConfigurationValue(String configurationValue) {
    this.configurationValue = configurationValue;
  }

  public ConfigurationInfo configuratorType(String configuratorType) {
    this.configuratorType = configuratorType;
    return this;
  }

   /**
   * Type of configuration info
   * @return configuratorType
  **/
  @ApiModelProperty(value = "Type of configuration info")
  public String getConfiguratorType() {
    return configuratorType;
  }

  public void setConfiguratorType(String configuratorType) {
    this.configuratorType = configuratorType;
  }

  public ConfigurationInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of configuration info
   * @return status
  **/
  @ApiModelProperty(value = "Status of configuration info")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationInfo configurationInfo = (ConfigurationInfo) o;
    return Objects.equals(this.configurationLabel, configurationInfo.configurationLabel) &&
        Objects.equals(this.configurationValue, configurationInfo.configurationValue) &&
        Objects.equals(this.configuratorType, configurationInfo.configuratorType) &&
        Objects.equals(this.status, configurationInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationLabel, configurationValue, configuratorType, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationInfo {\n");
    
    sb.append("    configurationLabel: ").append(toIndentedString(configurationLabel)).append("\n");
    sb.append("    configurationValue: ").append(toIndentedString(configurationValue)).append("\n");
    sb.append("    configuratorType: ").append(toIndentedString(configuratorType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

