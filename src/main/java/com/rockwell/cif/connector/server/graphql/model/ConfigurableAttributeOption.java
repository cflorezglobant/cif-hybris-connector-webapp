/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("ConfigurableAttributeOption")
public class ConfigurableAttributeOption  {

	public ConfigurableAttributeOption(){
		// No action
	}

	@GraphQLScalar(fieldName = "code", graphQLTypeName = "String", javaClass = String.class)
	String code;


	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;


	@GraphQLScalar(fieldName = "value_index", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer value_index;



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

	public void setValue_index(Integer value_index) {
		this.value_index = value_index;
	}

	public Integer getValue_index() {
		return value_index;
	}

    public String toString() {
        return "ConfigurableAttributeOption {"
				+ "code: " + code
				+ ", "
				+ "label: " + label
				+ ", "
				+ "value_index: " + value_index
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Code("code"),
		Label("label"),
		Value_index("value_index");

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
		private Integer value_index;


		public Builder withCode(String code) {
			this.code = code;
			return this;
		}
		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}
		public Builder withValue_index(Integer value_index) {
			this.value_index = value_index;
			return this;
		}

		public ConfigurableAttributeOption build() {
			ConfigurableAttributeOption _object = new ConfigurableAttributeOption();
			_object.setCode(code);
			_object.setLabel(label);
			_object.setValue_index(value_index);
			return _object;
		}
	}
}