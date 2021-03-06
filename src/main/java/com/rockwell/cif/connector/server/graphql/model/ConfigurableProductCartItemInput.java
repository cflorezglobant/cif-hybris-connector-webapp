/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("ConfigurableProductCartItemInput")
public class ConfigurableProductCartItemInput  {

	public ConfigurableProductCartItemInput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "customizable_options", graphQLTypeName = "CustomizableOptionInput", javaClass = CustomizableOptionInput.class)
	List<CustomizableOptionInput> customizable_options;


	@GraphQLNonScalar(fieldName = "data", graphQLTypeName = "CartItemInput", javaClass = CartItemInput.class)
	CartItemInput data;


	@GraphQLScalar(fieldName = "parent_sku", graphQLTypeName = "String", javaClass = String.class)
	String parent_sku;


	@GraphQLScalar(fieldName = "variant_sku", graphQLTypeName = "String", javaClass = String.class)
	String variant_sku;



	public void setCustomizable_options(List<CustomizableOptionInput> customizable_options) {
		this.customizable_options = customizable_options;
	}

	public List<CustomizableOptionInput> getCustomizable_options() {
		return customizable_options;
	}

	public void setData(CartItemInput data) {
		this.data = data;
	}

	public CartItemInput getData() {
		return data;
	}

	public void setParent_sku(String parent_sku) {
		this.parent_sku = parent_sku;
	}

	public String getParent_sku() {
		return parent_sku;
	}

	public void setVariant_sku(String variant_sku) {
		this.variant_sku = variant_sku;
	}

	public String getVariant_sku() {
		return variant_sku;
	}

    public String toString() {
        return "ConfigurableProductCartItemInput {"
				+ "customizable_options: " + customizable_options
				+ ", "
				+ "data: " + data
				+ ", "
				+ "parent_sku: " + parent_sku
				+ ", "
				+ "variant_sku: " + variant_sku
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Customizable_options("customizable_options"),
		Data("data"),
		Parent_sku("parent_sku"),
		Variant_sku("variant_sku");

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
		private List<CustomizableOptionInput> customizable_options;
		private CartItemInput data;
		private String parent_sku;
		private String variant_sku;


		public Builder withCustomizable_options(List<CustomizableOptionInput> customizable_options) {
			this.customizable_options = customizable_options;
			return this;
		}
		public Builder withData(CartItemInput data) {
			this.data = data;
			return this;
		}
		public Builder withParent_sku(String parent_sku) {
			this.parent_sku = parent_sku;
			return this;
		}
		public Builder withVariant_sku(String variant_sku) {
			this.variant_sku = variant_sku;
			return this;
		}

		public ConfigurableProductCartItemInput build() {
			ConfigurableProductCartItemInput _object = new ConfigurableProductCartItemInput();
			_object.setCustomizable_options(customizable_options);
			_object.setData(data);
			_object.setParent_sku(parent_sku);
			_object.setVariant_sku(variant_sku);
			return _object;
		}
	}
}
