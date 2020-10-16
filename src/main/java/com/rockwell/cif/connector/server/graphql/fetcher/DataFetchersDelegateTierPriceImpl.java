package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Money;
import com.rockwell.cif.connector.server.graphql.model.ProductDiscount;
import com.rockwell.cif.connector.server.graphql.model.TierPrice;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateTierPriceImpl implements DataFetchersDelegateTierPrice {
    @Override
    public ProductDiscount discount(DataFetchingEnvironment dataFetchingEnvironment, TierPrice origin) {
        return origin.getDiscount();
    }

    @Override
    public Money final_price(DataFetchingEnvironment dataFetchingEnvironment, TierPrice origin) {
        return origin.getFinal_price();
    }
}
