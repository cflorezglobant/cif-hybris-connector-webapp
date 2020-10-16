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
@GraphQLObjectType("GroupedProductItem")
public class GroupedProductItem  {

	public GroupedProductItem(){
		// No action
	}

	@GraphQLScalar(fieldName = "position", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer position;


	@GraphQLNonScalar(fieldName = "product", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	ProductInterface product;


	@GraphQLScalar(fieldName = "qty", graphQLTypeName = "Float", javaClass = Double.class)
	Double qty;



	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getPosition() {
		return position;
	}

	public void setProduct(ProductInterface product) {
		this.product = product;
	}

	public ProductInterface getProduct() {
		return product;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}

	public Double getQty() {
		return qty;
	}

    public String toString() {
        return "GroupedProductItem {"
				+ "position: " + position
				+ ", "
				+ "product: " + product
				+ ", "
				+ "qty: " + qty
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Position("position"),
		Product("product"),
		Qty("qty");

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
		private Integer position;
		private ProductInterface product;
		private Double qty;


		public Builder withPosition(Integer position) {
			this.position = position;
			return this;
		}
		public Builder withProduct(ProductInterface product) {
			this.product = product;
			return this;
		}
		public Builder withQty(Double qty) {
			this.qty = qty;
			return this;
		}

		public GroupedProductItem build() {
			GroupedProductItem _object = new GroupedProductItem();
			_object.setPosition(position);
			_object.setProduct(product);
			_object.setQty(qty);
			return _object;
		}
	}
}
