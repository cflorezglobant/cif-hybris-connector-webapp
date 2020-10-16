package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.GroupedProductItem;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateGroupedProductItemImpl implements DataFetchersDelegateGroupedProductItem {
    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, GroupedProductItem origin) {
        return null;
    }
}
