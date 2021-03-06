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
@GraphQLObjectType("WishlistOutput")
public class WishlistOutput  {

	public WishlistOutput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "items", graphQLTypeName = "WishlistItem", javaClass = WishlistItem.class)
	List<WishlistItem> items;


	@GraphQLScalar(fieldName = "items_count", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer items_count;


	@GraphQLScalar(fieldName = "name", graphQLTypeName = "String", javaClass = String.class)
	String name;


	@GraphQLScalar(fieldName = "sharing_code", graphQLTypeName = "String", javaClass = String.class)
	String sharing_code;


	@GraphQLScalar(fieldName = "updated_at", graphQLTypeName = "String", javaClass = String.class)
	String updated_at;



	public void setItems(List<WishlistItem> items) {
		this.items = items;
	}

	public List<WishlistItem> getItems() {
		return items;
	}

	public void setItems_count(Integer items_count) {
		this.items_count = items_count;
	}

	public Integer getItems_count() {
		return items_count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSharing_code(String sharing_code) {
		this.sharing_code = sharing_code;
	}

	public String getSharing_code() {
		return sharing_code;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

    public String toString() {
        return "WishlistOutput {"
				+ "items: " + items
				+ ", "
				+ "items_count: " + items_count
				+ ", "
				+ "name: " + name
				+ ", "
				+ "sharing_code: " + sharing_code
				+ ", "
				+ "updated_at: " + updated_at
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Items("items"),
		Items_count("items_count"),
		Name("name"),
		Sharing_code("sharing_code"),
		Updated_at("updated_at");

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
		private List<WishlistItem> items;
		private Integer items_count;
		private String name;
		private String sharing_code;
		private String updated_at;


		public Builder withItems(List<WishlistItem> items) {
			this.items = items;
			return this;
		}
		public Builder withItems_count(Integer items_count) {
			this.items_count = items_count;
			return this;
		}
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Builder withSharing_code(String sharing_code) {
			this.sharing_code = sharing_code;
			return this;
		}
		public Builder withUpdated_at(String updated_at) {
			this.updated_at = updated_at;
			return this;
		}

		public WishlistOutput build() {
			WishlistOutput _object = new WishlistOutput();
			_object.setItems(items);
			_object.setItems_count(items_count);
			_object.setName(name);
			_object.setSharing_code(sharing_code);
			_object.setUpdated_at(updated_at);
			return _object;
		}
	}
}
