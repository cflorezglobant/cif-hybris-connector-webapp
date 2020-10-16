package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CartItemSelectedOptionValuePrice;
import com.rockwell.cif.connector.server.graphql.model.SelectedCustomizableOptionValue;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateSelectedCustomizableOptionValueImpl implements DataFetchersDelegateSelectedCustomizableOptionValue {
    @Override
    public CartItemSelectedOptionValuePrice price(DataFetchingEnvironment dataFetchingEnvironment, SelectedCustomizableOptionValue origin) {
        return null;
    }
}
