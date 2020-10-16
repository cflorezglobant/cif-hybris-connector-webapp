package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.ProductVideo;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.ProductMediaGalleryEntriesVideoContent;
import org.springframework.stereotype.Component;

@Component
public class DataFetchersDelegateProductVideoImpl implements DataFetchersDelegateProductVideo {
    @Override
    public ProductMediaGalleryEntriesVideoContent video_content(DataFetchingEnvironment dataFetchingEnvironment, ProductVideo origin) {
        return origin.getVideo_content();
    }
}
