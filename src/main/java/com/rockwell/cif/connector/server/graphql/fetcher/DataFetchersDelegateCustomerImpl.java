package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Customer;
import com.rockwell.cif.connector.server.graphql.model.CustomerAddress;
import com.rockwell.cif.connector.server.graphql.model.Wishlist;
import graphql.schema.DataFetchingEnvironment;
import org.dataloader.DataLoader;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Component
public class DataFetchersDelegateCustomerImpl implements DataFetchersDelegateCustomer {
    @Override
    public List<CustomerAddress> addresses(DataFetchingEnvironment dataFetchingEnvironment, Customer origin) {
        return null;
    }

    @Override
    public Wishlist wishlist(DataFetchingEnvironment dataFetchingEnvironment, Customer origin) {
        return null;
    }

    @Override
    public CompletableFuture<Wishlist> wishlist(DataFetchingEnvironment dataFetchingEnvironment, DataLoader<UUID, Wishlist> dataLoader, Customer origin) {
        return null;
    }
}
