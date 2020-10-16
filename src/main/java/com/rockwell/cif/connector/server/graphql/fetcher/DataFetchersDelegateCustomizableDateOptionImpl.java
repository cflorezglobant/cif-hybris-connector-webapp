package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableDateOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableDateValue;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCustomizableDateOptionImpl implements DataFetchersDelegateCustomizableDateOption {
    @Override
    public CustomizableDateValue value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableDateOption origin) {
        return null;
    }
}
