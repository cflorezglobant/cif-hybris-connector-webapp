/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInterfaceType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInterfaceType("LayerFilterItemInterface")
public interface LayerFilterItemInterface  {

	@GraphQLScalar(fieldName = "items_count", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setItems_count(Integer items_count);

	@GraphQLScalar(fieldName = "items_count", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getItems_count();

	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	public void setLabel(String label);

	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	public String getLabel();

	@GraphQLScalar(fieldName = "value_string", graphQLTypeName = "String", javaClass = String.class)
	public void setValue_string(String value_string);

	@GraphQLScalar(fieldName = "value_string", graphQLTypeName = "String", javaClass = String.class)
	public String getValue_string();
}