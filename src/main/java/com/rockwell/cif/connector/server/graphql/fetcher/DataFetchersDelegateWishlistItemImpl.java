package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import com.rockwell.cif.connector.server.graphql.model.WishlistItem;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateWishlistItemImpl implements DataFetchersDelegateWishlistItem {
    @Override
    public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, WishlistItem origin) {
        return null;
    }
}
