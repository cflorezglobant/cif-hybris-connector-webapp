package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateGroupedProductImpl implements DataFetchersDelegateGroupedProduct {
    @Override
    public List<CategoryInterface> categories(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getCategories();
    }

    @Override
    public List<ProductInterface> crosssell_products(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue description(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getDescription();
    }

    @Override
    public ProductImage image(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getImage();
    }

    @Override
    public List<GroupedProductItem> items(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public List<MediaGalleryInterface> media_gallery(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getMedia_gallery();
    }

    @Override
    public List<MediaGalleryEntry> media_gallery_entries(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getMedia_gallery_entries();
    }

    @Override
    public ProductPrices price(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getPrice();
    }

    @Override
    public PriceRange price_range(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getPrice_range();
    }

    @Override
    public List<TierPrice> price_tiers(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public List<ProductLinksInterface> product_links(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> related_products(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue short_description(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public ProductImage small_image(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getSmall_image();
    }

    @Override
    public ProductImage thumbnail(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return origin.getThumbnail();
    }

    @Override
    public List<ProductTierPrices> tier_prices(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> upsell_products(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public List<UrlRewrite> url_rewrites(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }

    @Override
    public List<Website> websites(DataFetchingEnvironment dataFetchingEnvironment, GroupedProduct origin) {
        return null;
    }
}
