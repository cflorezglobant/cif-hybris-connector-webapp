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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrderForm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class OrderForm {
  @SerializedName("code")
  private String code = null;

  @SerializedName("currency")
  private Currency currency = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("entries")
  private List<OrderFormEntry> entries = null;

  @SerializedName("user")
  private Principal user = null;

  public OrderForm code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrderForm currency(Currency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public OrderForm description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderForm entries(List<OrderFormEntry> entries) {
    this.entries = entries;
    return this;
  }

  public OrderForm addEntriesItem(OrderFormEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<OrderFormEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(value = "")
  public List<OrderFormEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<OrderFormEntry> entries) {
    this.entries = entries;
  }

  public OrderForm user(Principal user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public Principal getUser() {
    return user;
  }

  public void setUser(Principal user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderForm orderForm = (OrderForm) o;
    return Objects.equals(this.code, orderForm.code) &&
        Objects.equals(this.currency, orderForm.currency) &&
        Objects.equals(this.description, orderForm.description) &&
        Objects.equals(this.entries, orderForm.entries) &&
        Objects.equals(this.user, orderForm.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, currency, description, entries, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderForm {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
