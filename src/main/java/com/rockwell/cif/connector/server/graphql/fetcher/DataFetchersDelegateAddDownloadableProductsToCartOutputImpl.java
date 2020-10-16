package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Cart;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import com.rockwell.cif.connector.server.graphql.model.AddDownloadableProductsToCartOutput;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Component
public class DataFetchersDelegateAddDownloadableProductsToCartOutputImpl implements DataFetchersDelegateAddDownloadableProductsToCartOutput {
    @Override
    public Cart cart(DataFetchingEnvironment dataFetchingEnvironment, AddDownloadableProductsToCartOutput origin) {
        return null;
    }

    @Override
    public CompletableFuture<Cart> cart(DataFetchingEnvironment dataFetchingEnvironment, DataLoader<UUID, Cart> dataLoader, AddDownloadableProductsToCartOutput origin) {
        return null;
    }
}
