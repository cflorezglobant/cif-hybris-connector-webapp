package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.SwatchData;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SwatchLayerFilterItem;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateSwatchLayerFilterItemImpl implements DataFetchersDelegateSwatchLayerFilterItem {
    @Override
    public SwatchData swatch_data(DataFetchingEnvironment dataFetchingEnvironment, SwatchLayerFilterItem origin) {
        return null;
    }
}
