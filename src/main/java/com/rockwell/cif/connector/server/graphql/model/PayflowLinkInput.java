/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("PayflowLinkInput")
public class PayflowLinkInput  {

	public PayflowLinkInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "cancel_url", graphQLTypeName = "String", javaClass = String.class)
	String cancel_url;


	@GraphQLScalar(fieldName = "error_url", graphQLTypeName = "String", javaClass = String.class)
	String error_url;


	@GraphQLScalar(fieldName = "return_url", graphQLTypeName = "String", javaClass = String.class)
	String return_url;



	public void setCancel_url(String cancel_url) {
		this.cancel_url = cancel_url;
	}

	public String getCancel_url() {
		return cancel_url;
	}

	public void setError_url(String error_url) {
		this.error_url = error_url;
	}

	public String getError_url() {
		return error_url;
	}

	public void setReturn_url(String return_url) {
		this.return_url = return_url;
	}

	public String getReturn_url() {
		return return_url;
	}

    public String toString() {
        return "PayflowLinkInput {"
				+ "cancel_url: " + cancel_url
				+ ", "
				+ "error_url: " + error_url
				+ ", "
				+ "return_url: " + return_url
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Cancel_url("cancel_url"),
		Error_url("error_url"),
		Return_url("return_url");

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
		private String cancel_url;
		private String error_url;
		private String return_url;


		public Builder withCancel_url(String cancel_url) {
			this.cancel_url = cancel_url;
			return this;
		}
		public Builder withError_url(String error_url) {
			this.error_url = error_url;
			return this;
		}
		public Builder withReturn_url(String return_url) {
			this.return_url = return_url;
			return this;
		}

		public PayflowLinkInput build() {
			PayflowLinkInput _object = new PayflowLinkInput();
			_object.setCancel_url(cancel_url);
			_object.setError_url(error_url);
			_object.setReturn_url(return_url);
			return _object;
		}
	}
}
