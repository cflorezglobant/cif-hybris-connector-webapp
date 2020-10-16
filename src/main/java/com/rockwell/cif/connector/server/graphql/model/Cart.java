/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;
import java.util.UUID;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("Cart")
public class Cart  {

	public Cart(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "applied_coupon", graphQLTypeName = "AppliedCoupon", javaClass = AppliedCoupon.class)
	AppliedCoupon applied_coupon;


	@GraphQLNonScalar(fieldName = "applied_coupons", graphQLTypeName = "AppliedCoupon", javaClass = AppliedCoupon.class)
	List<AppliedCoupon> applied_coupons;


	@GraphQLNonScalar(fieldName = "available_payment_methods", graphQLTypeName = "AvailablePaymentMethod", javaClass = AvailablePaymentMethod.class)
	List<AvailablePaymentMethod> available_payment_methods;


	@GraphQLNonScalar(fieldName = "billing_address", graphQLTypeName = "BillingCartAddress", javaClass = BillingCartAddress.class)
	BillingCartAddress billing_address;


	@GraphQLScalar(fieldName = "email", graphQLTypeName = "String", javaClass = String.class)
	String email;


	@GraphQLScalar(fieldName = "id", graphQLTypeName = "ID", javaClass = UUID.class)
	UUID id;


