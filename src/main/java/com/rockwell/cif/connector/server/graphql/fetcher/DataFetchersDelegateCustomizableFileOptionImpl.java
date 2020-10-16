package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableFileOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableFileValue;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCustomizableFileOptionImpl implements DataFetchersDelegateCustomizableFileOption {
    @Override
    public CustomizableFileValue value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableFileOption origin) {
        return null;
    }
}
