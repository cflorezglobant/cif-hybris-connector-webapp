package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.FixedProductTax;
import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateFixedProductTaxImpl implements DataFetchersDelegateFixedProductTax {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, FixedProductTax origin) {
        return null;
    }
}
