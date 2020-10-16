package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Cart;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import com.rockwell.cif.connector.server.graphql.model.SetBillingAddressOnCartOutput;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Component
public class DataFetchersDelegateSetBillingAddressOnCartOutputImpl implements DataFetchersDelegateSetBillingAddressOnCartOutput {
    @Override
    public Cart cart(DataFetchingEnvironment dataFetchingEnvironment, SetBillingAddressOnCartOutput origin) {
        return null;
    }

    @Override
    public CompletableFuture<Cart> cart(DataFetchingEnvironment dataFetchingEnvironment, DataLoader<UUID, Cart> dataLoader, SetBillingAddressOnCartOutput origin) {
        return null;
    }
}
