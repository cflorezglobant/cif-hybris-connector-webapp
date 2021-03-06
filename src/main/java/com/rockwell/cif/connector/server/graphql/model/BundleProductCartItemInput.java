/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("BundleProductCartItemInput")
public class BundleProductCartItemInput  {

	public BundleProductCartItemInput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "bundle_options", graphQLTypeName = "BundleOptionInput", javaClass = BundleOptionInput.class)
	List<BundleOptionInput> bundle_options;


	@GraphQLNonScalar(fieldName = "customizable_options", graphQLTypeName = "CustomizableOptionInput", javaClass = CustomizableOptionInput.class)
	List<CustomizableOptionInput> customizable_options;


	@GraphQLNonScalar(fieldName = "data", graphQLTypeName = "CartItemInput", javaClass = CartItemInput.class)
	CartItemInput data;



	public void setBundle_options(List<BundleOptionInput> bundle_options) {
		this.bundle_options = bundle_options;
	}

	public List<BundleOptionInput> getBundle_options() {
		return bundle_options;
	}

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

    public String toString() {
        return "BundleProductCartItemInput {"
				+ "bundle_options: " + bundle_options
				+ ", "
				+ "customizable_options: " + customizable_options
				+ ", "
				+ "data: " + data
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Bundle_options("bundle_options"),
		Customizable_options("customizable_options"),
		Data("data");

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
		private List<BundleOptionInput> bundle_options;
		private List<CustomizableOptionInput> customizable_options;
		private CartItemInput data;


		public Builder withBundle_options(List<BundleOptionInput> bundle_options) {
			this.bundle_options = bundle_options;
			return this;
		}
		public Builder withCustomizable_options(List<CustomizableOptionInput> customizable_options) {
			this.customizable_options = customizable_options;
			return this;
		}
		public Builder withData(CartItemInput data) {
			this.data = data;
			return this;
		}

		public BundleProductCartItemInput build() {
			BundleProductCartItemInput _object = new BundleProductCartItemInput();
			_object.setBundle_options(bundle_options);
			_object.setCustomizable_options(customizable_options);
			_object.setData(data);
			return _object;
		}
	}
}
