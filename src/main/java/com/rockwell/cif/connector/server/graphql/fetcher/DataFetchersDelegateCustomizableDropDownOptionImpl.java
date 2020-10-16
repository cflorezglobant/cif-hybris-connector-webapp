package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableDropDownOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableDropDownValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomizableDropDownOptionImpl implements DataFetchersDelegateCustomizableDropDownOption {
    @Override
    public List<CustomizableDropDownValue> value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableDropDownOption origin) {
        return null;
    }
}
