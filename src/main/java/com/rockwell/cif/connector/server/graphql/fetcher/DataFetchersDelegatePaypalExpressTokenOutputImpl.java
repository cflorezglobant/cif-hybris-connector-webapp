package com.rockwell.cif.connector.server.graphql.fetcher;

import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.PaypalExpressTokenOutput;
import com.rockwell.cif.connector.server.graphql.model.PaypalExpressUrlList;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegatePaypalExpressTokenOutputImpl implements DataFetchersDelegatePaypalExpressTokenOutput {
    @Override
    public PaypalExpressUrlList paypal_urls(DataFetchingEnvironment dataFetchingEnvironment, PaypalExpressTokenOutput origin) {
        return null;
    }
}
