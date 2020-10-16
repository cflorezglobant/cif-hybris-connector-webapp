package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateDownloadableProductImpl implements DataFetchersDelegateDownloadableProduct {
    @Override
    public List<CategoryInterface> categories(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> crosssell_products(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue description(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<DownloadableProductLinks> downloadable_product_links(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<DownloadableProductSamples> downloadable_product_samples(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public ProductImage image(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<MediaGalleryInterface> media_gallery(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<MediaGalleryEntry> media_gallery_entries(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<CustomizableOptionInterface> options(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public ProductPrices price(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public PriceRange price_range(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<TierPrice> price_tiers(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<ProductLinksInterface> product_links(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> related_products(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue short_description(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public ProductImage small_image(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public ProductImage thumbnail(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<ProductTierPrices> tier_prices(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> upsell_products(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<UrlRewrite> url_rewrites(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }

    @Override
    public List<Website> websites(DataFetchingEnvironment dataFetchingEnvironment, DownloadableProduct origin) {
        return null;
    }
}
