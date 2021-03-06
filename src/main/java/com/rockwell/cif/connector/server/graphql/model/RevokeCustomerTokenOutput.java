/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("RevokeCustomerTokenOutput")
public class RevokeCustomerTokenOutput  {

	public RevokeCustomerTokenOutput(){
		// No action
	}

	@GraphQLScalar(fieldName = "result", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean result;



	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getResult() {
		return result;
	}

    public String toString() {
        return "RevokeCustomerTokenOutput {"
				+ "result: " + result
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
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
		private Boolean result;


		public Builder withResult(Boolean result) {
			this.result = result;
			return this;
		}

		public RevokeCustomerTokenOutput build() {
			RevokeCustomerTokenOutput _object = new RevokeCustomerTokenOutput();
			_object.setResult(result);
			return _object;
		}
	}
}
