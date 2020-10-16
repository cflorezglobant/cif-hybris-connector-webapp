package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableAreaOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableAreaValue;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCustomizableAreaOptionImpl implements DataFetchersDelegateCustomizableAreaOption {
    @Override
    public CustomizableAreaValue value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableAreaOption origin) {
        return null;
    }
}
