/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("SearchResultPageInfo")
public class SearchResultPageInfo  {

	public SearchResultPageInfo(){
		// No action
	}

	@GraphQLScalar(fieldName = "current_page", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer current_page;


	@GraphQLScalar(fieldName = "page_size", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer page_size;


	@GraphQLScalar(fieldName = "total_pages", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer total_pages;



	public void setCurrent_page(Integer current_page) {
		this.current_page = current_page;
	}

	public Integer getCurrent_page() {
		return current_page;
	}

	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
	}

	public Integer getPage_size() {
		return page_size;
	}

	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}

	public Integer getTotal_pages() {
		return total_pages;
	}

    public String toString() {
        return "SearchResultPageInfo {"
				+ "current_page: " + current_page
				+ ", "
				+ "page_size: " + page_size
				+ ", "
				+ "total_pages: " + total_pages
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Current_page("current_page"),
		Page_size("page_size"),
		Total_pages("total_pages");

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
		private Integer current_page;
		private Integer page_size;
		private Integer total_pages;


		public Builder withCurrent_page(Integer current_page) {
			this.current_page = current_page;
			return this;
		}
		public Builder withPage_size(Integer page_size) {
			this.page_size = page_size;
			return this;
		}
		public Builder withTotal_pages(Integer total_pages) {
			this.total_pages = total_pages;
			return this;
		}

		public SearchResultPageInfo build() {
			SearchResultPageInfo _object = new SearchResultPageInfo();
			_object.setCurrent_page(current_page);
			_object.setPage_size(page_size);
			_object.setTotal_pages(total_pages);
			return _object;
		}
	}
}
