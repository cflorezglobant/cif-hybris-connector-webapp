package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Cart;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import com.rockwell.cif.connector.server.graphql.model.UpdateCartItemsOutput;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Component
public class DataFetchersDelegateUpdateCartItemsOutputImpl implements DataFetchersDelegateUpdateCartItemsOutput {
    @Override
    public Cart cart(DataFetchingEnvironment dataFetchingEnvironment, UpdateCartItemsOutput origin) {
        return null;
    }

    @Override
    public CompletableFuture<Cart> cart(DataFetchingEnvironment dataFetchingEnvironment, DataLoader<UUID, Cart> dataLoader, UpdateCartItemsOutput origin) {
        return null;
    }
}
