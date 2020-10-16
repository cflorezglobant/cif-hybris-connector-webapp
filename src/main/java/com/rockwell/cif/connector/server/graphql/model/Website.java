/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("Website")
public class Website  {

	public Website(){
		// No action
	}

	@GraphQLScalar(fieldName = "code", graphQLTypeName = "String", javaClass = String.class)
	String code;


	@GraphQLScalar(fieldName = "default_group_id", graphQLTypeName = "String", javaClass = String.class)
	String default_group_id;


	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer id;


	@GraphQLScalar(fieldName = "is_default", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean is_default;


	@GraphQLScalar(fieldName = "name", graphQLTypeName = "String", javaClass = String.class)
	String name;


	@GraphQLScalar(fieldName = "sort_order", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer sort_order;



	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setDefault_group_id(String default_group_id) {
		this.default_group_id = default_group_id;
	}

	public String getDefault_group_id() {
		return default_group_id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setIs_default(Boolean is_default) {
		this.is_default = is_default;
	}

	public Boolean getIs_default() {
		return is_default;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}

	public Integer getSort_order() {
		return sort_order;
	}

    public String toString() {
        return "Website {"
				+ "code: " + code
				+ ", "
				+ "default_group_id: " + default_group_id
				+ ", "
				+ "id: " + id
				+ ", "
				+ "is_default: " + is_default
				+ ", "
				+ "name: " + name
				+ ", "
				+ "sort_order: " + sort_order
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Code("code"),
		Default_group_id("default_group_id"),
		Id("id"),
		Is_default("is_default"),
		Name("name"),
		Sort_order("sort_order");

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
		private String code;
		private String default_group_id;
		private Integer id;
		private Boolean is_default;
		private String name;
		private Integer sort_order;


		public Builder withCode(String code) {
			this.code = code;
			return this;
		}
		public Builder withDefault_group_id(String default_group_id) {
			this.default_group_id = default_group_id;
			return this;
		}
		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder withIs_default(Boolean is_default) {
			this.is_default = is_default;
			return this;
		}
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Builder withSort_order(Integer sort_order) {
			this.sort_order = sort_order;
			return this;
		}

		public Website build() {
			Website _object = new Website();
			_object.setCode(code);
			_object.setDefault_group_id(default_group_id);
			_object.setId(id);
			_object.setIs_default(is_default);
			_object.setName(name);
			_object.setSort_order(sort_order);
			return _object;
		}
	}
}