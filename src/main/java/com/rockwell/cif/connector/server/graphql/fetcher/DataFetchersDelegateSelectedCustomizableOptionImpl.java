package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SelectedCustomizableOption;
import com.rockwell.cif.connector.server.graphql.model.SelectedCustomizableOptionValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateSelectedCustomizableOptionImpl implements DataFetchersDelegateSelectedCustomizableOption {
    @Override
    public List<SelectedCustomizableOptionValue> values(DataFetchingEnvironment dataFetchingEnvironment, SelectedCustomizableOption origin) {
        return null;
    }
}
