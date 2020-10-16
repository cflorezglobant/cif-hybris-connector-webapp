package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.Country;
import com.rockwell.cif.connector.server.graphql.model.Region;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCountryImpl implements DataFetchersDelegateCountry {
    @Override
    public List<Region> available_regions(DataFetchingEnvironment dataFetchingEnvironment, Country origin) {
        return null;
    }
}
