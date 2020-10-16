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
@GraphQLObjectType("TierPrice")
public class TierPrice  {

	public TierPrice(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "discount", graphQLTypeName = "ProductDiscount", javaClass = ProductDiscount.class)
	ProductDiscount discount;


	@GraphQLNonScalar(fieldName = "final_price", graphQLTypeName = "Money", javaClass = Money.class)
	Money final_price;


	@GraphQLScalar(fieldName = "quantity", graphQLTypeName = "Float", javaClass = Double.class)
	Double quantity;



	public void setDiscount(ProductDiscount discount) {
		this.discount = discount;
	}

	public ProductDiscount getDiscount() {
		return discount;
	}

	public void setFinal_price(Money final_price) {
		this.final_price = final_price;
	}

	public Money getFinal_price() {
		return final_price;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getQuantity() {
		return quantity;
	}

    public String toString() {
        return "TierPrice {"
				+ "discount: " + discount
				+ ", "
				+ "final_price: " + final_price
				+ ", "
				+ "quantity: " + quantity
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Discount("discount"),
		Final_price("final_price"),
		Quantity("quantity");

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
		private ProductDiscount discount;
		private Money final_price;
		private Double quantity;


		public Builder withDiscount(ProductDiscount discount) {
			this.discount = discount;
			return this;
		}
		public Builder withFinal_price(Money final_price) {
			this.final_price = final_price;
			return this;
		}
		public Builder withQuantity(Double quantity) {
			this.quantity = quantity;
			return this;
		}

		public TierPrice build() {
			TierPrice _object = new TierPrice();
			_object.setDiscount(discount);
			_object.setFinal_price(final_price);
			_object.setQuantity(quantity);
			return _object;
		}
	}
}
