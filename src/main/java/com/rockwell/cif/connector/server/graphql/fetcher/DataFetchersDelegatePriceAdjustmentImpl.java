package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Money;
import com.rockwell.cif.connector.server.graphql.model.PriceAdjustment;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegatePriceAdjustmentImpl implements DataFetchersDelegatePriceAdjustment {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, PriceAdjustment origin) {
        return null;
    }
}
