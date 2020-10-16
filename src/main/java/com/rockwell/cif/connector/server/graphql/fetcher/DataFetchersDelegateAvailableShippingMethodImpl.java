package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.AvailableShippingMethod;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateAvailableShippingMethodImpl implements DataFetchersDelegateAvailableShippingMethod {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, AvailableShippingMethod origin) {
        return null;
    }

    @Override
    public Money base_amount(DataFetchingEnvironment dataFetchingEnvironment, AvailableShippingMethod origin) {
        return null;
    }

    @Override
    public Money price_excl_tax(DataFetchingEnvironment dataFetchingEnvironment, AvailableShippingMethod origin) {
        return null;
    }

    @Override
    public Money price_incl_tax(DataFetchingEnvironment dataFetchingEnvironment, AvailableShippingMethod origin) {
        return null;
    }
}
