package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomizableOptionInterface;
import com.rockwell.cif.connector.server.graphql.model.CustomizableProductInterface;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomizableProductInterfaceImpl implements DataFetchersDelegateCustomizableProductInterface {
    @Override
    public List<CustomizableOptionInterface> options(DataFetchingEnvironment dataFetchingEnvironment, CustomizableProductInterface origin) {
        return null;
    }
}
