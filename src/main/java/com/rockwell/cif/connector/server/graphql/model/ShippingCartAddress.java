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
@GraphQLObjectType("ShippingCartAddress")
public class ShippingCartAddress implements CartAddressInterface {

	public ShippingCartAddress(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "available_shipping_methods", graphQLTypeName = "AvailableShippingMethod", javaClass = AvailableShippingMethod.class)
	List<AvailableShippingMethod> available_shipping_methods;


	@GraphQLNonScalar(fieldName = "cart_items", graphQLTypeName = "CartItemQuantity", javaClass = CartItemQuantity.class)
	List<CartItemQuantity> cart_items;


	@GraphQLNonScalar(fieldName = "cart_items_v2", graphQLTypeName = "CartItemInterface", javaClass = CartItemInterface.class)
	List<CartItemInterface> cart_items_v2;


	@GraphQLScalar(fieldName = "city", graphQLTypeName = "String", javaClass = String.class)
	String city;


	@GraphQLScalar(fieldName = "company", graphQLTypeName = "String", javaClass = String.class)
	String company;


	@GraphQLNonScalar(fieldName = "country", graphQLTypeName = "CartAddressCountry", javaClass = CartAddressCountry.class)
	CartAddressCountry country;


	@GraphQLScalar(fieldName = "customer_notes", graphQLTypeName = "String", javaClass = String.class)
	String customer_notes;


	@GraphQLScalar(fieldName = "firstname", graphQLTypeName = "String", javaClass = String.class)
	String firstname;


	@GraphQLScalar(fieldName = "items_weight", graphQLTypeName = "Float", javaClass = Double.class)
	Double items_weight;


	@GraphQLScalar(fieldName = "lastname", graphQLTypeName = "String", javaClass = String.class)
	String lastname;


	@GraphQLScalar(fieldName = "postcode", graphQLTypeName = "String", javaClass = String.class)
	String postcode;


	@GraphQLNonScalar(fieldName = "region", graphQLTypeName = "CartAddressRegion", javaClass = CartAddressRegion.class)
	CartAddressRegion region;


	@GraphQLNonScalar(fieldName = "selected_shipping_method", graphQLTypeName = "SelectedShippingMethod", javaClass = SelectedShippingMethod.class)
	SelectedShippingMethod selected_shipping_method;


	@GraphQLScalar(fieldName = "street", graphQLTypeName = "String", javaClass = String.class)
	List<String> street;


	@GraphQLScalar(fieldName = "telephone", graphQLTypeName = "String", javaClass = String.class)
	String telephone;



	public void setAvailable_shipping_methods(List<AvailableShippingMethod> available_shipping_methods) {
		this.available_shipping_methods = available_shipping_methods;
	}

	public List<AvailableShippingMethod> getAvailable_shipping_methods() {
		return available_shipping_methods;
	}

	public void setCart_items(List<CartItemQuantity> cart_items) {
		this.cart_items = cart_items;
	}

	public List<CartItemQuantity> getCart_items() {
		return cart_items;
	}

	public void setCart_items_v2(List<CartItemInterface> cart_items_v2) {
		this.cart_items_v2 = cart_items_v2;
	}

