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
@GraphQLObjectType("WishlistItem")
public class WishlistItem  {

	public WishlistItem(){
		// No action
	}

	@GraphQLScalar(fieldName = "added_at", graphQLTypeName = "String", javaClass = String.class)
	String added_at;


	@GraphQLScalar(fieldName = "description", graphQLTypeName = "String", javaClass = String.class)
	String description;


	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer id;


	@GraphQLNonScalar(fieldName = "product", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	ProductInterface product;


	@GraphQLScalar(fieldName = "qty", graphQLTypeName = "Float", javaClass = Double.class)
	Double qty;



	public void setAdded_at(String added_at) {
		this.added_at = added_at;
	}

	public String getAdded_at() {
		return added_at;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
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
        return "WishlistItem {"
				+ "added_at: " + added_at
				+ ", "
				+ "description: " + description
				+ ", "
				+ "id: " + id
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
		Added_at("added_at"),
		Description("description"),
		Id("id"),
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
		private String added_at;
		private String description;
		private Integer id;
		private ProductInterface product;
		private Double qty;


		public Builder withAdded_at(String added_at) {
			this.added_at = added_at;
			return this;
		}
		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}
		public Builder withId(Integer id) {
			this.id = id;
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

		public WishlistItem build() {
			WishlistItem _object = new WishlistItem();
			_object.setAdded_at(added_at);
			_object.setDescription(description);
			_object.setId(id);
			_object.setProduct(product);
			_object.setQty(qty);
			return _object;
		}
	}
}
