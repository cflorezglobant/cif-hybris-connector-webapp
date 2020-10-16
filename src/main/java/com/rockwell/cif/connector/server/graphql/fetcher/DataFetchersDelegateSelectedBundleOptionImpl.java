package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.SelectedBundleOption;
import com.rockwell.cif.connector.server.graphql.model.SelectedBundleOptionValue;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateSelectedBundleOptionImpl implements DataFetchersDelegateSelectedBundleOption {
    @Override
    public List<SelectedBundleOptionValue> values(DataFetchingEnvironment dataFetchingEnvironment, SelectedBundleOption origin) {
        return null;
    }
}
