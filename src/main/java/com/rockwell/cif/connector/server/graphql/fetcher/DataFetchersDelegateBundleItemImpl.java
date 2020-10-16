package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.BundleItem;
import com.rockwell.cif.connector.server.graphql.model.BundleItemOption;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateBundleItemImpl implements DataFetchersDelegateBundleItem {
    @Override
    public List<BundleItemOption> options(DataFetchingEnvironment dataFetchingEnvironment, BundleItem origin) {
        return null;
    }
}
