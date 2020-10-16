package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomerDownloadableProduct;
import com.rockwell.cif.connector.server.graphql.model.CustomerDownloadableProducts;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomerDownloadableProductsImpl implements DataFetchersDelegateCustomerDownloadableProducts {
    @Override
    public List<CustomerDownloadableProduct> items(DataFetchingEnvironment dataFetchingEnvironment, CustomerDownloadableProducts origin) {
        return null;
    }
}
