package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.PaymentToken;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomerPaymentTokens;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCustomerPaymentTokensImpl implements DataFetchersDelegateCustomerPaymentTokens {
    @Override
    public List<PaymentToken> items(DataFetchingEnvironment dataFetchingEnvironment, CustomerPaymentTokens origin) {
        return null;
    }
}
