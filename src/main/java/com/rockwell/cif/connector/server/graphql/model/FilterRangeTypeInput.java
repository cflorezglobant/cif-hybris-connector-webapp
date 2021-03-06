/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("FilterRangeTypeInput")
public class FilterRangeTypeInput  {

	public FilterRangeTypeInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "from", graphQLTypeName = "String", javaClass = String.class)
	String from;


	@GraphQLScalar(fieldName = "to", graphQLTypeName = "String", javaClass = String.class)
	String to;



	public void setFrom(String from) {
		this.from = from;
	}

	public String getFrom() {
		return from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTo() {
		return to;
	}

    public String toString() {
        return "FilterRangeTypeInput {"
				+ "from: " + from
				+ ", "
				+ "to: " + to
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		From("from"),
		To("to");

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
		private String from;
		private String to;


		public Builder withFrom(String from) {
			this.from = from;
			return this;
		}
		public Builder withTo(String to) {
			this.to = to;
			return this;
		}

		public FilterRangeTypeInput build() {
			FilterRangeTypeInput _object = new FilterRangeTypeInput();
			_object.setFrom(from);
			_object.setTo(to);
			return _object;
		}
	}
}
