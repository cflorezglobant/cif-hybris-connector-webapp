package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartItemPrices;
import com.rockwell.cif.connector.server.graphql.model.Discount;
import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCartItemPricesImpl implements DataFetchersDelegateCartItemPrices {
    @Override
    public List<Discount> discounts(DataFetchingEnvironment dataFetchingEnvironment, CartItemPrices origin) {
        return null;
    }

    @Override
    public Money price(DataFetchingEnvironment dataFetchingEnvironment, CartItemPrices origin) {
        return null;
    }

    @Override
    public Money row_total(DataFetchingEnvironment dataFetchingEnvironment, CartItemPrices origin) {
        return null;
    }

    @Override
    public Money row_total_including_tax(DataFetchingEnvironment dataFetchingEnvironment, CartItemPrices origin) {
        return null;
    }

    @Override
    public Money total_item_discount(DataFetchingEnvironment dataFetchingEnvironment, CartItemPrices origin) {
        return null;
    }
}
