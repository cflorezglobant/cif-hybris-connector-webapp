package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CustomerOrder;
import com.rockwell.cif.connector.server.graphql.model.CustomerOrders;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomerOrdersImpl implements DataFetchersDelegateCustomerOrders {
    @Override
    public List<CustomerOrder> items(DataFetchingEnvironment dataFetchingEnvironment, CustomerOrders origin) {
        return null;
    }
}
