package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateConfigurableCartItemImpl implements DataFetchersDelegateConfigurableCartItem {
    @Override
    public List<SelectedConfigurableOption> configurable_options(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin) {
        return null;
    }

    @Override
    public List<SelectedCustomizableOption> customizable_options(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin) {
        return null;
    }

    @Override
    public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin) {
        return null;
    }

    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin) {
        return null;
    }
}
