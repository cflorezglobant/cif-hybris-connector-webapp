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
@GraphQLObjectType("SelectedCustomizableOption")
public class SelectedCustomizableOption  {

	public SelectedCustomizableOption(){
		// No action
	}

	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer id;


	@GraphQLScalar(fieldName = "is_required", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean is_required;


	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;


	@GraphQLScalar(fieldName = "sort_order", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer sort_order;


	@GraphQLNonScalar(fieldName = "values", graphQLTypeName = "SelectedCustomizableOptionValue", javaClass = SelectedCustomizableOptionValue.class)
	List<SelectedCustomizableOptionValue> values;



	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setIs_required(Boolean is_required) {
		this.is_required = is_required;
	}

	public Boolean getIs_required() {
		return is_required;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}

	public Integer getSort_order() {
		return sort_order;
	}

	public void setValues(List<SelectedCustomizableOptionValue> values) {
		this.values = values;
	}

	public List<SelectedCustomizableOptionValue> getValues() {
		return values;
	}

    public String toString() {
        return "SelectedCustomizableOption {"
				+ "id: " + id
				+ ", "
				+ "is_required: " + is_required
				+ ", "
				+ "label: " + label
				+ ", "
				+ "sort_order: " + sort_order
				+ ", "
				+ "values: " + values
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Id("id"),
		Is_required("is_required"),
		Label("label"),
		Sort_order("sort_order"),
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
		private Integer id;
		private Boolean is_required;
		private String label;
		private Integer sort_order;
		private List<SelectedCustomizableOptionValue> values;


		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder withIs_required(Boolean is_required) {
			this.is_required = is_required;
			return this;
		}
		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}
		public Builder withSort_order(Integer sort_order) {
			this.sort_order = sort_order;
			return this;
		}
		public Builder withValues(List<SelectedCustomizableOptionValue> values) {
			this.values = values;
			return this;
		}

		public SelectedCustomizableOption build() {
			SelectedCustomizableOption _object = new SelectedCustomizableOption();
			_object.setId(id);
			_object.setIs_required(is_required);
			_object.setLabel(label);
			_object.setSort_order(sort_order);
			_object.setValues(values);
			return _object;
		}
	}
}
