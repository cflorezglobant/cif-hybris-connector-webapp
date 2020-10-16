/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CustomizableAreaValue")
public class CustomizableAreaValue  {

	public CustomizableAreaValue(){
		// No action
	}

	@GraphQLScalar(fieldName = "max_characters", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer max_characters;


	@GraphQLScalar(fieldName = "price", graphQLTypeName = "Float", javaClass = Double.class)
	Double price;


	@GraphQLScalar(fieldName = "price_type", graphQLTypeName = "PriceTypeEnum", javaClass = PriceTypeEnum.class)
	PriceTypeEnum price_type;


	@GraphQLScalar(fieldName = "sku", graphQLTypeName = "String", javaClass = String.class)
	String sku;



	public void setMax_characters(Integer max_characters) {
		this.max_characters = max_characters;
	}

	public Integer getMax_characters() {
		return max_characters;
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
        return "CustomizableAreaValue {"
				+ "max_characters: " + max_characters
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
		Max_characters("max_characters"),
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
		private Integer max_characters;
		private Double price;
		private PriceTypeEnum price_type;
		private String sku;


		public Builder withMax_characters(Integer max_characters) {
			this.max_characters = max_characters;
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

		public CustomizableAreaValue build() {
			CustomizableAreaValue _object = new CustomizableAreaValue();
			_object.setMax_characters(max_characters);
			_object.setPrice(price);
			_object.setPrice_type(price_type);
			_object.setSku(sku);
			return _object;
		}
	}
}
