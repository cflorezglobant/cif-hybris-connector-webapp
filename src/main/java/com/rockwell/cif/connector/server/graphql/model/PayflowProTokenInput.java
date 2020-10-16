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
@GraphQLInputType("PayflowProTokenInput")
public class PayflowProTokenInput  {

	public PayflowProTokenInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "cart_id", graphQLTypeName = "String", javaClass = String.class)
	String cart_id;


	@GraphQLNonScalar(fieldName = "urls", graphQLTypeName = "PayflowProUrlInput", javaClass = PayflowProUrlInput.class)
	PayflowProUrlInput urls;



	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public String getCart_id() {
		return cart_id;
	}

	public void setUrls(PayflowProUrlInput urls) {
		this.urls = urls;
	}

	public PayflowProUrlInput getUrls() {
		return urls;
	}

    public String toString() {
        return "PayflowProTokenInput {"
				+ "cart_id: " + cart_id
				+ ", "
				+ "urls: " + urls
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Cart_id("cart_id"),
		Urls("urls");

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
		private PayflowProUrlInput urls;


		public Builder withCart_id(String cart_id) {
			this.cart_id = cart_id;
			return this;
		}
		public Builder withUrls(PayflowProUrlInput urls) {
			this.urls = urls;
			return this;
		}

		public PayflowProTokenInput build() {
			PayflowProTokenInput _object = new PayflowProTokenInput();
			_object.setCart_id(cart_id);
			_object.setUrls(urls);
			return _object;
		}
	}
}