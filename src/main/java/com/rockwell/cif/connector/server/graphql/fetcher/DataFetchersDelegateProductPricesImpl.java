package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Price;
import com.rockwell.cif.connector.server.graphql.model.ProductPrices;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateProductPricesImpl implements DataFetchersDelegateProductPrices {
    @Override
    public Price maximalPrice(DataFetchingEnvironment dataFetchingEnvironment, ProductPrices origin) {
        return origin.getMaximalPrice();
    }

    @Override
    public Price minimalPrice(DataFetchingEnvironment dataFetchingEnvironment, ProductPrices origin) {
        return origin.getMinimalPrice();
    }

    @Override
    public Price regularPrice(DataFetchingEnvironment dataFetchingEnvironment, ProductPrices origin) {
        return origin.getRegularPrice();
    }
}
