package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateMutationImpl implements DataFetchersDelegateMutation {
    @Override
    public AddBundleProductsToCartOutput addBundleProductsToCart(DataFetchingEnvironment dataFetchingEnvironment, AddBundleProductsToCartInput input) {
        return null;
    }

    @Override
    public AddConfigurableProductsToCartOutput addConfigurableProductsToCart(DataFetchingEnvironment dataFetchingEnvironment, AddConfigurableProductsToCartInput input) {
        return null;
    }

    @Override
    public AddDownloadableProductsToCartOutput addDownloadableProductsToCart(DataFetchingEnvironment dataFetchingEnvironment, AddDownloadableProductsToCartInput input) {
        return null;
    }

    @Override
    public AddSimpleProductsToCartOutput addSimpleProductsToCart(DataFetchingEnvironment dataFetchingEnvironment, AddSimpleProductsToCartInput input) {
        return null;
    }

    @Override
    public AddVirtualProductsToCartOutput addVirtualProductsToCart(DataFetchingEnvironment dataFetchingEnvironment, AddVirtualProductsToCartInput input) {
        return null;
    }

    @Override
    public ApplyCouponToCartOutput applyCouponToCart(DataFetchingEnvironment dataFetchingEnvironment, ApplyCouponToCartInput input) {
        return null;
    }

    @Override
    public Customer changeCustomerPassword(DataFetchingEnvironment dataFetchingEnvironment, String currentPassword, String newPassword) {
        return null;
    }

    @Override
    public String createBraintreeClientToken(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public CustomerOutput createCustomer(DataFetchingEnvironment dataFetchingEnvironment, CustomerInput input) {
        return null;
    }

    @Override
    public CustomerAddress createCustomerAddress(DataFetchingEnvironment dataFetchingEnvironment, CustomerAddressInput input) {
        return null;
    }

    @Override
    public String createEmptyCart(DataFetchingEnvironment dataFetchingEnvironment, createEmptyCartInput input) {
        return null;
    }

    @Override
    public CreatePayflowProTokenOutput createPayflowProToken(DataFetchingEnvironment dataFetchingEnvironment, PayflowProTokenInput input) {
        return null;
    }

    @Override
    public PaypalExpressTokenOutput createPaypalExpressToken(DataFetchingEnvironment dataFetchingEnvironment, PaypalExpressTokenInput input) {
        return null;
    }

    @Override
    public Boolean deleteCustomerAddress(DataFetchingEnvironment dataFetchingEnvironment, Integer id) {
        return null;
    }

    @Override
    public DeletePaymentTokenOutput deletePaymentToken(DataFetchingEnvironment dataFetchingEnvironment, String public_hash) {
        return null;
    }

    @Override
    public CustomerToken generateCustomerToken(DataFetchingEnvironment dataFetchingEnvironment, String email, String password) {
        return null;
    }

    @Override
    public PayflowProResponseOutput handlePayflowProResponse(DataFetchingEnvironment dataFetchingEnvironment, PayflowProResponseInput input) {
        return null;
    }

    @Override
    public Cart mergeCarts(DataFetchingEnvironment dataFetchingEnvironment, String source_cart_id, String destination_cart_id) {
        return null;
    }

    @Override
    public PlaceOrderOutput placeOrder(DataFetchingEnvironment dataFetchingEnvironment, PlaceOrderInput input) {
        return null;
    }

    @Override
    public RemoveCouponFromCartOutput removeCouponFromCart(DataFetchingEnvironment dataFetchingEnvironment, RemoveCouponFromCartInput input) {
        return null;
    }

    @Override
    public RemoveItemFromCartOutput removeItemFromCart(DataFetchingEnvironment dataFetchingEnvironment, RemoveItemFromCartInput input) {
        return null;
    }

    @Override
    public RevokeCustomerTokenOutput revokeCustomerToken(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public SendEmailToFriendOutput sendEmailToFriend(DataFetchingEnvironment dataFetchingEnvironment, SendEmailToFriendInput input) {
        return null;
    }

    @Override
    public SetBillingAddressOnCartOutput setBillingAddressOnCart(DataFetchingEnvironment dataFetchingEnvironment, SetBillingAddressOnCartInput input) {
        return null;
    }

    @Override
    public SetGuestEmailOnCartOutput setGuestEmailOnCart(DataFetchingEnvironment dataFetchingEnvironment, SetGuestEmailOnCartInput input) {
        return null;
    }

    @Override
    public PlaceOrderOutput setPaymentMethodAndPlaceOrder(DataFetchingEnvironment dataFetchingEnvironment, SetPaymentMethodAndPlaceOrderInput input) {
        return null;
    }

    @Override
    public SetPaymentMethodOnCartOutput setPaymentMethodOnCart(DataFetchingEnvironment dataFetchingEnvironment, SetPaymentMethodOnCartInput input) {
        return null;
    }

    @Override
    public SetShippingAddressesOnCartOutput setShippingAddressesOnCart(DataFetchingEnvironment dataFetchingEnvironment, SetShippingAddressesOnCartInput input) {
        return null;
    }

    @Override
    public SetShippingMethodsOnCartOutput setShippingMethodsOnCart(DataFetchingEnvironment dataFetchingEnvironment, SetShippingMethodsOnCartInput input) {
        return null;
    }

    @Override
    public UpdateCartItemsOutput updateCartItems(DataFetchingEnvironment dataFetchingEnvironment, UpdateCartItemsInput input) {
        return null;
    }

    @Override
    public CustomerOutput updateCustomer(DataFetchingEnvironment dataFetchingEnvironment, CustomerInput input) {
        return null;
    }

    @Override
    public CustomerAddress updateCustomerAddress(DataFetchingEnvironment dataFetchingEnvironment, Integer id, CustomerAddressInput input) {
        return null;
    }
}
