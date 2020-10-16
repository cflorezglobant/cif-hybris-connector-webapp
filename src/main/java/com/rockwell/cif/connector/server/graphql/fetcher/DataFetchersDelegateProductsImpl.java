package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateProductsImpl implements DataFetchersDelegateProducts {
    @Override
    public List<Aggregation> aggregations(DataFetchingEnvironment dataFetchingEnvironment, Products origin) {
        return origin.getAggregations();
    }

    @Override
    public List<LayerFilter> filters(DataFetchingEnvironment dataFetchingEnvironment, Products origin) {
        return origin.getFilters();
    }

    @Override
    public List<ProductInterface> items(DataFetchingEnvironment dataFetchingEnvironment, Products origin) {
        return origin.getItems();
    }

    @Override
    public SearchResultPageInfo page_info(DataFetchingEnvironment dataFetchingEnvironment, Products origin) {
        return origin.getPage_info();
    }

    @Override
    public SortFields sort_fields(DataFetchingEnvironment dataFetchingEnvironment, Products origin) {
        return origin.getSort_fields();
    }
}
