package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.BundleItemOption;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateBundleItemOptionImpl implements DataFetchersDelegateBundleItemOption {
    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, BundleItemOption origin) {
        return null;
    }
}
