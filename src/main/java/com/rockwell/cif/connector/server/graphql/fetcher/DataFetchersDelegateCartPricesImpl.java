package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCartPricesImpl implements DataFetchersDelegateCartPrices {
    @Override
    public List<CartTaxItem> applied_taxes(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }

    @Override
    public CartDiscount discount(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }

    @Override
    public List<Discount> discounts(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }

    @Override
    public Money grand_total(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }

    @Override
    public Money subtotal_excluding_tax(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }

    @Override
    public Money subtotal_including_tax(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }

    @Override
    public Money subtotal_with_discount_excluding_tax(DataFetchingEnvironment dataFetchingEnvironment, CartPrices origin) {
        return null;
    }
}
