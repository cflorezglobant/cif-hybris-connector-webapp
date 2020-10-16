/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CategoryProducts")
public class CategoryProducts  {

	public CategoryProducts(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "items", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	List<ProductInterface> items;


	@GraphQLNonScalar(fieldName = "page_info", graphQLTypeName = "SearchResultPageInfo", javaClass = SearchResultPageInfo.class)
	SearchResultPageInfo page_info;


	@GraphQLScalar(fieldName = "total_count", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer total_count;



	public void setItems(List<ProductInterface> items) {
		this.items = items;
	}

	public List<ProductInterface> getItems() {
		return items;
	}

	public void setPage_info(SearchResultPageInfo page_info) {
		this.page_info = page_info;
	}

	public SearchResultPageInfo getPage_info() {
		return page_info;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public Integer getTotal_count() {
		return total_count;
	}

    public String toString() {
        return "CategoryProducts {"
				+ "items: " + items
				+ ", "
				+ "page_info: " + page_info
				+ ", "
				+ "total_count: " + total_count
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Items("items"),
		Page_info("page_info"),
		Total_count("total_count");

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
		private List<ProductInterface> items;
		private SearchResultPageInfo page_info;
		private Integer total_count;


		public Builder withItems(List<ProductInterface> items) {
			this.items = items;
			return this;
		}
		public Builder withPage_info(SearchResultPageInfo page_info) {
			this.page_info = page_info;
			return this;
		}
		public Builder withTotal_count(Integer total_count) {
			this.total_count = total_count;
			return this;
		}

		public CategoryProducts build() {
			CategoryProducts _object = new CategoryProducts();
			_object.setItems(items);
			_object.setPage_info(page_info);
			_object.setTotal_count(total_count);
			return _object;
		}
	}
}