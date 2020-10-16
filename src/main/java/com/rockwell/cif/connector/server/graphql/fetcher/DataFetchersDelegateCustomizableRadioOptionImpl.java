package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableRadioOption;
import com.rockwell.cif.connector.server.graphql.model.CustomizableRadioValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomizableRadioOptionImpl implements DataFetchersDelegateCustomizableRadioOption {
    @Override
    public List<CustomizableRadioValue> value(DataFetchingEnvironment dataFetchingEnvironment, CustomizableRadioOption origin) {
        return null;
    }
}
