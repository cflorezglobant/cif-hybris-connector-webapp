/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("AttributeOption")
public class AttributeOption  {

	public AttributeOption(){
		// No action
	}

	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;


	@GraphQLScalar(fieldName = "value", graphQLTypeName = "String", javaClass = String.class)
	String value;



	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

    public String toString() {
        return "AttributeOption {"
				+ "label: " + label
				+ ", "
				+ "value: " + value
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Label("label"),
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
		private String label;
		private String value;


		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}
		public Builder withValue(String value) {
			this.value = value;
			return this;
		}

		public AttributeOption build() {
			AttributeOption _object = new AttributeOption();
			_object.setLabel(label);
			_object.setValue(value);
			return _object;
		}
	}
}
