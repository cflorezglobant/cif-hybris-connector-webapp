package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Attribute;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomAttributeMetadata;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomAttributeMetadataImpl implements DataFetchersDelegateCustomAttributeMetadata {
    @Override
    public List<Attribute> items(DataFetchingEnvironment dataFetchingEnvironment, CustomAttributeMetadata origin) {
        return null;
    }
}
