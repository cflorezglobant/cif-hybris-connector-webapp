package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableFieldOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableFieldValue;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCustomizableFieldOptionImpl implements DataFetchersDelegateCustomizableFieldOption {
    @Override
    public CustomizableFieldValue value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableFieldOption origin) {
        return null;
    }
}
