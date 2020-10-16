/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CmsPage")
public class CmsPage  {

	public CmsPage(){
		// No action
	}

	@GraphQLScalar(fieldName = "content", graphQLTypeName = "String", javaClass = String.class)
	String content;


	@GraphQLScalar(fieldName = "content_heading", graphQLTypeName = "String", javaClass = String.class)
	String content_heading;


	@GraphQLScalar(fieldName = "identifier", graphQLTypeName = "String", javaClass = String.class)
	String identifier;


	@GraphQLScalar(fieldName = "meta_description", graphQLTypeName = "String", javaClass = String.class)
	String meta_description;


	@GraphQLScalar(fieldName = "meta_keywords", graphQLTypeName = "String", javaClass = String.class)
	String meta_keywords;


	@GraphQLScalar(fieldName = "meta_title", graphQLTypeName = "String", javaClass = String.class)
	String meta_title;


	@GraphQLScalar(fieldName = "page_layout", graphQLTypeName = "String", javaClass = String.class)
	String page_layout;


	@GraphQLScalar(fieldName = "title", graphQLTypeName = "String", javaClass = String.class)
	String title;


	@GraphQLScalar(fieldName = "url_key", graphQLTypeName = "String", javaClass = String.class)
	String url_key;



	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent_heading(String content_heading) {
		this.content_heading = content_heading;
	}

	public String getContent_heading() {
		return content_heading;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setMeta_description(String meta_description) {
		this.meta_description = meta_description;
	}

	public String getMeta_description() {
		return meta_description;
	}

	public void setMeta_keywords(String meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	public String getMeta_keywords() {
		return meta_keywords;
	}

	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
	}

	public String getMeta_title() {
		return meta_title;
	}

	public void setPage_layout(String page_layout) {
		this.page_layout = page_layout;
	}

	public String getPage_layout() {
		return page_layout;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setUrl_key(String url_key) {
		this.url_key = url_key;
	}

	public String getUrl_key() {
		return url_key;
	}

    public String toString() {
        return "CmsPage {"
				+ "content: " + content
				+ ", "
				+ "content_heading: " + content_heading
				+ ", "
				+ "identifier: " + identifier
				+ ", "
				+ "meta_description: " + meta_description
				+ ", "
				+ "meta_keywords: " + meta_keywords
				+ ", "
				+ "meta_title: " + meta_title
				+ ", "
				+ "page_layout: " + page_layout
				+ ", "
				+ "title: " + title
				+ ", "
				+ "url_key: " + url_key
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Content("content"),
		Content_heading("content_heading"),
		Identifier("identifier"),
		Meta_description("meta_description"),
		Meta_keywords("meta_keywords"),
		Meta_title("meta_title"),
		Page_layout("page_layout"),
		Title("title"),
		Url_key("url_key");

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
		private String content_heading;
		private String identifier;
		private String meta_description;
		private String meta_keywords;
		private String meta_title;
		private String page_layout;
		private String title;
		private String url_key;


		public Builder withContent(String content) {
			this.content = content;
			return this;
		}
		public Builder withContent_heading(String content_heading) {
			this.content_heading = content_heading;
			return this;
		}
		public Builder withIdentifier(String identifier) {
			this.identifier = identifier;
			return this;
		}
		public Builder withMeta_description(String meta_description) {
			this.meta_description = meta_description;
			return this;
		}
		public Builder withMeta_keywords(String meta_keywords) {
			this.meta_keywords = meta_keywords;
			return this;
		}
		public Builder withMeta_title(String meta_title) {
			this.meta_title = meta_title;
			return this;
		}
		public Builder withPage_layout(String page_layout) {
			this.page_layout = page_layout;
			return this;
		}
		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}
		public Builder withUrl_key(String url_key) {
			this.url_key = url_key;
			return this;
		}

		public CmsPage build() {
			CmsPage _object = new CmsPage();
			_object.setContent(content);
			_object.setContent_heading(content_heading);
			_object.setIdentifier(identifier);
			_object.setMeta_description(meta_description);
			_object.setMeta_keywords(meta_keywords);
			_object.setMeta_title(meta_title);
			_object.setPage_layout(page_layout);
			_object.setTitle(title);
			_object.setUrl_key(url_key);
			return _object;
		}
	}
}
