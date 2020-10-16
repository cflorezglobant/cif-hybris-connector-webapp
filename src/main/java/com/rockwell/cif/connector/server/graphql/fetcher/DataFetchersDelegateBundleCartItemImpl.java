package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateBundleCartItemImpl implements DataFetchersDelegateBundleCartItem {
    @Override
    public List<SelectedBundleOption> bundle_options(DataFetchingEnvironment dataFetchingEnvironment, BundleCartItem origin) {
        return null;
    }

    @Override
    public List<SelectedCustomizableOption> customizable_options(DataFetchingEnvironment dataFetchingEnvironment, BundleCartItem origin) {
        return null;
    }

    @Override
    public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, BundleCartItem origin) {
        return null;
    }

    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, BundleCartItem origin) {
        return null;
    }
}
