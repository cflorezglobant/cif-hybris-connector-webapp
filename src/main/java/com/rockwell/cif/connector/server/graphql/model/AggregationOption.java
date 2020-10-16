/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("AggregationOption")
public class AggregationOption implements AggregationOptionInterface {

	public AggregationOption(){
		// No action
	}

	@GraphQLScalar(fieldName = "count", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer count;


	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;


	@GraphQLScalar(fieldName = "value", graphQLTypeName = "String", javaClass = String.class)
	String value;



	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

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
        return "AggregationOption {"
				+ "count: " + count
				+ ", "
				+ "label: " + label
				+ ", "
				+ "value: " + value
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Count("count"),
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
		private Integer count;
		private String label;
		private String value;


		public Builder withCount(Integer count) {
			this.count = count;
			return this;
		}
		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}
		public Builder withValue(String value) {
			this.value = value;
			return this;
		}

		public AggregationOption build() {
			AggregationOption _object = new AggregationOption();
			_object.setCount(count);
			_object.setLabel(label);
			_object.setValue(value);
			return _object;
		}
	}
}
