/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CartAddressRegion")
public class CartAddressRegion  {

	public CartAddressRegion(){
		// No action
	}

	@GraphQLScalar(fieldName = "code", graphQLTypeName = "String", javaClass = String.class)
	String code;


	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;



	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

    public String toString() {
        return "CartAddressRegion {"
				+ "code: " + code
				+ ", "
				+ "label: " + label
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Code("code"),
		Label("label");

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
		private String code;
		private String label;


		public Builder withCode(String code) {
			this.code = code;
			return this;
		}
		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}

		public CartAddressRegion build() {
			CartAddressRegion _object = new CartAddressRegion();
			_object.setCode(code);
			_object.setLabel(label);
			return _object;
		}
	}
}
