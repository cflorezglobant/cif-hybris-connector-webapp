package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.ExchangeRate;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.Currency;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCurrencyImpl implements DataFetchersDelegateCurrency{
    @Override
    public List<String> available_currency_codes(DataFetchingEnvironment dataFetchingEnvironment, Currency origin) {
        return null;
    }

    @Override
    public List<ExchangeRate> exchange_rates(DataFetchingEnvironment dataFetchingEnvironment, Currency origin) {
        return null;
    }
}
