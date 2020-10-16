/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("UpdateCartItemsInput")
public class UpdateCartItemsInput  {

	public UpdateCartItemsInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "cart_id", graphQLTypeName = "String", javaClass = String.class)
	String cart_id;


	@GraphQLNonScalar(fieldName = "cart_items", graphQLTypeName = "CartItemUpdateInput", javaClass = CartItemUpdateInput.class)
	List<CartItemUpdateInput> cart_items;



	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public String getCart_id() {
		return cart_id;
	}

	public void setCart_items(List<CartItemUpdateInput> cart_items) {
		this.cart_items = cart_items;
	}

	public List<CartItemUpdateInput> getCart_items() {
		return cart_items;
	}

    public String toString() {
        return "UpdateCartItemsInput {"
				+ "cart_id: " + cart_id
				+ ", "
				+ "cart_items: " + cart_items
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Cart_id("cart_id"),
		Cart_items("cart_items");

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
		private List<CartItemUpdateInput> cart_items;


		public Builder withCart_id(String cart_id) {
			this.cart_id = cart_id;
			return this;
		}
		public Builder withCart_items(List<CartItemUpdateInput> cart_items) {
			this.cart_items = cart_items;
			return this;
		}

		public UpdateCartItemsInput build() {
			UpdateCartItemsInput _object = new UpdateCartItemsInput();
			_object.setCart_id(cart_id);
			_object.setCart_items(cart_items);
			return _object;
		}
	}
}