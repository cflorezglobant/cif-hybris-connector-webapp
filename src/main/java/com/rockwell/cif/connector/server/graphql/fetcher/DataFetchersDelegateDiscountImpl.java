package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Discount;
import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateDiscountImpl implements DataFetchersDelegateDiscount {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, Discount origin) {
        return null;
    }
}
