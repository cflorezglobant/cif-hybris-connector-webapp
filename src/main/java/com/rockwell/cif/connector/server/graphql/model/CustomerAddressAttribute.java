/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CustomerAddressAttribute")
public class CustomerAddressAttribute  {

	public CustomerAddressAttribute(){
		// No action
	}

	@GraphQLScalar(fieldName = "attribute_code", graphQLTypeName = "String", javaClass = String.class)
	String attribute_code;


	@GraphQLScalar(fieldName = "value", graphQLTypeName = "String", javaClass = String.class)
	String value;



	public void setAttribute_code(String attribute_code) {
		this.attribute_code = attribute_code;
	}

	public String getAttribute_code() {
		return attribute_code;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

    public String toString() {
        return "CustomerAddressAttribute {"
				+ "attribute_code: " + attribute_code
				+ ", "
				+ "value: " + value
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Attribute_code("attribute_code"),
		Value("value");

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
		private String attribute_code;
		private String value;


		public Builder withAttribute_code(String attribute_code) {
			this.attribute_code = attribute_code;
			return this;
		}
		public Builder withValue(String value) {
			this.value = value;
			return this;
		}

		public CustomerAddressAttribute build() {
			CustomerAddressAttribute _object = new CustomerAddressAttribute();
			_object.setAttribute_code(attribute_code);
			_object.setValue(value);
			return _object;
		}
	}
}
