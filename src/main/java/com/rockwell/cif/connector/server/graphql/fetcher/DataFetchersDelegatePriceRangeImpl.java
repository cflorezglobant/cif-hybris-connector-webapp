package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.PriceRange;
import com.rockwell.cif.connector.server.graphql.model.ProductPrice;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegatePriceRangeImpl implements DataFetchersDelegatePriceRange {
    @Override
    public ProductPrice maximum_price(DataFetchingEnvironment dataFetchingEnvironment, PriceRange origin) {
        return origin.getMaximum_price();
    }

    @Override
    public ProductPrice minimum_price(DataFetchingEnvironment dataFetchingEnvironment, PriceRange origin) {
        return origin.getMinimum_price();
    }
}
