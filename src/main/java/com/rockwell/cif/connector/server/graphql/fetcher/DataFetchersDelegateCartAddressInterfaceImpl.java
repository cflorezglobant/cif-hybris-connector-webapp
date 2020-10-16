package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartAddressCountry;
import com.rockwell.cif.connector.server.graphql.model.CartAddressInterface;
import com.rockwell.cif.connector.server.graphql.model.CartAddressRegion;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCartAddressInterfaceImpl implements DataFetchersDelegateCartAddressInterface {
    @Override
    public CartAddressCountry country(DataFetchingEnvironment dataFetchingEnvironment, CartAddressInterface origin) {
        return null;
    }

    @Override
    public CartAddressRegion region(DataFetchingEnvironment dataFetchingEnvironment, CartAddressInterface origin) {
        return null;
    }

    @Override
    public List<String> street(DataFetchingEnvironment dataFetchingEnvironment, CartAddressInterface origin) {
        return null;
    }
}
