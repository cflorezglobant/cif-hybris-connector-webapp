/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CmsBlock")
public class CmsBlock  {

	public CmsBlock(){
		// No action
	}

	@GraphQLScalar(fieldName = "content", graphQLTypeName = "String", javaClass = String.class)
	String content;


	@GraphQLScalar(fieldName = "identifier", graphQLTypeName = "String", javaClass = String.class)
	String identifier;


	@GraphQLScalar(fieldName = "title", graphQLTypeName = "String", javaClass = String.class)
	String title;



	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

    public String toString() {
        return "CmsBlock {"
				+ "content: " + content
				+ ", "
				+ "identifier: " + identifier
				+ ", "
				+ "title: " + title
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Content("content"),
		Identifier("identifier"),
		Title("title");

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
		private String content;
		private String identifier;
		private String title;


		public Builder withContent(String content) {
			this.content = content;
			return this;
		}
		public Builder withIdentifier(String identifier) {
			this.identifier = identifier;
			return this;
		}
		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public CmsBlock build() {
			CmsBlock _object = new CmsBlock();
			_object.setContent(content);
			_object.setIdentifier(identifier);
			_object.setTitle(title);
			return _object;
		}
	}
}
