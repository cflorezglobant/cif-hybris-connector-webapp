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
@GraphQLObjectType("CartPrices")
public class CartPrices  {

	public CartPrices(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "applied_taxes", graphQLTypeName = "CartTaxItem", javaClass = CartTaxItem.class)
	List<CartTaxItem> applied_taxes;


	@GraphQLNonScalar(fieldName = "discount", graphQLTypeName = "CartDiscount", javaClass = CartDiscount.class)
	CartDiscount discount;


	@GraphQLNonScalar(fieldName = "discounts", graphQLTypeName = "Discount", javaClass = Discount.class)
	List<Discount> discounts;


	@GraphQLNonScalar(fieldName = "grand_total", graphQLTypeName = "Money", javaClass = Money.class)
	Money grand_total;


	@GraphQLNonScalar(fieldName = "subtotal_excluding_tax", graphQLTypeName = "Money", javaClass = Money.class)
	Money subtotal_excluding_tax;


	@GraphQLNonScalar(fieldName = "subtotal_including_tax", graphQLTypeName = "Money", javaClass = Money.class)
	Money subtotal_including_tax;


	@GraphQLNonScalar(fieldName = "subtotal_with_discount_excluding_tax", graphQLTypeName = "Money", javaClass = Money.class)
	Money subtotal_with_discount_excluding_tax;



	public void setApplied_taxes(List<CartTaxItem> applied_taxes) {
		this.applied_taxes = applied_taxes;
	}

	public List<CartTaxItem> getApplied_taxes() {
		return applied_taxes;
	}

	public void setDiscount(CartDiscount discount) {
		this.discount = discount;
	}

	public CartDiscount getDiscount() {
		return discount;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public List<Discount> getDiscounts() {
		return discounts;
	}

	public void setGrand_total(Money grand_total) {
		this.grand_total = grand_total;
	}

	public Money getGrand_total() {
		return grand_total;
	}

	public void setSubtotal_excluding_tax(Money subtotal_excluding_tax) {
		this.subtotal_excluding_tax = subtotal_excluding_tax;
	}

	public Money getSubtotal_excluding_tax() {
		return subtotal_excluding_tax;
	}

	public void setSubtotal_including_tax(Money subtotal_including_tax) {
		this.subtotal_including_tax = subtotal_including_tax;
	}

	public Money getSubtotal_including_tax() {
		return subtotal_including_tax;
	}

	public void setSubtotal_with_discount_excluding_tax(Money subtotal_with_discount_excluding_tax) {
		this.subtotal_with_discount_excluding_tax = subtotal_with_discount_excluding_tax;
	}

	public Money getSubtotal_with_discount_excluding_tax() {
		return subtotal_with_discount_excluding_tax;
	}

    public String toString() {
        return "CartPrices {"
				+ "applied_taxes: " + applied_taxes
				+ ", "
				+ "discount: " + discount
				+ ", "
				+ "discounts: " + discounts
				+ ", "
				+ "grand_total: " + grand_total
				+ ", "
				+ "subtotal_excluding_tax: " + subtotal_excluding_tax
				+ ", "
				+ "subtotal_including_tax: " + subtotal_including_tax
				+ ", "
				+ "subtotal_with_discount_excluding_tax: " + subtotal_with_discount_excluding_tax
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Applied_taxes("applied_taxes"),
		Discount("discount"),
		Discounts("discounts"),
		Grand_total("grand_total"),
		Subtotal_excluding_tax("subtotal_excluding_tax"),
		Subtotal_including_tax("subtotal_including_tax"),
		Subtotal_with_discount_excluding_tax("subtotal_with_discount_excluding_tax");

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
		private List<CartTaxItem> applied_taxes;
		private CartDiscount discount;
		private List<Discount> discounts;
		private Money grand_total;
		private Money subtotal_excluding_tax;
		private Money subtotal_including_tax;
		private Money subtotal_with_discount_excluding_tax;


		public Builder withApplied_taxes(List<CartTaxItem> applied_taxes) {
			this.applied_taxes = applied_taxes;
			return this;
		}
		public Builder withDiscount(CartDiscount discount) {
			this.discount = discount;
			return this;
		}
		public Builder withDiscounts(List<Discount> discounts) {
			this.discounts = discounts;
			return this;
		}
		public Builder withGrand_total(Money grand_total) {
			this.grand_total = grand_total;
			return this;
		}
		public Builder withSubtotal_excluding_tax(Money subtotal_excluding_tax) {
			this.subtotal_excluding_tax = subtotal_excluding_tax;
			return this;
		}
		public Builder withSubtotal_including_tax(Money subtotal_including_tax) {
			this.subtotal_including_tax = subtotal_including_tax;
			return this;
		}
		public Builder withSubtotal_with_discount_excluding_tax(Money subtotal_with_discount_excluding_tax) {
			this.subtotal_with_discount_excluding_tax = subtotal_with_discount_excluding_tax;
			return this;
		}

		public CartPrices build() {
			CartPrices _object = new CartPrices();
			_object.setApplied_taxes(applied_taxes);
			_object.setDiscount(discount);
			_object.setDiscounts(discounts);
			_object.setGrand_total(grand_total);
			_object.setSubtotal_excluding_tax(subtotal_excluding_tax);
			_object.setSubtotal_including_tax(subtotal_including_tax);
			_object.setSubtotal_with_discount_excluding_tax(subtotal_with_discount_excluding_tax);
			return _object;
		}
	}
}
