package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.CustomerPaymentTokens;
import com.rockwell.cif.connector.server.graphql.model.DeletePaymentTokenOutput;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateDeletePaymentTokenOutputImpl implements DataFetchersDelegateDeletePaymentTokenOutput {
    @Override
    public CustomerPaymentTokens customerPaymentTokens(DataFetchingEnvironment dataFetchingEnvironment, DeletePaymentTokenOutput origin) {
        return null;
    }
}
