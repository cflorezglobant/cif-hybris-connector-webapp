package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Order;
import com.rockwell.cif.connector.server.graphql.model.PlaceOrderOutput;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegatePlaceOrderOutputImpl implements DataFetchersDelegatePlaceOrderOutput {
    @Override
    public Order order(DataFetchingEnvironment dataFetchingEnvironment, PlaceOrderOutput origin) {
        return null;
    }
}
