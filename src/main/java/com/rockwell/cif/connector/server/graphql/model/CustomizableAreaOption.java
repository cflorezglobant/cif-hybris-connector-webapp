/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("CustomizableAreaOption")
public class CustomizableAreaOption implements CustomizableOptionInterface {

	public CustomizableAreaOption(){
		// No action
	}

	@GraphQLScalar(fieldName = "option_id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer option_id;


	@GraphQLScalar(fieldName = "product_sku", graphQLTypeName = "String", javaClass = String.class)
	String product_sku;


	@GraphQLScalar(fieldName = "required", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean required;


	@GraphQLScalar(fieldName = "sort_order", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer sort_order;


	@GraphQLScalar(fieldName = "title", graphQLTypeName = "String", javaClass = String.class)
	String title;


	@GraphQLNonScalar(fieldName = "value", graphQLTypeName = "CustomizableAreaValue", javaClass = CustomizableAreaValue.class)
	CustomizableAreaValue value;



	public void setOption_id(Integer option_id) {
		this.option_id = option_id;
	}

	public Integer getOption_id() {
		return option_id;
	}

	public void setProduct_sku(String product_sku) {
		this.product_sku = product_sku;
	}

	public String getProduct_sku() {
		return product_sku;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}

	public Integer getSort_order() {
		return sort_order;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setValue(CustomizableAreaValue value) {
		this.value = value;
	}

	public CustomizableAreaValue getValue() {
		return value;
	}

    public String toString() {
        return "CustomizableAreaOption {"
				+ "option_id: " + option_id
				+ ", "
				+ "product_sku: " + product_sku
				+ ", "
				+ "required: " + required
				+ ", "
				+ "sort_order: " + sort_order
				+ ", "
				+ "title: " + title
				+ ", "
				+ "value: " + value
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Option_id("option_id"),
		Product_sku("product_sku"),
		Required("required"),
		Sort_order("sort_order"),
		Title("title"),
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
		private Integer option_id;
		private String product_sku;
		private Boolean required;
		private Integer sort_order;
		private String title;
		private CustomizableAreaValue value;


		public Builder withOption_id(Integer option_id) {
			this.option_id = option_id;
			return this;
		}
		public Builder withProduct_sku(String product_sku) {
			this.product_sku = product_sku;
			return this;
		}
		public Builder withRequired(Boolean required) {
			this.required = required;
			return this;
		}
		public Builder withSort_order(Integer sort_order) {
			this.sort_order = sort_order;
			return this;
		}
		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}
		public Builder withValue(CustomizableAreaValue value) {
			this.value = value;
			return this;
		}

		public CustomizableAreaOption build() {
			CustomizableAreaOption _object = new CustomizableAreaOption();
			_object.setOption_id(option_id);
			_object.setProduct_sku(product_sku);
			_object.setRequired(required);
			_object.setSort_order(sort_order);
			_object.setTitle(title);
			_object.setValue(value);
			return _object;
		}
	}
}