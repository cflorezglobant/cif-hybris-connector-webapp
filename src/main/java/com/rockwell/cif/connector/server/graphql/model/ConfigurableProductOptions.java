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
@GraphQLObjectType("ConfigurableProductOptions")
public class ConfigurableProductOptions  {

	public ConfigurableProductOptions(){
		// No action
	}

	@GraphQLScalar(fieldName = "attribute_code", graphQLTypeName = "String", javaClass = String.class)
	String attribute_code;


	@GraphQLScalar(fieldName = "attribute_id", graphQLTypeName = "String", javaClass = String.class)
	String attribute_id;


	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer id;


	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;


	@GraphQLScalar(fieldName = "position", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer position;


	@GraphQLScalar(fieldName = "product_id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer product_id;


	@GraphQLScalar(fieldName = "use_default", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean use_default;


	@GraphQLNonScalar(fieldName = "values", graphQLTypeName = "ConfigurableProductOptionsValues", javaClass = ConfigurableProductOptionsValues.class)
	List<ConfigurableProductOptionsValues> values;



	public void setAttribute_code(String attribute_code) {
		this.attribute_code = attribute_code;
	}

	public String getAttribute_code() {
		return attribute_code;
	}

	public void setAttribute_id(String attribute_id) {
		this.attribute_id = attribute_id;
	}

	public String getAttribute_id() {
		return attribute_id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getPosition() {
		return position;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setUse_default(Boolean use_default) {
		this.use_default = use_default;
	}

	public Boolean getUse_default() {
		return use_default;
	}

	public void setValues(List<ConfigurableProductOptionsValues> values) {
		this.values = values;
	}

	public List<ConfigurableProductOptionsValues> getValues() {
		return values;
	}

    public String toString() {
        return "ConfigurableProductOptions {"
				+ "attribute_code: " + attribute_code
				+ ", "
				+ "attribute_id: " + attribute_id
				+ ", "
				+ "id: " + id
				+ ", "
				+ "label: " + label
				+ ", "
				+ "position: " + position
				+ ", "
				+ "product_id: " + product_id
				+ ", "
				+ "use_default: " + use_default
				+ ", "
				+ "values: " + values
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Attribute_code("attribute_code"),
		Attribute_id("attribute_id"),
		Id("id"),
		Label("label"),
		Position("position"),
		Product_id("product_id"),
		Use_default("use_default"),
		Values("values");

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
		private String attribute_code;
		private String attribute_id;
		private Integer id;
		private String label;
		private Integer position;
		private Integer product_id;
		private Boolean use_default;
		private List<ConfigurableProductOptionsValues> values;


		public Builder withAttribute_code(String attribute_code) {
			this.attribute_code = attribute_code;
			return this;
		}
		public Builder withAttribute_id(String attribute_id) {
			this.attribute_id = attribute_id;
			return this;
		}
		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}
		public Builder withPosition(Integer position) {
			this.position = position;
			return this;
		}
		public Builder withProduct_id(Integer product_id) {
			this.product_id = product_id;
			return this;
		}
		public Builder withUse_default(Boolean use_default) {
			this.use_default = use_default;
			return this;
		}
		public Builder withValues(List<ConfigurableProductOptionsValues> values) {
			this.values = values;
			return this;
		}

		public ConfigurableProductOptions build() {
			ConfigurableProductOptions _object = new ConfigurableProductOptions();
			_object.setAttribute_code(attribute_code);
			_object.setAttribute_id(attribute_id);
			_object.setId(id);
			_object.setLabel(label);
			_object.setPosition(position);
			_object.setProduct_id(product_id);
			_object.setUse_default(use_default);
			_object.setValues(values);
			return _object;
		}
	}
}