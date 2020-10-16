package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateBundleProductImpl implements DataFetchersDelegateBundleProduct {
    @Override
    public List<CategoryInterface> categories(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> crosssell_products(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue description(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public ProductImage image(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<BundleItem> items(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<MediaGalleryInterface> media_gallery(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<MediaGalleryEntry> media_gallery_entries(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<CustomizableOptionInterface> options(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public ProductPrices price(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public PriceRange price_range(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<TierPrice> price_tiers(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<ProductLinksInterface> product_links(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> related_products(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue short_description(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public ProductImage small_image(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public ProductImage thumbnail(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<ProductTierPrices> tier_prices(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> upsell_products(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<UrlRewrite> url_rewrites(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }

    @Override
    public List<Website> websites(DataFetchingEnvironment dataFetchingEnvironment, BundleProduct origin) {
        return null;
    }
}
