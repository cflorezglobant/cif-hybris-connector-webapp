package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.WishlistItem;
import com.rockwell.cif.connector.server.graphql.model.WishlistOutput;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateWishlistOutputImpl implements DataFetchersDelegateWishlistOutput {
    @Override
    public List<WishlistItem> items(DataFetchingEnvironment dataFetchingEnvironment, WishlistOutput origin) {
        return null;
    }
}
