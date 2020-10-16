/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("FilterMatchTypeInput")
public class FilterMatchTypeInput  {

	public FilterMatchTypeInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "match", graphQLTypeName = "String", javaClass = String.class)
	String match;



	public void setMatch(String match) {
		this.match = match;
	}

	public String getMatch() {
		return match;
	}

    public String toString() {
        return "FilterMatchTypeInput {"
				+ "match: " + match
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Match("match");

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
		private String match;


		public Builder withMatch(String match) {
			this.match = match;
			return this;
		}

		public FilterMatchTypeInput build() {
			FilterMatchTypeInput _object = new FilterMatchTypeInput();
			_object.setMatch(match);
			return _object;
		}
	}
}
