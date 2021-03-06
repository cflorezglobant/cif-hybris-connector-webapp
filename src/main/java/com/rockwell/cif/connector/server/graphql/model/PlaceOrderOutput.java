/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("PlaceOrderOutput")
public class PlaceOrderOutput  {

	public PlaceOrderOutput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "order", graphQLTypeName = "Order", javaClass = Order.class)
	Order order;



	public void setOrder(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

    public String toString() {
        return "PlaceOrderOutput {"
				+ "order: " + order
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Order("order");

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
		private Order order;


		public Builder withOrder(Order order) {
			this.order = order;
			return this;
		}

		public PlaceOrderOutput build() {
			PlaceOrderOutput _object = new PlaceOrderOutput();
			_object.setOrder(order);
			return _object;
		}
	}
}
