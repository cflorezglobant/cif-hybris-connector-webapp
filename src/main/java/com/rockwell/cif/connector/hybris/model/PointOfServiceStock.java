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

import java.util.*;

/**
 * Representation of a Point Of Service Stock
 */
@ApiModel(description = "Representation of a Point Of Service Stock")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class PointOfServiceStock {
  @SerializedName("address")
  private Address address = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("distanceKm")
  private Double distanceKm = null;

  @SerializedName("features")
  private Map<String, String> features = null;

  @SerializedName("formattedDistance")
  private String formattedDistance = null;

  @SerializedName("geoPoint")
  private GeoPoint geoPoint = null;

  @SerializedName("mapIcon")
  private Image mapIcon = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("openingHours")
  private OpeningSchedule openingHours = null;

  @SerializedName("stockInfo")
  private Stock stockInfo = null;

  @SerializedName("storeContent")
  private String storeContent = null;

  @SerializedName("storeImages")
  private List<Image> storeImages = null;

  @SerializedName("url")
  private String url = null;

  public PointOfServiceStock address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Address information of point of service
   * @return address
  **/
  @ApiModelProperty(value = "Address information of point of service")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public PointOfServiceStock description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the point of service
   * @return description
  **/
  @ApiModelProperty(value = "Description of the point of service")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PointOfServiceStock displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the point of service
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the point of service")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PointOfServiceStock distanceKm(Double distanceKm) {
    this.distanceKm = distanceKm;
    return this;
  }

   /**
   * Distance to the point of service as number value
   * @return distanceKm
  **/
  @ApiModelProperty(value = "Distance to the point of service as number value")
  public Double getDistanceKm() {
    return distanceKm;
  }

  public void setDistanceKm(Double distanceKm) {
    this.distanceKm = distanceKm;
  }

  public PointOfServiceStock features(Map<String, String> features) {
    this.features = features;
    return this;
  }

  public PointOfServiceStock putFeaturesItem(String key, String featuresItem) {
    if (this.features == null) {
      this.features = new HashMap<String, String>();
    }
    this.features.put(key, featuresItem);
    return this;
  }

   /**
   * List of features for a given point of service
   * @return features
  **/
  @ApiModelProperty(value = "List of features for a given point of service")
  public Map<String, String> getFeatures() {
    return features;
  }

  public void setFeatures(Map<String, String> features) {
    this.features = features;
  }

  public PointOfServiceStock formattedDistance(String formattedDistance) {
    this.formattedDistance = formattedDistance;
    return this;
  }

   /**
   * Distance to the point of service as text value
   * @return formattedDistance
  **/
  @ApiModelProperty(value = "Distance to the point of service as text value")
  public String getFormattedDistance() {
    return formattedDistance;
  }

  public void setFormattedDistance(String formattedDistance) {
    this.formattedDistance = formattedDistance;
  }

  public PointOfServiceStock geoPoint(GeoPoint geoPoint) {
    this.geoPoint = geoPoint;
    return this;
  }

   /**
   * Geopoint localization info about point of service
   * @return geoPoint
  **/
  @ApiModelProperty(value = "Geopoint localization info about point of service")
  public GeoPoint getGeoPoint() {
    return geoPoint;
  }

  public void setGeoPoint(GeoPoint geoPoint) {
    this.geoPoint = geoPoint;
  }

  public PointOfServiceStock mapIcon(Image mapIcon) {
    this.mapIcon = mapIcon;
    return this;
  }

   /**
   * Image associated with the point of service
   * @return mapIcon
  **/
  @ApiModelProperty(value = "Image associated with the point of service")
  public Image getMapIcon() {
    return mapIcon;
  }

  public void setMapIcon(Image mapIcon) {
    this.mapIcon = mapIcon;
  }

  public PointOfServiceStock name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the point of service
   * @return name
  **/
  @ApiModelProperty(value = "Name of the point of service")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PointOfServiceStock openingHours(OpeningSchedule openingHours) {
    this.openingHours = openingHours;
    return this;
  }

   /**
   * Opening hours of point of service
   * @return openingHours
  **/
  @ApiModelProperty(value = "Opening hours of point of service")
  public OpeningSchedule getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(OpeningSchedule openingHours) {
    this.openingHours = openingHours;
  }

  public PointOfServiceStock stockInfo(Stock stockInfo) {
    this.stockInfo = stockInfo;
    return this;
  }

   /**
   * Stock information about point of service
   * @return stockInfo
  **/
  @ApiModelProperty(value = "Stock information about point of service")
  public Stock getStockInfo() {
    return stockInfo;
  }

  public void setStockInfo(Stock stockInfo) {
    this.stockInfo = stockInfo;
  }

  public PointOfServiceStock storeContent(String storeContent) {
    this.storeContent = storeContent;
    return this;
  }

   /**
   * Store content of given point of service
   * @return storeContent
  **/
  @ApiModelProperty(value = "Store content of given point of service")
  public String getStoreContent() {
    return storeContent;
  }

  public void setStoreContent(String storeContent) {
    this.storeContent = storeContent;
  }

  public PointOfServiceStock storeImages(List<Image> storeImages) {
    this.storeImages = storeImages;
    return this;
  }

  public PointOfServiceStock addStoreImagesItem(Image storeImagesItem) {
    if (this.storeImages == null) {
      this.storeImages = new ArrayList<Image>();
    }
    this.storeImages.add(storeImagesItem);
    return this;
  }

   /**
   * Collection of images associated with a point of service
   * @return storeImages
  **/
  @ApiModelProperty(value = "Collection of images associated with a point of service")
  public List<Image> getStoreImages() {
    return storeImages;
  }

  public void setStoreImages(List<Image> storeImages) {
    this.storeImages = storeImages;
  }

  public PointOfServiceStock url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url address of the point of service
   * @return url
  **/
  @ApiModelProperty(value = "Url address of the point of service")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfServiceStock pointOfServiceStock = (PointOfServiceStock) o;
    return Objects.equals(this.address, pointOfServiceStock.address) &&
        Objects.equals(this.description, pointOfServiceStock.description) &&
        Objects.equals(this.displayName, pointOfServiceStock.displayName) &&
        Objects.equals(this.distanceKm, pointOfServiceStock.distanceKm) &&
        Objects.equals(this.features, pointOfServiceStock.features) &&
        Objects.equals(this.formattedDistance, pointOfServiceStock.formattedDistance) &&
        Objects.equals(this.geoPoint, pointOfServiceStock.geoPoint) &&
        Objects.equals(this.mapIcon, pointOfServiceStock.mapIcon) &&
        Objects.equals(this.name, pointOfServiceStock.name) &&
        Objects.equals(this.openingHours, pointOfServiceStock.openingHours) &&
        Objects.equals(this.stockInfo, pointOfServiceStock.stockInfo) &&
        Objects.equals(this.storeContent, pointOfServiceStock.storeContent) &&
        Objects.equals(this.storeImages, pointOfServiceStock.storeImages) &&
        Objects.equals(this.url, pointOfServiceStock.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, description, displayName, distanceKm, features, formattedDistance, geoPoint, mapIcon, name, openingHours, stockInfo, storeContent, storeImages, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfServiceStock {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    distanceKm: ").append(toIndentedString(distanceKm)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    formattedDistance: ").append(toIndentedString(formattedDistance)).append("\n");
    sb.append("    geoPoint: ").append(toIndentedString(geoPoint)).append("\n");
    sb.append("    mapIcon: ").append(toIndentedString(mapIcon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
    sb.append("    stockInfo: ").append(toIndentedString(stockInfo)).append("\n");
    sb.append("    storeContent: ").append(toIndentedString(storeContent)).append("\n");
    sb.append("    storeImages: ").append(toIndentedString(storeImages)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

