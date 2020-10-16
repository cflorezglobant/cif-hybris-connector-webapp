/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("CartItemInput")
public class CartItemInput  {

	public CartItemInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "quantity", graphQLTypeName = "Float", javaClass = Double.class)
	Double quantity;


	@GraphQLScalar(fieldName = "sku", graphQLTypeName = "String", javaClass = String.class)
	String sku;



	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getSku() {
		return sku;
	}

    public String toString() {
        return "CartItemInput {"
				+ "quantity: " + quantity
				+ ", "
				+ "sku: " + sku
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Quantity("quantity"),
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
		private Double quantity;
		private String sku;


		public Builder withQuantity(Double quantity) {
			this.quantity = quantity;
			return this;
		}
		public Builder withSku(String sku) {
			this.sku = sku;
			return this;
		}

		public CartItemInput build() {
			CartItemInput _object = new CartItemInput();
			_object.setQuantity(quantity);
			_object.setSku(sku);
			return _object;
		}
	}
}