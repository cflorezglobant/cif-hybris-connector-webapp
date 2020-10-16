package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartDiscount;
import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCartDiscountImpl implements DataFetchersDelegateCartDiscount {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, CartDiscount origin) {
        return null;
    }

    @Override
    public List<String> label(DataFetchingEnvironment dataFetchingEnvironment, CartDiscount origin) {
        return null;
    }
}
