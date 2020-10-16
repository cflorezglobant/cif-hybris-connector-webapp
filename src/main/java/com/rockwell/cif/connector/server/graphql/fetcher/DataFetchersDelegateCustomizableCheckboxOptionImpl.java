package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableCheckboxOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableCheckboxValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomizableCheckboxOptionImpl implements DataFetchersDelegateCustomizableCheckboxOption {
    @Override
    public List<CustomizableCheckboxValue> value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableCheckboxOption origin) {
        return null;
    }
}
