package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class DataFetchersDelegateCartImpl implements DataFetchersDelegateCart {
    @Override
    public AppliedCoupon applied_coupon(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public List<AppliedCoupon> applied_coupons(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public List<AvailablePaymentMethod> available_payment_methods(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public BillingCartAddress billing_address(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public List<CartItemInterface> items(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public CartPrices prices(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public SelectedPaymentMethod selected_payment_method(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public List<ShippingCartAddress> shipping_addresses(DataFetchingEnvironment dataFetchingEnvironment, Cart origin) {
        return null;
    }

    @Override
    public List<Cart> batchLoader(List<UUID> keys) {
        return null;
    }
}
