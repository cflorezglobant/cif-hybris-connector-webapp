/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("ProductMediaGalleryEntriesContent")
public class ProductMediaGalleryEntriesContent  {

	public ProductMediaGalleryEntriesContent(){
		// No action
	}

	@GraphQLScalar(fieldName = "base64_encoded_data", graphQLTypeName = "String", javaClass = String.class)
	String base64_encoded_data;


	@GraphQLScalar(fieldName = "name", graphQLTypeName = "String", javaClass = String.class)
	String name;


	@GraphQLScalar(fieldName = "type", graphQLTypeName = "String", javaClass = String.class)
	String type;



	public void setBase64_encoded_data(String base64_encoded_data) {
		this.base64_encoded_data = base64_encoded_data;
	}

	public String getBase64_encoded_data() {
		return base64_encoded_data;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

    public String toString() {
        return "ProductMediaGalleryEntriesContent {"
				+ "base64_encoded_data: " + base64_encoded_data
				+ ", "
				+ "name: " + name
				+ ", "
				+ "type: " + type
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Base64_encoded_data("base64_encoded_data"),
		Name("name"),
		Type("type");

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
		private String base64_encoded_data;
		private String name;
		private String type;


		public Builder withBase64_encoded_data(String base64_encoded_data) {
			this.base64_encoded_data = base64_encoded_data;
			return this;
		}
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public ProductMediaGalleryEntriesContent build() {
			ProductMediaGalleryEntriesContent _object = new ProductMediaGalleryEntriesContent();
			_object.setBase64_encoded_data(base64_encoded_data);
			_object.setName(name);
			_object.setType(type);
			return _object;
		}
	}
}