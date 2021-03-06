/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("RemoveItemFromCartInput")
public class RemoveItemFromCartInput  {

	public RemoveItemFromCartInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "cart_id", graphQLTypeName = "String", javaClass = String.class)
	String cart_id;


	@GraphQLScalar(fieldName = "cart_item_id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer cart_item_id;



	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public String getCart_id() {
		return cart_id;
	}

	public void setCart_item_id(Integer cart_item_id) {
		this.cart_item_id = cart_item_id;
	}

	public Integer getCart_item_id() {
		return cart_item_id;
	}

    public String toString() {
        return "RemoveItemFromCartInput {"
				+ "cart_id: " + cart_id
				+ ", "
				+ "cart_item_id: " + cart_item_id
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Cart_id("cart_id"),
		Cart_item_id("cart_item_id");

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
		private String cart_id;
		private Integer cart_item_id;


		public Builder withCart_id(String cart_id) {
			this.cart_id = cart_id;
			return this;
		}
		public Builder withCart_item_id(Integer cart_item_id) {
			this.cart_item_id = cart_item_id;
			return this;
		}

		public RemoveItemFromCartInput build() {
			RemoveItemFromCartInput _object = new RemoveItemFromCartInput();
			_object.setCart_id(cart_id);
			_object.setCart_item_id(cart_item_id);
			return _object;
		}
	}
}
