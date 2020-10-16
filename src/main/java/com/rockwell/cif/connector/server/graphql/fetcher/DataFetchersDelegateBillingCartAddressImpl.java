package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.BillingCartAddress;
import com.rockwell.cif.connector.server.graphql.model.CartAddressCountry;
import com.rockwell.cif.connector.server.graphql.model.CartAddressRegion;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateBillingCartAddressImpl implements DataFetchersDelegateBillingCartAddress {
    @Override
    public CartAddressCountry country(DataFetchingEnvironment dataFetchingEnvironment, BillingCartAddress origin) {
        return null;
    }

    @Override
    public CartAddressRegion region(DataFetchingEnvironment dataFetchingEnvironment, BillingCartAddress origin) {
        return null;
    }

    @Override
    public List<String> street(DataFetchingEnvironment dataFetchingEnvironment, BillingCartAddress origin) {
        return null;
    }
}
