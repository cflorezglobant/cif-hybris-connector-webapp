package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableMultipleOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableMultipleValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomizableMultipleOptionImpl implements DataFetchersDelegateCustomizableMultipleOption {
    @Override
    public List<CustomizableMultipleValue> value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableMultipleOption origin) {
        return null;
    }
}
