package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Money;
import com.rockwell.cif.connector.server.graphql.model.Price;
import com.rockwell.cif.connector.server.graphql.model.PriceAdjustment;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegatePriceImpl implements DataFetchersDelegatePrice {
    @Override
    public List<PriceAdjustment> adjustments(DataFetchingEnvironment dataFetchingEnvironment, Price origin) {
        return null;
    }

    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, Price origin) {
        return null;
    }
}
