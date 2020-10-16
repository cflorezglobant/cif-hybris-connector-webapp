package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.ConfigurableProductOptions;
import com.rockwell.cif.connector.server.graphql.model.ConfigurableProductOptionsValues;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateConfigurableProductOptionsImpl implements DataFetchersDelegateConfigurableProductOptions {
    @Override
    public List<ConfigurableProductOptionsValues> values(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProductOptions origin) {
        return null;
    }
}
