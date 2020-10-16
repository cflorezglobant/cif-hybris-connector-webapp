/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("ConfigurableVariant")
public class ConfigurableVariant  {

	public ConfigurableVariant(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "attributes", graphQLTypeName = "ConfigurableAttributeOption", javaClass = ConfigurableAttributeOption.class)
	List<ConfigurableAttributeOption> attributes;


	@GraphQLNonScalar(fieldName = "product", graphQLTypeName = "SimpleProduct", javaClass = SimpleProduct.class)
	SimpleProduct product;



	public void setAttributes(List<ConfigurableAttributeOption> attributes) {
		this.attributes = attributes;
	}

	public List<ConfigurableAttributeOption> getAttributes() {
		return attributes;
	}

	public void setProduct(SimpleProduct product) {
		this.product = product;
	}

	public SimpleProduct getProduct() {
		return product;
	}

    public String toString() {
        return "ConfigurableVariant {"
				+ "attributes: " + attributes
				+ ", "
				+ "product: " + product
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Attributes("attributes"),
		Product("product");

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
		private List<ConfigurableAttributeOption> attributes;
		private SimpleProduct product;


		public Builder withAttributes(List<ConfigurableAttributeOption> attributes) {
			this.attributes = attributes;
			return this;
		}
		public Builder withProduct(SimpleProduct product) {
			this.product = product;
			return this;
		}

		public ConfigurableVariant build() {
			ConfigurableVariant _object = new ConfigurableVariant();
			_object.setAttributes(attributes);
			_object.setProduct(product);
			return _object;
		}
	}
}