	public List<CartItemInterface> getCart_items_v2() {
		return cart_items_v2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCountry(CartAddressCountry country) {
		this.country = country;
	}

	public CartAddressCountry getCountry() {
		return country;
	}

	public void setCustomer_notes(String customer_notes) {
		this.customer_notes = customer_notes;
	}

	public String getCustomer_notes() {
		return customer_notes;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setItems_weight(Double items_weight) {
		this.items_weight = items_weight;
	}

	public Double getItems_weight() {
		return items_weight;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setRegion(CartAddressRegion region) {
		this.region = region;
	}

	public CartAddressRegion getRegion() {
		return region;
	}

	public void setSelected_shipping_method(SelectedShippingMethod selected_shipping_method) {
		this.selected_shipping_method = selected_shipping_method;
	}

	public SelectedShippingMethod getSelected_shipping_method() {
		return selected_shipping_method;
	}

	public void setStreet(List<String> street) {
		this.street = street;
	}

	public List<String> getStreet() {
		return street;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

    public String toString() {
        return "ShippingCartAddress {"
				+ "available_shipping_methods: " + available_shipping_methods
				+ ", "
				+ "cart_items: " + cart_items
				+ ", "
				+ "cart_items_v2: " + cart_items_v2
				+ ", "
				+ "city: " + city
				+ ", "
				+ "company: " + company
				+ ", "
				+ "country: " + country
				+ ", "
				+ "customer_notes: " + customer_notes
				+ ", "
				+ "firstname: " + firstname
				+ ", "
				+ "items_weight: " + items_weight
				+ ", "
				+ "lastname: " + lastname
				+ ", "
				+ "postcode: " + postcode
				+ ", "
				+ "region: " + region
				+ ", "
				+ "selected_shipping_method: " + selected_shipping_method
				+ ", "
				+ "street: " + street
				+ ", "
				+ "telephone: " + telephone
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Available_shipping_methods("available_shipping_methods"),
		Cart_items("cart_items"),
		Cart_items_v2("cart_items_v2"),
		City("city"),
		Company("company"),
		Country("country"),
		Customer_notes("customer_notes"),
		Firstname("firstname"),
		Items_weight("items_weight"),
		Lastname("lastname"),
		Postcode("postcode"),
		Region("region"),
		Selected_shipping_method("selected_shipping_method"),
		Street("street"),
		Telephone("telephone");

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
		private List<AvailableShippingMethod> available_shipping_methods;
		private List<CartItemQuantity> cart_items;
		private List<CartItemInterface> cart_items_v2;
		private String city;
		private String company;
		private CartAddressCountry country;
		private String customer_notes;
		private String firstname;
		private Double items_weight;
		private String lastname;
		private String postcode;
		private CartAddressRegion region;
		private SelectedShippingMethod selected_shipping_method;
		private List<String> street;
		private String telephone;


		public Builder withAvailable_shipping_methods(List<AvailableShippingMethod> available_shipping_methods) {
			this.available_shipping_methods = available_shipping_methods;
			return this;
		}
		public Builder withCart_items(List<CartItemQuantity> cart_items) {
			this.cart_items = cart_items;
			return this;
		}
		public Builder withCart_items_v2(List<CartItemInterface> cart_items_v2) {
			this.cart_items_v2 = cart_items_v2;
			return this;
		}
		public Builder withCity(String city) {
			this.city = city;
			return this;
		}
		public Builder withCompany(String company) {
			this.company = company;
			return this;
		}
		public Builder withCountry(CartAddressCountry country) {
			this.country = country;
			return this;
		}
		public Builder withCustomer_notes(String customer_notes) {
			this.customer_notes = customer_notes;
			return this;
		}
		public Builder withFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}
		public Builder withItems_weight(Double items_weight) {
			this.items_weight = items_weight;
			return this;
		}
		public Builder withLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}
		public Builder withPostcode(String postcode) {
			this.postcode = postcode;
			return this;
		}
		public Builder withRegion(CartAddressRegion region) {
			this.region = region;
			return this;
		}
		public Builder withSelected_shipping_method(SelectedShippingMethod selected_shipping_method) {
			this.selected_shipping_method = selected_shipping_method;
			return this;
		}
		public Builder withStreet(List<String> street) {
			this.street = street;
			return this;
		}
		public Builder withTelephone(String telephone) {
			this.telephone = telephone;
			return this;
		}

		public ShippingCartAddress build() {
			ShippingCartAddress _object = new ShippingCartAddress();
			_object.setAvailable_shipping_methods(available_shipping_methods);
			_object.setCart_items(cart_items);
			_object.setCart_items_v2(cart_items_v2);
			_object.setCity(city);
			_object.setCompany(company);
			_object.setCountry(country);
			_object.setCustomer_notes(customer_notes);
			_object.setFirstname(firstname);
			_object.setItems_weight(items_weight);
			_object.setLastname(lastname);
			_object.setPostcode(postcode);
			_object.setRegion(region);
			_object.setSelected_shipping_method(selected_shipping_method);
			_object.setStreet(street);
			_object.setTelephone(telephone);
			return _object;
		}
	}
}
