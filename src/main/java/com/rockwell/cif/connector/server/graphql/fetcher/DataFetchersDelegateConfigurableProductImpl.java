package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateConfigurableProductImpl implements DataFetchersDelegateConfigurableProduct {
    @Override
    public List<CategoryInterface> categories(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getCategories();
    }

    @Override
    public List<ConfigurableProductOptions> configurable_options(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> crosssell_products(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue description(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getDescription();
    }

    @Override
    public ProductImage image(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getImage();
    }

    @Override
    public List<MediaGalleryInterface> media_gallery(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getMedia_gallery();
    }

    @Override
    public List<MediaGalleryEntry> media_gallery_entries(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getMedia_gallery_entries();
    }

    @Override
    public List<CustomizableOptionInterface> options(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public ProductPrices price(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getPrice();
    }

    @Override
    public PriceRange price_range(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getPrice_range();
    }

    @Override
    public List<TierPrice> price_tiers(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public List<ProductLinksInterface> product_links(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> related_products(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public ComplexTextValue short_description(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public ProductImage small_image(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getSmall_image();
    }

    @Override
    public ProductImage thumbnail(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getThumbnail();
    }

    @Override
    public List<ProductTierPrices> tier_prices(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public List<ProductInterface> upsell_products(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public List<UrlRewrite> url_rewrites(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }

    @Override
    public List<ConfigurableVariant> variants(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return origin.getVariants();
    }

    @Override
    public List<Website> websites(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableProduct origin) {
        return null;
    }
}
