package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.HttpQueryParameter;
import com.rockwell.cif.connector.server.graphql.model.UrlRewrite;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateUrlRewriteImpl implements DataFetchersDelegateUrlRewrite {
    @Override
    public List<HttpQueryParameter> parameters(DataFetchingEnvironment dataFetchingEnvironment, UrlRewrite origin) {
        return null;
    }
}
