package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.MediaGalleryEntry;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.ProductMediaGalleryEntriesContent;
import com.rockwell.cif.connector.server.graphql.model.ProductMediaGalleryEntriesVideoContent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateMediaGalleryEntryImpl implements DataFetchersDelegateMediaGalleryEntry {
    @Override
    public ProductMediaGalleryEntriesContent content(DataFetchingEnvironment dataFetchingEnvironment, MediaGalleryEntry origin) {
        return null;
    }

    @Override
    public List<String> types(DataFetchingEnvironment dataFetchingEnvironment, MediaGalleryEntry origin) {
        return null;
    }

    @Override
    public ProductMediaGalleryEntriesVideoContent video_content(DataFetchingEnvironment dataFetchingEnvironment, MediaGalleryEntry origin) {
        return null;
    }
}
