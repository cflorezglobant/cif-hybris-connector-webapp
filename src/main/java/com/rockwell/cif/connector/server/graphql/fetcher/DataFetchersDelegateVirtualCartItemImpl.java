package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartItemPrices;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import com.rockwell.cif.connector.server.graphql.model.VirtualCartItem;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SelectedCustomizableOption;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateVirtualCartItemImpl implements DataFetchersDelegateVirtualCartItem {
    @Override
    public List<SelectedCustomizableOption> customizable_options(DataFetchingEnvironment dataFetchingEnvironment, VirtualCartItem origin) {
        return null;
    }

    @Override
    public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, VirtualCartItem origin) {
        return null;
    }

    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, VirtualCartItem origin) {
        return null;
    }
}
