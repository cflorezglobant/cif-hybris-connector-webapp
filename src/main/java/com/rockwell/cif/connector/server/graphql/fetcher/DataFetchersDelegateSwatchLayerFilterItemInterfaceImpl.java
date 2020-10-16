package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.SwatchData;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SwatchLayerFilterItemInterface;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateSwatchLayerFilterItemInterfaceImpl implements DataFetchersDelegateSwatchLayerFilterItemInterface {
    @Override
    public SwatchData swatch_data(DataFetchingEnvironment dataFetchingEnvironment, SwatchLayerFilterItemInterface origin) {
        return null;
    }
}
