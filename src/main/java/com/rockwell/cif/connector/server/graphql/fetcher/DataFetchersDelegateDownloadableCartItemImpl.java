package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateDownloadableCartItemImpl implements DataFetchersDelegateDownloadableCartItem {
    @Override
    public List<SelectedCustomizableOption> customizable_options(DataFetchingEnvironment dataFetchingEnvironment, DownloadableCartItem origin) {
        return null;
    }

    @Override
    public List<DownloadableProductLinks> links(DataFetchingEnvironment dataFetchingEnvironment, DownloadableCartItem origin) {
        return null;
    }

    @Override
    public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, DownloadableCartItem origin) {
        return null;
    }

    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, DownloadableCartItem origin) {
        return null;
    }

    @Override
    public List<DownloadableProductSamples> samples(DataFetchingEnvironment dataFetchingEnvironment, DownloadableCartItem origin) {
        return null;
    }
}
