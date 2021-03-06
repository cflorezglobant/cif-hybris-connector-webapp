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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * Representation of an Image
 */
@ApiModel(description = "Representation of an Image")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-23T22:16:40.723Z")



public class Image {
  @SerializedName("altText")
  private String altText = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("galleryIndex")
  private Integer galleryIndex = null;

  /**
   * Type of the image, can be PRIMARY or GALLERY
   */
  @JsonAdapter(ImageTypeEnum.Adapter.class)
  public enum ImageTypeEnum {
    PRIMARY("PRIMARY"),
    
    GALLERY("GALLERY");

    private String value;

    ImageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageTypeEnum fromValue(String text) {
      for (ImageTypeEnum b : ImageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImageTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("imageType")
  private ImageTypeEnum imageType = null;

  @SerializedName("url")
  private String url = null;

  public Image altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Tooltip content which is visible while image mouse hovering
   * @return altText
  **/
  @ApiModelProperty(value = "Tooltip content which is visible while image mouse hovering")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public Image format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Format of the image, can be zoom, product, thumbnail, store, cartIcon, etc.
   * @return format
  **/
  @ApiModelProperty(value = "Format of the image, can be zoom, product, thumbnail, store, cartIcon, etc.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Image galleryIndex(Integer galleryIndex) {
    this.galleryIndex = galleryIndex;
    return this;
  }

   /**
   * Index of the image while displayed in gallery
   * @return galleryIndex
  **/
  @ApiModelProperty(value = "Index of the image while displayed in gallery")
  public Integer getGalleryIndex() {
    return galleryIndex;
  }

  public void setGalleryIndex(Integer galleryIndex) {
    this.galleryIndex = galleryIndex;
  }

  public Image imageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
    return this;
  }

   /**
   * Type of the image, can be PRIMARY or GALLERY
   * @return imageType
  **/
  @ApiModelProperty(value = "Type of the image, can be PRIMARY or GALLERY")
  public ImageTypeEnum getImageType() {
    return imageType;
  }

  public void setImageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
  }

  public Image url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL address of the image
   * @return url
  **/
  @ApiModelProperty(value = "URL address of the image")
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
    Image image = (Image) o;
    return Objects.equals(this.altText, image.altText) &&
        Objects.equals(this.format, image.format) &&
        Objects.equals(this.galleryIndex, image.galleryIndex) &&
        Objects.equals(this.imageType, image.imageType) &&
        Objects.equals(this.url, image.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, format, galleryIndex, imageType, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    galleryIndex: ").append(toIndentedString(galleryIndex)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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

