package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Aggregation;
import com.rockwell.cif.connector.server.graphql.model.AggregationOption;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateAggregationImpl implements DataFetchersDelegateAggregation {
    @Override
    public List<AggregationOption> options(DataFetchingEnvironment dataFetchingEnvironment, Aggregation origin) {
        return null;
    }
}
