package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.SortField;
import com.rockwell.cif.connector.server.graphql.model.SortFields;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateSortFieldsImpl implements DataFetchersDelegateSortFields {
    @Override
    public List<SortField> options(DataFetchingEnvironment dataFetchingEnvironment, SortFields origin) {
        return null;
    }
}
