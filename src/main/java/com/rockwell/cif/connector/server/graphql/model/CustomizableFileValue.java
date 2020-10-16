/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CustomizableFileValue")
public class CustomizableFileValue  {

	public CustomizableFileValue(){
		// No action
	}

	@GraphQLScalar(fieldName = "file_extension", graphQLTypeName = "String", javaClass = String.class)
	String file_extension;


	@GraphQLScalar(fieldName = "image_size_x", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer image_size_x;


	@GraphQLScalar(fieldName = "image_size_y", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer image_size_y;


	@GraphQLScalar(fieldName = "price", graphQLTypeName = "Float", javaClass = Double.class)
	Double price;


	@GraphQLScalar(fieldName = "price_type", graphQLTypeName = "PriceTypeEnum", javaClass = PriceTypeEnum.class)
	PriceTypeEnum price_type;


	@GraphQLScalar(fieldName = "sku", graphQLTypeName = "String", javaClass = String.class)
	String sku;



	public void setFile_extension(String file_extension) {
		this.file_extension = file_extension;
	}

	public String getFile_extension() {
		return file_extension;
	}

	public void setImage_size_x(Integer image_size_x) {
		this.image_size_x = image_size_x;
	}

	public Integer getImage_size_x() {
		return image_size_x;
	}

	public void setImage_size_y(Integer image_size_y) {
		this.image_size_y = image_size_y;
	}

	public Integer getImage_size_y() {
		return image_size_y;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice_type(PriceTypeEnum price_type) {
		this.price_type = price_type;
	}

	public PriceTypeEnum getPrice_type() {
		return price_type;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSku() {
		return sku;
	}

    public String toString() {
        return "CustomizableFileValue {"
				+ "file_extension: " + file_extension
				+ ", "
				+ "image_size_x: " + image_size_x
				+ ", "
				+ "image_size_y: " + image_size_y
				+ ", "
				+ "price: " + price
				+ ", "
				+ "price_type: " + price_type
				+ ", "
				+ "sku: " + sku
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		File_extension("file_extension"),
		Image_size_x("image_size_x"),
		Image_size_y("image_size_y"),
		Price("price"),
		Price_type("price_type"),
		Sku("sku");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
			return new Builder();
		}



	/**
	 * Builder
	 */
	public static class Builder {
		private String file_extension;
		private Integer image_size_x;
		private Integer image_size_y;
		private Double price;
		private PriceTypeEnum price_type;
		private String sku;


		public Builder withFile_extension(String file_extension) {
			this.file_extension = file_extension;
			return this;
		}
		public Builder withImage_size_x(Integer image_size_x) {
			this.image_size_x = image_size_x;
			return this;
		}
		public Builder withImage_size_y(Integer image_size_y) {
			this.image_size_y = image_size_y;
			return this;
		}
		public Builder withPrice(Double price) {
			this.price = price;
			return this;
		}
		public Builder withPrice_type(PriceTypeEnum price_type) {
			this.price_type = price_type;
			return this;
		}
		public Builder withSku(String sku) {
			this.sku = sku;
			return this;
		}

		public CustomizableFileValue build() {
			CustomizableFileValue _object = new CustomizableFileValue();
			_object.setFile_extension(file_extension);
			_object.setImage_size_x(image_size_x);
			_object.setImage_size_y(image_size_y);
			_object.setPrice(price);
			_object.setPrice_type(price_type);
			_object.setSku(sku);
			return _object;
		}
	}
}