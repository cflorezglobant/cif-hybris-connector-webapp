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
@GraphQLInputType("VirtualProductCartItemInput")
public class VirtualProductCartItemInput  {

	public VirtualProductCartItemInput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "customizable_options", graphQLTypeName = "CustomizableOptionInput", javaClass = CustomizableOptionInput.class)
	List<CustomizableOptionInput> customizable_options;


	@GraphQLNonScalar(fieldName = "data", graphQLTypeName = "CartItemInput", javaClass = CartItemInput.class)
	CartItemInput data;



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
        return "VirtualProductCartItemInput {"
				+ "customizable_options: " + customizable_options
				+ ", "
				+ "data: " + data
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
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
		private List<CustomizableOptionInput> customizable_options;
		private CartItemInput data;


		public Builder withCustomizable_options(List<CustomizableOptionInput> customizable_options) {
			this.customizable_options = customizable_options;
			return this;
		}
		public Builder withData(CartItemInput data) {
			this.data = data;
			return this;
		}

		public VirtualProductCartItemInput build() {
			VirtualProductCartItemInput _object = new VirtualProductCartItemInput();
			_object.setCustomizable_options(customizable_options);
			_object.setData(data);
			return _object;
		}
	}
}
