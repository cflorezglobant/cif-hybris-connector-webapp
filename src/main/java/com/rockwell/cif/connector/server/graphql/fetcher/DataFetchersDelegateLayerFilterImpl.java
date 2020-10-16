package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.LayerFilter;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.LayerFilterItemInterface;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateLayerFilterImpl implements DataFetchersDelegateLayerFilter {
    @Override
    public List<LayerFilterItemInterface> filter_items(DataFetchingEnvironment dataFetchingEnvironment, LayerFilter origin) {
        return null;
    }
}
