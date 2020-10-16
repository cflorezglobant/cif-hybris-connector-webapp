package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Customer;
import com.rockwell.cif.connector.server.graphql.model.CustomerOutput;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCustomerOutputImpl implements DataFetchersDelegateCustomerOutput {
    @Override
    public Customer customer(DataFetchingEnvironment dataFetchingEnvironment, CustomerOutput origin) {
        return null;
    }
}