	@GraphQLScalar(fieldName = "is_virtual", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean is_virtual;


	@GraphQLNonScalar(fieldName = "items", graphQLTypeName = "CartItemInterface", javaClass = CartItemInterface.class)
	List<CartItemInterface> items;


	@GraphQLNonScalar(fieldName = "prices", graphQLTypeName = "CartPrices", javaClass = CartPrices.class)
	CartPrices prices;


	@GraphQLNonScalar(fieldName = "selected_payment_method", graphQLTypeName = "SelectedPaymentMethod", javaClass = SelectedPaymentMethod.class)
	SelectedPaymentMethod selected_payment_method;


	@GraphQLNonScalar(fieldName = "shipping_addresses", graphQLTypeName = "ShippingCartAddress", javaClass = ShippingCartAddress.class)
	List<ShippingCartAddress> shipping_addresses;


	@GraphQLScalar(fieldName = "total_quantity", graphQLTypeName = "Float", javaClass = Double.class)
	Double total_quantity;



	public void setApplied_coupon(AppliedCoupon applied_coupon) {
		this.applied_coupon = applied_coupon;
	}

	public AppliedCoupon getApplied_coupon() {
		return applied_coupon;
	}

	public void setApplied_coupons(List<AppliedCoupon> applied_coupons) {
		this.applied_coupons = applied_coupons;
	}

	public List<AppliedCoupon> getApplied_coupons() {
		return applied_coupons;
	}

	public void setAvailable_payment_methods(List<AvailablePaymentMethod> available_payment_methods) {
		this.available_payment_methods = available_payment_methods;
	}

	public List<AvailablePaymentMethod> getAvailable_payment_methods() {
		return available_payment_methods;
	}

	public void setBilling_address(BillingCartAddress billing_address) {
		this.billing_address = billing_address;
	}

	public BillingCartAddress getBilling_address() {
		return billing_address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public UUID getId() {
		return id;
	}

	public void setIs_virtual(Boolean is_virtual) {
		this.is_virtual = is_virtual;
	}

	public Boolean getIs_virtual() {
		return is_virtual;
	}

	public void setItems(List<CartItemInterface> items) {
		this.items = items;
	}

	public List<CartItemInterface> getItems() {
		return items;
	}

	public void setPrices(CartPrices prices) {
		this.prices = prices;
	}

	public CartPrices getPrices() {
		return prices;
	}

	public void setSelected_payment_method(SelectedPaymentMethod selected_payment_method) {
		this.selected_payment_method = selected_payment_method;
	}

	public SelectedPaymentMethod getSelected_payment_method() {
		return selected_payment_method;
	}

	public void setShipping_addresses(List<ShippingCartAddress> shipping_addresses) {
		this.shipping_addresses = shipping_addresses;
	}

	public List<ShippingCartAddress> getShipping_addresses() {
		return shipping_addresses;
	}

	public void setTotal_quantity(Double total_quantity) {
		this.total_quantity = total_quantity;
	}

	public Double getTotal_quantity() {
		return total_quantity;
	}

    public String toString() {
        return "Cart {"
				+ "applied_coupon: " + applied_coupon
				+ ", "
				+ "applied_coupons: " + applied_coupons
				+ ", "
				+ "available_payment_methods: " + available_payment_methods
				+ ", "
				+ "billing_address: " + billing_address
				+ ", "
				+ "email: " + email
				+ ", "
				+ "id: " + id
				+ ", "
				+ "is_virtual: " + is_virtual
				+ ", "
				+ "items: " + items
				+ ", "
				+ "prices: " + prices
				+ ", "
				+ "selected_payment_method: " + selected_payment_method
				+ ", "
				+ "shipping_addresses: " + shipping_addresses
				+ ", "
				+ "total_quantity: " + total_quantity
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Applied_coupon("applied_coupon"),
		Applied_coupons("applied_coupons"),
		Available_payment_methods("available_payment_methods"),
		Billing_address("billing_address"),
		Email("email"),
		Id("id"),
		Is_virtual("is_virtual"),
		Items("items"),
		Prices("prices"),
		Selected_payment_method("selected_payment_method"),
		Shipping_addresses("shipping_addresses"),
		Total_quantity("total_quantity");

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
		private AppliedCoupon applied_coupon;
		private List<AppliedCoupon> applied_coupons;
		private List<AvailablePaymentMethod> available_payment_methods;
		private BillingCartAddress billing_address;
		private String email;
		private UUID id;
		private Boolean is_virtual;
		private List<CartItemInterface> items;
		private CartPrices prices;
		private SelectedPaymentMethod selected_payment_method;
		private List<ShippingCartAddress> shipping_addresses;
		private Double total_quantity;


		public Builder withApplied_coupon(AppliedCoupon applied_coupon) {
			this.applied_coupon = applied_coupon;
			return this;
		}
		public Builder withApplied_coupons(List<AppliedCoupon> applied_coupons) {
			this.applied_coupons = applied_coupons;
			return this;
		}
		public Builder withAvailable_payment_methods(List<AvailablePaymentMethod> available_payment_methods) {
			this.available_payment_methods = available_payment_methods;
			return this;
		}
		public Builder withBilling_address(BillingCartAddress billing_address) {
			this.billing_address = billing_address;
			return this;
		}
		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}
		public Builder withId(UUID id) {
			this.id = id;
			return this;
		}
		public Builder withIs_virtual(Boolean is_virtual) {
			this.is_virtual = is_virtual;
			return this;
		}
		public Builder withItems(List<CartItemInterface> items) {
			this.items = items;
			return this;
		}
		public Builder withPrices(CartPrices prices) {
			this.prices = prices;
			return this;
		}
		public Builder withSelected_payment_method(SelectedPaymentMethod selected_payment_method) {
			this.selected_payment_method = selected_payment_method;
			return this;
		}
		public Builder withShipping_addresses(List<ShippingCartAddress> shipping_addresses) {
			this.shipping_addresses = shipping_addresses;
			return this;
		}
		public Builder withTotal_quantity(Double total_quantity) {
			this.total_quantity = total_quantity;
			return this;
		}

		public Cart build() {
			Cart _object = new Cart();
			_object.setApplied_coupon(applied_coupon);
			_object.setApplied_coupons(applied_coupons);
			_object.setAvailable_payment_methods(available_payment_methods);
			_object.setBilling_address(billing_address);
			_object.setEmail(email);
			_object.setId(id);
			_object.setIs_virtual(is_virtual);
			_object.setItems(items);
			_object.setPrices(prices);
			_object.setSelected_payment_method(selected_payment_method);
			_object.setShipping_addresses(shipping_addresses);
			_object.setTotal_quantity(total_quantity);
			return _object;
		}
	}
}
