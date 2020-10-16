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
@GraphQLObjectType("DeletePaymentTokenOutput")
public class DeletePaymentTokenOutput  {

	public DeletePaymentTokenOutput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "customerPaymentTokens", graphQLTypeName = "CustomerPaymentTokens", javaClass = CustomerPaymentTokens.class)
	CustomerPaymentTokens customerPaymentTokens;


	@GraphQLScalar(fieldName = "result", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean result;



	public void setCustomerPaymentTokens(CustomerPaymentTokens customerPaymentTokens) {
		this.customerPaymentTokens = customerPaymentTokens;
	}

	public CustomerPaymentTokens getCustomerPaymentTokens() {
		return customerPaymentTokens;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getResult() {
		return result;
	}

    public String toString() {
        return "DeletePaymentTokenOutput {"
				+ "customerPaymentTokens: " + customerPaymentTokens
				+ ", "
				+ "result: " + result
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		CustomerPaymentTokens("customerPaymentTokens"),
		Result("result");

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
		private CustomerPaymentTokens customerPaymentTokens;
		private Boolean result;


		public Builder withCustomerPaymentTokens(CustomerPaymentTokens customerPaymentTokens) {
			this.customerPaymentTokens = customerPaymentTokens;
			return this;
		}
		public Builder withResult(Boolean result) {
			this.result = result;
			return this;
		}

		public DeletePaymentTokenOutput build() {
			DeletePaymentTokenOutput _object = new DeletePaymentTokenOutput();
			_object.setCustomerPaymentTokens(customerPaymentTokens);
			_object.setResult(result);
			return _object;
		}
	}
}