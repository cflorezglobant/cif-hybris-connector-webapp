package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.CmsBlock;
import com.rockwell.cif.connector.server.graphql.model.CmsBlocks;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateCmsBlocksImpl implements DataFetchersDelegateCmsBlocks {
    @Override
    public List<CmsBlock> items(DataFetchingEnvironment dataFetchingEnvironment, CmsBlocks origin) {
        return null;
    }
}
