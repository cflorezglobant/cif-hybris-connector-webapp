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
 * Representation of an UserSignUp. Consists of fields required to register new customer
 */
@ApiModel(description = "Representation of an UserSignUp. Consists of fields required to register new customer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class UserSignUp {
  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("titleCode")
  private String titleCode = null;

  @SerializedName("uid")
  private String uid = null;

  public UserSignUp firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * first name of the user
   * @return firstName
  **/
  @ApiModelProperty(required = true, value = "first name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserSignUp lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * last name of the user
   * @return lastName
  **/
  @ApiModelProperty(required = true, value = "last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserSignUp password(String password) {
    this.password = password;
    return this;
  }

   /**
   * user password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "user password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserSignUp titleCode(String titleCode) {
    this.titleCode = titleCode;
    return this;
  }

   /**
   * Get titleCode
   * @return titleCode
  **/
  @ApiModelProperty(value = "")
  public String getTitleCode() {
    return titleCode;
  }

  public void setTitleCode(String titleCode) {
    this.titleCode = titleCode;
  }

  public UserSignUp uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * user id, unique string required to create new user. It can be email
   * @return uid
  **/
  @ApiModelProperty(required = true, value = "user id, unique string required to create new user. It can be email")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSignUp userSignUp = (UserSignUp) o;
    return Objects.equals(this.firstName, userSignUp.firstName) &&
        Objects.equals(this.lastName, userSignUp.lastName) &&
        Objects.equals(this.password, userSignUp.password) &&
        Objects.equals(this.titleCode, userSignUp.titleCode) &&
        Objects.equals(this.uid, userSignUp.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, password, titleCode, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSignUp {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    titleCode: ").append(toIndentedString(titleCode)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

