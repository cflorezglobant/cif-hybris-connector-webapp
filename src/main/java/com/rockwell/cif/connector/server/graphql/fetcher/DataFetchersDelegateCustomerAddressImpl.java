package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CustomerAddress;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomerAddressAttribute;
import com.rockwell.cif.connector.server.graphql.model.CustomerAddressRegion;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomerAddressImpl implements DataFetchersDelegateCustomerAddress {
    @Override
    public List<CustomerAddressAttribute> custom_attributes(DataFetchingEnvironment dataFetchingEnvironment, CustomerAddress origin) {
        return null;
    }

    @Override
    public List<CustomerAddressAttribute> extension_attributes(DataFetchingEnvironment dataFetchingEnvironment, CustomerAddress origin) {
        return null;
    }

    @Override
    public CustomerAddressRegion region(DataFetchingEnvironment dataFetchingEnvironment, CustomerAddress origin) {
        return null;
    }

    @Override
    public List<String> street(DataFetchingEnvironment dataFetchingEnvironment, CustomerAddress origin) {
        return null;
    }
}
