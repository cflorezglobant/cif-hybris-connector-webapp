package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartItemPrices;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import com.rockwell.cif.connector.server.graphql.model.SimpleCartItem;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SelectedCustomizableOption;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateSimpleCartItemImpl implements DataFetchersDelegateSimpleCartItem {
    @Override
    public List<SelectedCustomizableOption> customizable_options(DataFetchingEnvironment dataFetchingEnvironment, SimpleCartItem origin) {
        return null;
    }

    @Override
    public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, SimpleCartItem origin) {
        return null;
    }

    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, SimpleCartItem origin) {
        return null;
    }
}
