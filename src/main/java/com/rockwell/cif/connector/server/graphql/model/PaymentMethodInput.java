/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("PaymentMethodInput")
public class PaymentMethodInput  {

	public PaymentMethodInput(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "authorizenet_acceptjs", graphQLTypeName = "AuthorizenetInput", javaClass = AuthorizenetInput.class)
	AuthorizenetInput authorizenet_acceptjs;


	@GraphQLNonScalar(fieldName = "braintree", graphQLTypeName = "BraintreeInput", javaClass = BraintreeInput.class)
	BraintreeInput braintree;


	@GraphQLNonScalar(fieldName = "braintree_cc_vault", graphQLTypeName = "BraintreeCcVaultInput", javaClass = BraintreeCcVaultInput.class)
	BraintreeCcVaultInput braintree_cc_vault;


	@GraphQLScalar(fieldName = "code", graphQLTypeName = "String", javaClass = String.class)
	String code;


	@GraphQLNonScalar(fieldName = "hosted_pro", graphQLTypeName = "HostedProInput", javaClass = HostedProInput.class)
	HostedProInput hosted_pro;


	@GraphQLNonScalar(fieldName = "payflow_express", graphQLTypeName = "PayflowExpressInput", javaClass = PayflowExpressInput.class)
	PayflowExpressInput payflow_express;


	@GraphQLNonScalar(fieldName = "payflow_link", graphQLTypeName = "PayflowLinkInput", javaClass = PayflowLinkInput.class)
	PayflowLinkInput payflow_link;


	@GraphQLNonScalar(fieldName = "payflowpro", graphQLTypeName = "PayflowProInput", javaClass = PayflowProInput.class)
	PayflowProInput payflowpro;


	@GraphQLNonScalar(fieldName = "paypal_express", graphQLTypeName = "PaypalExpressInput", javaClass = PaypalExpressInput.class)
	PaypalExpressInput paypal_express;


	@GraphQLScalar(fieldName = "purchase_order_number", graphQLTypeName = "String", javaClass = String.class)
	String purchase_order_number;



	public void setAuthorizenet_acceptjs(AuthorizenetInput authorizenet_acceptjs) {
		this.authorizenet_acceptjs = authorizenet_acceptjs;
	}

	public AuthorizenetInput getAuthorizenet_acceptjs() {
		return authorizenet_acceptjs;
	}

	public void setBraintree(BraintreeInput braintree) {
		this.braintree = braintree;
	}

	public BraintreeInput getBraintree() {
		return braintree;
	}

	public void setBraintree_cc_vault(BraintreeCcVaultInput braintree_cc_vault) {
		this.braintree_cc_vault = braintree_cc_vault;
	}

	public BraintreeCcVaultInput getBraintree_cc_vault() {
		return braintree_cc_vault;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setHosted_pro(HostedProInput hosted_pro) {
		this.hosted_pro = hosted_pro;
	}

	public HostedProInput getHosted_pro() {
		return hosted_pro;
	}

	public void setPayflow_express(PayflowExpressInput payflow_express) {
		this.payflow_express = payflow_express;
	}

	public PayflowExpressInput getPayflow_express() {
		return payflow_express;
	}

	public void setPayflow_link(PayflowLinkInput payflow_link) {
		this.payflow_link = payflow_link;
	}

	public PayflowLinkInput getPayflow_link() {
		return payflow_link;
	}

	public void setPayflowpro(PayflowProInput payflowpro) {
		this.payflowpro = payflowpro;
	}

	public PayflowProInput getPayflowpro() {
		return payflowpro;
	}

	public void setPaypal_express(PaypalExpressInput paypal_express) {
		this.paypal_express = paypal_express;
	}

	public PaypalExpressInput getPaypal_express() {
		return paypal_express;
	}

	public void setPurchase_order_number(String purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}

	public String getPurchase_order_number() {
		return purchase_order_number;
	}

    public String toString() {
        return "PaymentMethodInput {"
				+ "authorizenet_acceptjs: " + authorizenet_acceptjs
				+ ", "
				+ "braintree: " + braintree
				+ ", "
				+ "braintree_cc_vault: " + braintree_cc_vault
				+ ", "
				+ "code: " + code
				+ ", "
				+ "hosted_pro: " + hosted_pro
				+ ", "
				+ "payflow_express: " + payflow_express
				+ ", "
				+ "payflow_link: " + payflow_link
				+ ", "
				+ "payflowpro: " + payflowpro
				+ ", "
				+ "paypal_express: " + paypal_express
				+ ", "
				+ "purchase_order_number: " + purchase_order_number
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Authorizenet_acceptjs("authorizenet_acceptjs"),
		Braintree("braintree"),
		Braintree_cc_vault("braintree_cc_vault"),
		Code("code"),
		Hosted_pro("hosted_pro"),
		Payflow_express("payflow_express"),
		Payflow_link("payflow_link"),
		Payflowpro("payflowpro"),
		Paypal_express("paypal_express"),
		Purchase_order_number("purchase_order_number");

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
		private AuthorizenetInput authorizenet_acceptjs;
		private BraintreeInput braintree;
		private BraintreeCcVaultInput braintree_cc_vault;
		private String code;
		private HostedProInput hosted_pro;
		private PayflowExpressInput payflow_express;
		private PayflowLinkInput payflow_link;
		private PayflowProInput payflowpro;
		private PaypalExpressInput paypal_express;
		private String purchase_order_number;


		public Builder withAuthorizenet_acceptjs(AuthorizenetInput authorizenet_acceptjs) {
			this.authorizenet_acceptjs = authorizenet_acceptjs;
			return this;
		}
		public Builder withBraintree(BraintreeInput braintree) {
			this.braintree = braintree;
			return this;
		}
		public Builder withBraintree_cc_vault(BraintreeCcVaultInput braintree_cc_vault) {
			this.braintree_cc_vault = braintree_cc_vault;
			return this;
		}
		public Builder withCode(String code) {
			this.code = code;
			return this;
		}
		public Builder withHosted_pro(HostedProInput hosted_pro) {
			this.hosted_pro = hosted_pro;
			return this;
		}
		public Builder withPayflow_express(PayflowExpressInput payflow_express) {
			this.payflow_express = payflow_express;
			return this;
		}
		public Builder withPayflow_link(PayflowLinkInput payflow_link) {
			this.payflow_link = payflow_link;
			return this;
		}
		public Builder withPayflowpro(PayflowProInput payflowpro) {
			this.payflowpro = payflowpro;
			return this;
		}
		public Builder withPaypal_express(PaypalExpressInput paypal_express) {
			this.paypal_express = paypal_express;
			return this;
		}
		public Builder withPurchase_order_number(String purchase_order_number) {
			this.purchase_order_number = purchase_order_number;
			return this;
		}

		public PaymentMethodInput build() {
			PaymentMethodInput _object = new PaymentMethodInput();
			_object.setAuthorizenet_acceptjs(authorizenet_acceptjs);
			_object.setBraintree(braintree);
			_object.setBraintree_cc_vault(braintree_cc_vault);
			_object.setCode(code);
			_object.setHosted_pro(hosted_pro);
			_object.setPayflow_express(payflow_express);
			_object.setPayflow_link(payflow_link);
			_object.setPayflowpro(payflowpro);
			_object.setPaypal_express(paypal_express);
			_object.setPurchase_order_number(purchase_order_number);
			return _object;
		}
	}
}
