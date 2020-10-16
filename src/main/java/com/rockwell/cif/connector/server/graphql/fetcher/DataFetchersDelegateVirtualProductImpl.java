package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateVirtualProductImpl implements DataFetchersDelegateVirtualProduct {
    @Override
    public List<CategoryInterface> categories(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getCategories();
    }

    @Override
    public List<ProductInterface> crosssell_products(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getCrosssell_products();
    }

    @Override
    public ComplexTextValue description(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getDescription();
    }

    @Override
    public ProductImage image(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getImage();
    }

    @Override
    public List<MediaGalleryInterface> media_gallery(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getMedia_gallery();
    }

    @Override
    public List<MediaGalleryEntry> media_gallery_entries(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getMedia_gallery_entries();
    }

    @Override
    public List<CustomizableOptionInterface> options(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getOptions();
    }

    @Override
    public ProductPrices price(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getPrice();
    }

    @Override
    public PriceRange price_range(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getPrice_range();
    }

    @Override
    public List<TierPrice> price_tiers(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getPrice_tiers();
    }

    @Override
    public List<ProductLinksInterface> product_links(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getProduct_links();
    }

    @Override
    public List<ProductInterface> related_products(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getRelated_products();
    }

    @Override
    public ComplexTextValue short_description(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getShort_description();
    }

    @Override
    public ProductImage small_image(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getSmall_image();
    }

    @Override
    public ProductImage thumbnail(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getThumbnail();
    }

    @Override
    public List<ProductTierPrices> tier_prices(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getTier_prices();
    }

    @Override
    public List<ProductInterface> upsell_products(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return origin.getUpsell_products();
    }

    @Override
    public List<UrlRewrite> url_rewrites(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return null;
    }

    @Override
    public List<Website> websites(DataFetchingEnvironment dataFetchingEnvironment, VirtualProduct origin) {
        return null;
    }
}
