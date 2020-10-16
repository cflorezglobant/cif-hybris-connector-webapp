package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CartTaxItem;
import com.rockwell.cif.connector.server.graphql.model.Money;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateCartTaxItemImpl implements DataFetchersDelegateCartTaxItem {
    @Override
    public Money amount(DataFetchingEnvironment dataFetchingEnvironment, CartTaxItem origin) {
        return null;
    }
}
