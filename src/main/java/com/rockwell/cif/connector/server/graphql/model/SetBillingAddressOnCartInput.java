/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("SetBillingAddressOnCartInput")
public class SetBillingAddressOnCartInput  {

	public SetBillingAddressOnCartInput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "billing_address", graphQLTypeName = "BillingAddressInput", javaClass = BillingAddressInput.class)
	BillingAddressInput billing_address;


	@GraphQLScalar(fieldName = "cart_id", graphQLTypeName = "String", javaClass = String.class)
	String cart_id;



	public void setBilling_address(BillingAddressInput billing_address) {
		this.billing_address = billing_address;
	}

	public BillingAddressInput getBilling_address() {
		return billing_address;
	}

	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public String getCart_id() {
		return cart_id;
	}

    public String toString() {
        return "SetBillingAddressOnCartInput {"
				+ "billing_address: " + billing_address
				+ ", "
				+ "cart_id: " + cart_id
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Billing_address("billing_address"),
		Cart_id("cart_id");

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
		private BillingAddressInput billing_address;
		private String cart_id;


		public Builder withBilling_address(BillingAddressInput billing_address) {
			this.billing_address = billing_address;
			return this;
		}
		public Builder withCart_id(String cart_id) {
			this.cart_id = cart_id;
			return this;
		}

		public SetBillingAddressOnCartInput build() {
			SetBillingAddressOnCartInput _object = new SetBillingAddressOnCartInput();
			_object.setBilling_address(billing_address);
			_object.setCart_id(cart_id);
			return _object;
		}
	}
}
