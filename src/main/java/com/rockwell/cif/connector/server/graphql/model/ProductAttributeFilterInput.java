/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("ProductAttributeFilterInput")
public class ProductAttributeFilterInput  {

	public ProductAttributeFilterInput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "category_id", graphQLTypeName = "FilterEqualTypeInput", javaClass = FilterEqualTypeInput.class)
	FilterEqualTypeInput category_id;


	@GraphQLNonScalar(fieldName = "description", graphQLTypeName = "FilterMatchTypeInput", javaClass = FilterMatchTypeInput.class)
	FilterMatchTypeInput description;


	@GraphQLNonScalar(fieldName = "name", graphQLTypeName = "FilterMatchTypeInput", javaClass = FilterMatchTypeInput.class)
	FilterMatchTypeInput name;


	@GraphQLNonScalar(fieldName = "price", graphQLTypeName = "FilterRangeTypeInput", javaClass = FilterRangeTypeInput.class)
	FilterRangeTypeInput price;


	@GraphQLNonScalar(fieldName = "short_description", graphQLTypeName = "FilterMatchTypeInput", javaClass = FilterMatchTypeInput.class)
	FilterMatchTypeInput short_description;


	@GraphQLNonScalar(fieldName = "sku", graphQLTypeName = "FilterEqualTypeInput", javaClass = FilterEqualTypeInput.class)
	FilterEqualTypeInput sku;


	@GraphQLNonScalar(fieldName = "url_key", graphQLTypeName = "FilterEqualTypeInput", javaClass = FilterEqualTypeInput.class)
	FilterEqualTypeInput url_key;



	public void setCategory_id(FilterEqualTypeInput category_id) {
		this.category_id = category_id;
	}

	public FilterEqualTypeInput getCategory_id() {
		return category_id;
	}

	public void setDescription(FilterMatchTypeInput description) {
		this.description = description;
	}

	public FilterMatchTypeInput getDescription() {
		return description;
	}

	public void setName(FilterMatchTypeInput name) {
		this.name = name;
	}

	public FilterMatchTypeInput getName() {
		return name;
	}

	public void setPrice(FilterRangeTypeInput price) {
		this.price = price;
	}

	public FilterRangeTypeInput getPrice() {
		return price;
	}

	public void setShort_description(FilterMatchTypeInput short_description) {
		this.short_description = short_description;
	}

	public FilterMatchTypeInput getShort_description() {
		return short_description;
	}

	public void setSku(FilterEqualTypeInput sku) {
		this.sku = sku;
	}

	public FilterEqualTypeInput getSku() {
		return sku;
	}

	public void setUrl_key(FilterEqualTypeInput url_key) {
		this.url_key = url_key;
	}

	public FilterEqualTypeInput getUrl_key() {
		return url_key;
	}

    public String toString() {
        return "ProductAttributeFilterInput {"
				+ "category_id: " + category_id
				+ ", "
				+ "description: " + description
				+ ", "
				+ "name: " + name
				+ ", "
				+ "price: " + price
				+ ", "
				+ "short_description: " + short_description
				+ ", "
				+ "sku: " + sku
				+ ", "
				+ "url_key: " + url_key
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Category_id("category_id"),
		Description("description"),
		Name("name"),
		Price("price"),
		Short_description("short_description"),
		Sku("sku"),
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
		private FilterEqualTypeInput category_id;
		private FilterMatchTypeInput description;
		private FilterMatchTypeInput name;
		private FilterRangeTypeInput price;
		private FilterMatchTypeInput short_description;
		private FilterEqualTypeInput sku;
		private FilterEqualTypeInput url_key;


		public Builder withCategory_id(FilterEqualTypeInput category_id) {
			this.category_id = category_id;
			return this;
		}
		public Builder withDescription(FilterMatchTypeInput description) {
			this.description = description;
			return this;
		}
		public Builder withName(FilterMatchTypeInput name) {
			this.name = name;
			return this;
		}
		public Builder withPrice(FilterRangeTypeInput price) {
			this.price = price;
			return this;
		}
		public Builder withShort_description(FilterMatchTypeInput short_description) {
			this.short_description = short_description;
			return this;
		}
		public Builder withSku(FilterEqualTypeInput sku) {
			this.sku = sku;
			return this;
		}
		public Builder withUrl_key(FilterEqualTypeInput url_key) {
			this.url_key = url_key;
			return this;
		}

		public ProductAttributeFilterInput build() {
			ProductAttributeFilterInput _object = new ProductAttributeFilterInput();
			_object.setCategory_id(category_id);
			_object.setDescription(description);
			_object.setName(name);
			_object.setPrice(price);
			_object.setShort_description(short_description);
			_object.setSku(sku);
			_object.setUrl_key(url_key);
			return _object;
		}
	}
}