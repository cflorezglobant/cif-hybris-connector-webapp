/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("SetShippingMethodsOnCartOutput")
public class SetShippingMethodsOnCartOutput  {

	public SetShippingMethodsOnCartOutput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "cart", graphQLTypeName = "Cart", javaClass = Cart.class)
	Cart cart;



	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Cart getCart() {
		return cart;
	}

    public String toString() {
        return "SetShippingMethodsOnCartOutput {"
				+ "cart: " + cart
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Cart("cart");

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
		private Cart cart;


		public Builder withCart(Cart cart) {
			this.cart = cart;
			return this;
		}

		public SetShippingMethodsOnCartOutput build() {
			SetShippingMethodsOnCartOutput _object = new SetShippingMethodsOnCartOutput();
			_object.setCart(cart);
			return _object;
		}
	}
}
