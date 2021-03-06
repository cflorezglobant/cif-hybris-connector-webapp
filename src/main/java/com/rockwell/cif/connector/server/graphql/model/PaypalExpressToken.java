/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("PaypalExpressToken")
public class PaypalExpressToken  {

	public PaypalExpressToken(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "paypal_urls", graphQLTypeName = "PaypalExpressUrlList", javaClass = PaypalExpressUrlList.class)
	PaypalExpressUrlList paypal_urls;


	@GraphQLScalar(fieldName = "token", graphQLTypeName = "String", javaClass = String.class)
	String token;



	public void setPaypal_urls(PaypalExpressUrlList paypal_urls) {
		this.paypal_urls = paypal_urls;
	}

	public PaypalExpressUrlList getPaypal_urls() {
		return paypal_urls;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

    public String toString() {
        return "PaypalExpressToken {"
				+ "paypal_urls: " + paypal_urls
				+ ", "
				+ "token: " + token
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Paypal_urls("paypal_urls"),
		Token("token");

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
		private PaypalExpressUrlList paypal_urls;
		private String token;


		public Builder withPaypal_urls(PaypalExpressUrlList paypal_urls) {
			this.paypal_urls = paypal_urls;
			return this;
		}
		public Builder withToken(String token) {
			this.token = token;
			return this;
		}

		public PaypalExpressToken build() {
			PaypalExpressToken _object = new PaypalExpressToken();
			_object.setPaypal_urls(paypal_urls);
			_object.setToken(token);
			return _object;
		}
	}
}
