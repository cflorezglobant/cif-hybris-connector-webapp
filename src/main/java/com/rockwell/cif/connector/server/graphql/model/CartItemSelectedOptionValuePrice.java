/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CartItemSelectedOptionValuePrice")
public class CartItemSelectedOptionValuePrice  {

	public CartItemSelectedOptionValuePrice(){
		// No action
	}

	@GraphQLScalar(fieldName = "type", graphQLTypeName = "PriceTypeEnum", javaClass = PriceTypeEnum.class)
	PriceTypeEnum type;


	@GraphQLScalar(fieldName = "units", graphQLTypeName = "String", javaClass = String.class)
	String units;


	@GraphQLScalar(fieldName = "value", graphQLTypeName = "Float", javaClass = Double.class)
	Double value;



	public void setType(PriceTypeEnum type) {
		this.type = type;
	}

	public PriceTypeEnum getType() {
		return type;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getUnits() {
		return units;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

    public String toString() {
        return "CartItemSelectedOptionValuePrice {"
				+ "type: " + type
				+ ", "
				+ "units: " + units
				+ ", "
				+ "value: " + value
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Type("type"),
		Units("units"),
		Value("value");

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
		private PriceTypeEnum type;
		private String units;
		private Double value;


		public Builder withType(PriceTypeEnum type) {
			this.type = type;
			return this;
		}
		public Builder withUnits(String units) {
			this.units = units;
			return this;
		}
		public Builder withValue(Double value) {
			this.value = value;
			return this;
		}

		public CartItemSelectedOptionValuePrice build() {
			CartItemSelectedOptionValuePrice _object = new CartItemSelectedOptionValuePrice();
			_object.setType(type);
			_object.setUnits(units);
			_object.setValue(value);
			return _object;
		}
	}
}
