package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Attribute;
import com.rockwell.cif.connector.server.graphql.model.AttributeOption;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateAttributeImpl implements DataFetchersDelegateAttribute {
    @Override
    public List<AttributeOption> attribute_options(DataFetchingEnvironment dataFetchingEnvironment, Attribute origin) {
        return null;
    }
}
