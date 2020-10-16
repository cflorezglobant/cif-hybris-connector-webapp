package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.PaypalExpressToken;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.PaypalExpressUrlList;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegatePaypalExpressTokenImpl implements DataFetchersDelegatePaypalExpressToken {
    @Override
    public PaypalExpressUrlList paypal_urls(DataFetchingEnvironment dataFetchingEnvironment, PaypalExpressToken origin) {
        return null;
    }
}
