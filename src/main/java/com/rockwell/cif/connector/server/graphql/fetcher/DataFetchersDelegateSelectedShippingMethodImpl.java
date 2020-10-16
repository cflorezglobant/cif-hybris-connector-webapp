package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SelectedShippingMethod;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateSelectedShippingMethodImpl implements DataFetchersDelegateSelectedShippingMethod {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, SelectedShippingMethod origin) {
        return null;
    }

    @Override
    public Money base_amount(DataFetchingEnvironment dataFetchingEnvironment, SelectedShippingMethod origin) {
        return null;
    }
}
