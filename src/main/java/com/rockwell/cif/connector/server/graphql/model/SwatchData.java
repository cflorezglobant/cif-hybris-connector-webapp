/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("SwatchData")
public class SwatchData  {

	public SwatchData(){
		// No action
	}

	@GraphQLScalar(fieldName = "type", graphQLTypeName = "String", javaClass = String.class)
	String type;


	@GraphQLScalar(fieldName = "value", graphQLTypeName = "String", javaClass = String.class)
	String value;



	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

    public String toString() {
        return "SwatchData {"
				+ "type: " + type
				+ ", "
				+ "value: " + value
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Type("type"),
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
		private String type;
		private String value;


		public Builder withType(String type) {
			this.type = type;
			return this;
		}
		public Builder withValue(String value) {
			this.value = value;
			return this;
		}

		public SwatchData build() {
			SwatchData _object = new SwatchData();
			_object.setType(type);
			_object.setValue(value);
			return _object;
		}
	}
}
