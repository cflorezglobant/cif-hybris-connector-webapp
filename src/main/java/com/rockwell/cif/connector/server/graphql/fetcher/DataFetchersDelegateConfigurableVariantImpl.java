package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.ConfigurableVariant;
import com.rockwell.cif.connector.server.graphql.model.SimpleProduct;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.ConfigurableAttributeOption;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateConfigurableVariantImpl implements DataFetchersDelegateConfigurableVariant {
    @Override
    public List<ConfigurableAttributeOption> attributes(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableVariant origin) {
        return null;
    }

    @Override
    public SimpleProduct product(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableVariant origin) {
        return null;
    }
}
