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
@GraphQLObjectType("CustomerAddress")
public class CustomerAddress  {

	public CustomerAddress(){
		// No action
	}

	@GraphQLScalar(fieldName = "city", graphQLTypeName = "String", javaClass = String.class)
	String city;


	@GraphQLScalar(fieldName = "company", graphQLTypeName = "String", javaClass = String.class)
	String company;


	@GraphQLScalar(fieldName = "country_code", graphQLTypeName = "CountryCodeEnum", javaClass = CountryCodeEnum.class)
	CountryCodeEnum country_code;


	@GraphQLScalar(fieldName = "country_id", graphQLTypeName = "String", javaClass = String.class)
	String country_id;


	@GraphQLNonScalar(fieldName = "custom_attributes", graphQLTypeName = "CustomerAddressAttribute", javaClass = CustomerAddressAttribute.class)
	List<CustomerAddressAttribute> custom_attributes;


	@GraphQLScalar(fieldName = "customer_id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer customer_id;


	@GraphQLScalar(fieldName = "default_billing", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean default_billing;


	@GraphQLScalar(fieldName = "default_shipping", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean default_shipping;


	@GraphQLNonScalar(fieldName = "extension_attributes", graphQLTypeName = "CustomerAddressAttribute", javaClass = CustomerAddressAttribute.class)
	List<CustomerAddressAttribute> extension_attributes;


	@GraphQLScalar(fieldName = "fax", graphQLTypeName = "String", javaClass = String.class)
	String fax;


	@GraphQLScalar(fieldName = "firstname", graphQLTypeName = "String", javaClass = String.class)
	String firstname;


	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer id;


	@GraphQLScalar(fieldName = "lastname", graphQLTypeName = "String", javaClass = String.class)
	String lastname;


	@GraphQLScalar(fieldName = "middlename", graphQLTypeName = "String", javaClass = String.class)
	String middlename;


	@GraphQLScalar(fieldName = "postcode", graphQLTypeName = "String", javaClass = String.class)
	String postcode;


	@GraphQLScalar(fieldName = "prefix", graphQLTypeName = "String", javaClass = String.class)
	String prefix;


	@GraphQLNonScalar(fieldName = "region", graphQLTypeName = "CustomerAddressRegion", javaClass = CustomerAddressRegion.class)
	CustomerAddressRegion region;


	@GraphQLScalar(fieldName = "region_id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer region_id;


	@GraphQLScalar(fieldName = "street", graphQLTypeName = "String", javaClass = String.class)
	List<String> street;


	@GraphQLScalar(fieldName = "suffix", graphQLTypeName = "String", javaClass = String.class)
	String suffix;


	@GraphQLScalar(fieldName = "telephone", graphQLTypeName = "String", javaClass = String.class)
	String telephone;


	@GraphQLScalar(fieldName = "vat_id", graphQLTypeName = "String", javaClass = String.class)
	String vat_id;



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

	public void setCountry_code(CountryCodeEnum country_code) {
		this.country_code = country_code;
	}

	public CountryCodeEnum getCountry_code() {
		return country_code;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCustom_attributes(List<CustomerAddressAttribute> custom_attributes) {
		this.custom_attributes = custom_attributes;
	}

	public List<CustomerAddressAttribute> getCustom_attributes() {
		return custom_attributes;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setDefault_billing(Boolean default_billing) {
		this.default_billing = default_billing;
	}

	public Boolean getDefault_billing() {
		return default_billing;
	}

	public void setDefault_shipping(Boolean default_shipping) {
		this.default_shipping = default_shipping;
	}

	public Boolean getDefault_shipping() {
		return default_shipping;
	}

	public void setExtension_attributes(List<CustomerAddressAttribute> extension_attributes) {
		this.extension_attributes = extension_attributes;
	}

	public List<CustomerAddressAttribute> getExtension_attributes() {
		return extension_attributes;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFax() {
		return fax;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setRegion(CustomerAddressRegion region) {
		this.region = region;
	}

	public CustomerAddressRegion getRegion() {
		return region;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setStreet(List<String> street) {
		this.street = street;
	}

	public List<String> getStreet() {
		return street;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setVat_id(String vat_id) {
		this.vat_id = vat_id;
	}

	public String getVat_id() {
		return vat_id;
	}

    public String toString() {
        return "CustomerAddress {"
				+ "city: " + city
				+ ", "
				+ "company: " + company
				+ ", "
				+ "country_code: " + country_code
				+ ", "
				+ "country_id: " + country_id
				+ ", "
				+ "custom_attributes: " + custom_attributes
				+ ", "
				+ "customer_id: " + customer_id
				+ ", "
				+ "default_billing: " + default_billing
				+ ", "
				+ "default_shipping: " + default_shipping
				+ ", "
				+ "extension_attributes: " + extension_attributes
				+ ", "
				+ "fax: " + fax
				+ ", "
				+ "firstname: " + firstname
				+ ", "
				+ "id: " + id
				+ ", "
				+ "lastname: " + lastname
				+ ", "
				+ "middlename: " + middlename
				+ ", "
				+ "postcode: " + postcode
				+ ", "
				+ "prefix: " + prefix
				+ ", "
				+ "region: " + region
				+ ", "
				+ "region_id: " + region_id
				+ ", "
				+ "street: " + street
				+ ", "
				+ "suffix: " + suffix
				+ ", "
				+ "telephone: " + telephone
				+ ", "
				+ "vat_id: " + vat_id
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		City("city"),
		Company("company"),
		Country_code("country_code"),
		Country_id("country_id"),
		Custom_attributes("custom_attributes"),
		Customer_id("customer_id"),
		Default_billing("default_billing"),
		Default_shipping("default_shipping"),
		Extension_attributes("extension_attributes"),
		Fax("fax"),
		Firstname("firstname"),
		Id("id"),
		Lastname("lastname"),
		Middlename("middlename"),
		Postcode("postcode"),
		Prefix("prefix"),
		Region("region"),
		Region_id("region_id"),
		Street("street"),
		Suffix("suffix"),
		Telephone("telephone"),
		Vat_id("vat_id");

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
		private String city;
		private String company;
		private CountryCodeEnum country_code;
		private String country_id;
		private List<CustomerAddressAttribute> custom_attributes;
		private Integer customer_id;
		private Boolean default_billing;
		private Boolean default_shipping;
		private List<CustomerAddressAttribute> extension_attributes;
		private String fax;
		private String firstname;
		private Integer id;
		private String lastname;
		private String middlename;
		private String postcode;
		private String prefix;
		private CustomerAddressRegion region;
		private Integer region_id;
		private List<String> street;
		private String suffix;
		private String telephone;
		private String vat_id;


		public Builder withCity(String city) {
			this.city = city;
			return this;
		}
		public Builder withCompany(String company) {
			this.company = company;
			return this;
		}
		public Builder withCountry_code(CountryCodeEnum country_code) {
			this.country_code = country_code;
			return this;
		}
		public Builder withCountry_id(String country_id) {
			this.country_id = country_id;
			return this;
		}
		public Builder withCustom_attributes(List<CustomerAddressAttribute> custom_attributes) {
			this.custom_attributes = custom_attributes;
			return this;
		}
		public Builder withCustomer_id(Integer customer_id) {
			this.customer_id = customer_id;
			return this;
		}
		public Builder withDefault_billing(Boolean default_billing) {
			this.default_billing = default_billing;
			return this;
		}
		public Builder withDefault_shipping(Boolean default_shipping) {
			this.default_shipping = default_shipping;
			return this;
		}
		public Builder withExtension_attributes(List<CustomerAddressAttribute> extension_attributes) {
			this.extension_attributes = extension_attributes;
			return this;
		}
		public Builder withFax(String fax) {
			this.fax = fax;
			return this;
		}
		public Builder withFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}
		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder withLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}
		public Builder withMiddlename(String middlename) {
			this.middlename = middlename;
			return this;
		}
		public Builder withPostcode(String postcode) {
			this.postcode = postcode;
			return this;
		}
		public Builder withPrefix(String prefix) {
			this.prefix = prefix;
			return this;
		}
		public Builder withRegion(CustomerAddressRegion region) {
			this.region = region;
			return this;
		}
		public Builder withRegion_id(Integer region_id) {
			this.region_id = region_id;
			return this;
		}
		public Builder withStreet(List<String> street) {
			this.street = street;
			return this;
		}
		public Builder withSuffix(String suffix) {
			this.suffix = suffix;
			return this;
		}
		public Builder withTelephone(String telephone) {
			this.telephone = telephone;
			return this;
		}
		public Builder withVat_id(String vat_id) {
			this.vat_id = vat_id;
			return this;
		}

		public CustomerAddress build() {
			CustomerAddress _object = new CustomerAddress();
			_object.setCity(city);
			_object.setCompany(company);
			_object.setCountry_code(country_code);
			_object.setCountry_id(country_id);
			_object.setCustom_attributes(custom_attributes);
			_object.setCustomer_id(customer_id);
			_object.setDefault_billing(default_billing);
			_object.setDefault_shipping(default_shipping);
			_object.setExtension_attributes(extension_attributes);
			_object.setFax(fax);
			_object.setFirstname(firstname);
			_object.setId(id);
			_object.setLastname(lastname);
			_object.setMiddlename(middlename);
			_object.setPostcode(postcode);
			_object.setPrefix(prefix);
			_object.setRegion(region);
			_object.setRegion_id(region_id);
			_object.setStreet(street);
			_object.setSuffix(suffix);
			_object.setTelephone(telephone);
			_object.setVat_id(vat_id);
			return _object;
		}
	}
}