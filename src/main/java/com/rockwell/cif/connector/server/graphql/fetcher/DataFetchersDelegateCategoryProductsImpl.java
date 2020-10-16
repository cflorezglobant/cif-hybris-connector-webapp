package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CategoryProducts;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SearchResultPageInfo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCategoryProductsImpl implements DataFetchersDelegateCategoryProducts {
    @Override
    public List<ProductInterface> items(DataFetchingEnvironment dataFetchingEnvironment, CategoryProducts origin) {
        return origin.getItems();
    }

    @Override
    public SearchResultPageInfo page_info(DataFetchingEnvironment dataFetchingEnvironment, CategoryProducts origin) {
        return null;
    }
}
