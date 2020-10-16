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
@GraphQLObjectType("ProductPrice")
public class ProductPrice  {

	public ProductPrice(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "discount", graphQLTypeName = "ProductDiscount", javaClass = ProductDiscount.class)
	ProductDiscount discount;


	@GraphQLNonScalar(fieldName = "final_price", graphQLTypeName = "Money", javaClass = Money.class)
	Money final_price;


	@GraphQLNonScalar(fieldName = "fixed_product_taxes", graphQLTypeName = "FixedProductTax", javaClass = FixedProductTax.class)
	List<FixedProductTax> fixed_product_taxes;


	@GraphQLNonScalar(fieldName = "regular_price", graphQLTypeName = "Money", javaClass = Money.class)
	Money regular_price;



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

	public void setFixed_product_taxes(List<FixedProductTax> fixed_product_taxes) {
		this.fixed_product_taxes = fixed_product_taxes;
	}

	public List<FixedProductTax> getFixed_product_taxes() {
		return fixed_product_taxes;
	}

	public void setRegular_price(Money regular_price) {
		this.regular_price = regular_price;
	}

	public Money getRegular_price() {
		return regular_price;
	}

    public String toString() {
        return "ProductPrice {"
				+ "discount: " + discount
				+ ", "
				+ "final_price: " + final_price
				+ ", "
				+ "fixed_product_taxes: " + fixed_product_taxes
				+ ", "
				+ "regular_price: " + regular_price
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Discount("discount"),
		Final_price("final_price"),
		Fixed_product_taxes("fixed_product_taxes"),
		Regular_price("regular_price");

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
		private List<FixedProductTax> fixed_product_taxes;
		private Money regular_price;


		public Builder withDiscount(ProductDiscount discount) {
			this.discount = discount;
			return this;
		}
		public Builder withFinal_price(Money final_price) {
			this.final_price = final_price;
			return this;
		}
		public Builder withFixed_product_taxes(List<FixedProductTax> fixed_product_taxes) {
			this.fixed_product_taxes = fixed_product_taxes;
			return this;
		}
		public Builder withRegular_price(Money regular_price) {
			this.regular_price = regular_price;
			return this;
		}

		public ProductPrice build() {
			ProductPrice _object = new ProductPrice();
			_object.setDiscount(discount);
			_object.setFinal_price(final_price);
			_object.setFixed_product_taxes(fixed_product_taxes);
			_object.setRegular_price(regular_price);
			return _object;
		}
	}
}
