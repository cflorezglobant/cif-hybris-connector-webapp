package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateProductInterfaceImpl implements DataFetchersDelegateProductInterface {
    @Override
    public List<CategoryInterface> categories(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getCategories();
    }

    @Override
    public List<ProductInterface> crosssell_products(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public ComplexTextValue description(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getDescription();
    }

    @Override
    public ProductImage image(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getImage();
    }

    @Override
    public List<MediaGalleryInterface> media_gallery(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getMedia_gallery();
    }

    @Override
    public List<MediaGalleryEntry> media_gallery_entries(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getMedia_gallery_entries();
    }

    @Override
    public ProductPrices price(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getPrice();
    }

    @Override
    public PriceRange price_range(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getPrice_range();
    }

    @Override
    public List<TierPrice> price_tiers(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public List<ProductLinksInterface> product_links(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public List<ProductInterface> related_products(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public ComplexTextValue short_description(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getShort_description();
    }

    @Override
    public ProductImage small_image(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getSmall_image();
    }

    @Override
    public ProductImage thumbnail(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return origin.getThumbnail();
    }

    @Override
    public List<ProductTierPrices> tier_prices(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public List<ProductInterface> upsell_products(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public List<UrlRewrite> url_rewrites(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }

    @Override
    public List<Website> websites(DataFetchingEnvironment dataFetchingEnvironment, ProductInterface origin) {
        return null;
    }
}
