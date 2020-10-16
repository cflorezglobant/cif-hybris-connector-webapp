package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartItemInterface;
import com.rockwell.cif.connector.server.graphql.model.CartItemPrices;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCartItemInterfaceImpl implements DataFetchersDelegateCartItemInterface {
    @Override
    public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, CartItemInterface origin) {
        return null;
    }

    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, CartItemInterface origin) {
        return null;
    }
}
