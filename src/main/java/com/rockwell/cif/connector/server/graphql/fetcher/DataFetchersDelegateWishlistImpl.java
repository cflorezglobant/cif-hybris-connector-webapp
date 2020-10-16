package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Wishlist;
import com.rockwell.cif.connector.server.graphql.model.WishlistItem;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class DataFetchersDelegateWishlistImpl implements DataFetchersDelegateWishlist {
    @Override
    public List<WishlistItem> items(DataFetchingEnvironment dataFetchingEnvironment, Wishlist origin) {
        return null;
    }

    @Override
    public List<Wishlist> batchLoader(List<UUID> keys) {
        return null;
    }
}
