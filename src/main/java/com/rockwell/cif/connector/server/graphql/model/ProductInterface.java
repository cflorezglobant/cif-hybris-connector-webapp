/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.annotation.GraphQLInterfaceType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInterfaceType("ProductInterface")
public interface ProductInterface  {

	@GraphQLScalar(fieldName = "activity", graphQLTypeName = "String", javaClass = String.class)
	public void setActivity(String activity);

	@GraphQLScalar(fieldName = "activity", graphQLTypeName = "String", javaClass = String.class)
	public String getActivity();

	@GraphQLScalar(fieldName = "attribute_set_id", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setAttribute_set_id(Integer attribute_set_id);

	@GraphQLScalar(fieldName = "attribute_set_id", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getAttribute_set_id();

	@GraphQLScalar(fieldName = "canonical_url", graphQLTypeName = "String", javaClass = String.class)
	public void setCanonical_url(String canonical_url);

	@GraphQLScalar(fieldName = "canonical_url", graphQLTypeName = "String", javaClass = String.class)
	public String getCanonical_url();

	@GraphQLNonScalar(fieldName = "categories", graphQLTypeName = "CategoryInterface", javaClass = CategoryInterface.class)
	public void setCategories(List<CategoryInterface> categories);

	@GraphQLNonScalar(fieldName = "categories", graphQLTypeName = "CategoryInterface", javaClass = CategoryInterface.class)
	public List<CategoryInterface> getCategories();

	@GraphQLScalar(fieldName = "category_gear", graphQLTypeName = "String", javaClass = String.class)
	public void setCategory_gear(String category_gear);

	@GraphQLScalar(fieldName = "category_gear", graphQLTypeName = "String", javaClass = String.class)
	public String getCategory_gear();

	@GraphQLScalar(fieldName = "climate", graphQLTypeName = "String", javaClass = String.class)
	public void setClimate(String climate);

	@GraphQLScalar(fieldName = "climate", graphQLTypeName = "String", javaClass = String.class)
	public String getClimate();

	@GraphQLScalar(fieldName = "collar", graphQLTypeName = "String", javaClass = String.class)
	public void setCollar(String collar);

	@GraphQLScalar(fieldName = "collar", graphQLTypeName = "String", javaClass = String.class)
	public String getCollar();

	@GraphQLScalar(fieldName = "color", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setColor(Integer color);

	@GraphQLScalar(fieldName = "color", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getColor();

	@GraphQLScalar(fieldName = "country_of_manufacture", graphQLTypeName = "String", javaClass = String.class)
	public void setCountry_of_manufacture(String country_of_manufacture);

	@GraphQLScalar(fieldName = "country_of_manufacture", graphQLTypeName = "String", javaClass = String.class)
	public String getCountry_of_manufacture();

	@GraphQLScalar(fieldName = "created_at", graphQLTypeName = "String", javaClass = String.class)
	public void setCreated_at(String created_at);

	@GraphQLScalar(fieldName = "created_at", graphQLTypeName = "String", javaClass = String.class)
	public String getCreated_at();

	@GraphQLNonScalar(fieldName = "crosssell_products", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	public void setCrosssell_products(List<ProductInterface> crosssell_products);

	@GraphQLNonScalar(fieldName = "crosssell_products", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	public List<ProductInterface> getCrosssell_products();

	@GraphQLNonScalar(fieldName = "description", graphQLTypeName = "ComplexTextValue", javaClass = ComplexTextValue.class)
	public void setDescription(ComplexTextValue description);

	@GraphQLNonScalar(fieldName = "description", graphQLTypeName = "ComplexTextValue", javaClass = ComplexTextValue.class)
	public ComplexTextValue getDescription();

	@GraphQLScalar(fieldName = "eco_collection", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setEco_collection(Integer eco_collection);

	@GraphQLScalar(fieldName = "eco_collection", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getEco_collection();

	@GraphQLScalar(fieldName = "erin_recommends", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setErin_recommends(Integer erin_recommends);

	@GraphQLScalar(fieldName = "erin_recommends", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getErin_recommends();

	@GraphQLScalar(fieldName = "features_bags", graphQLTypeName = "String", javaClass = String.class)
	public void setFeatures_bags(String features_bags);

	@GraphQLScalar(fieldName = "features_bags", graphQLTypeName = "String", javaClass = String.class)
	public String getFeatures_bags();

	@GraphQLScalar(fieldName = "format", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setFormat(Integer format);

	@GraphQLScalar(fieldName = "format", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getFormat();

	@GraphQLScalar(fieldName = "gender", graphQLTypeName = "String", javaClass = String.class)
	public void setGender(String gender);

	@GraphQLScalar(fieldName = "gender", graphQLTypeName = "String", javaClass = String.class)
	public String getGender();

	@GraphQLScalar(fieldName = "gift_message_available", graphQLTypeName = "String", javaClass = String.class)
	public void setGift_message_available(String gift_message_available);

	@GraphQLScalar(fieldName = "gift_message_available", graphQLTypeName = "String", javaClass = String.class)
	public String getGift_message_available();

	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setId(Integer id);

	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getId();

	@GraphQLNonScalar(fieldName = "image", graphQLTypeName = "ProductImage", javaClass = ProductImage.class)
	public void setImage(ProductImage image);

	@GraphQLNonScalar(fieldName = "image", graphQLTypeName = "ProductImage", javaClass = ProductImage.class)
	public ProductImage getImage();

	@GraphQLScalar(fieldName = "manufacturer", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setManufacturer(Integer manufacturer);

	@GraphQLScalar(fieldName = "manufacturer", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getManufacturer();

	@GraphQLScalar(fieldName = "material", graphQLTypeName = "String", javaClass = String.class)
	public void setMaterial(String material);

	@GraphQLScalar(fieldName = "material", graphQLTypeName = "String", javaClass = String.class)
	public String getMaterial();

	@GraphQLNonScalar(fieldName = "media_gallery", graphQLTypeName = "MediaGalleryInterface", javaClass = MediaGalleryInterface.class)
	public void setMedia_gallery(List<MediaGalleryInterface> media_gallery);

	@GraphQLNonScalar(fieldName = "media_gallery", graphQLTypeName = "MediaGalleryInterface", javaClass = MediaGalleryInterface.class)
	public List<MediaGalleryInterface> getMedia_gallery();

	@GraphQLNonScalar(fieldName = "media_gallery_entries", graphQLTypeName = "MediaGalleryEntry", javaClass = MediaGalleryEntry.class)
	public void setMedia_gallery_entries(List<MediaGalleryEntry> media_gallery_entries);

	@GraphQLNonScalar(fieldName = "media_gallery_entries", graphQLTypeName = "MediaGalleryEntry", javaClass = MediaGalleryEntry.class)
	public List<MediaGalleryEntry> getMedia_gallery_entries();

	@GraphQLScalar(fieldName = "meta_description", graphQLTypeName = "String", javaClass = String.class)
	public void setMeta_description(String meta_description);

	@GraphQLScalar(fieldName = "meta_description", graphQLTypeName = "String", javaClass = String.class)
	public String getMeta_description();

	@GraphQLScalar(fieldName = "meta_keyword", graphQLTypeName = "String", javaClass = String.class)
	public void setMeta_keyword(String meta_keyword);

	@GraphQLScalar(fieldName = "meta_keyword", graphQLTypeName = "String", javaClass = String.class)
	public String getMeta_keyword();

	@GraphQLScalar(fieldName = "meta_title", graphQLTypeName = "String", javaClass = String.class)
	public void setMeta_title(String meta_title);

	@GraphQLScalar(fieldName = "meta_title", graphQLTypeName = "String", javaClass = String.class)
	public String getMeta_title();

	@GraphQLScalar(fieldName = "name", graphQLTypeName = "String", javaClass = String.class)
	public void setName(String name);

	@GraphQLScalar(fieldName = "name", graphQLTypeName = "String", javaClass = String.class)
	public String getName();

	@GraphQLScalar(fieldName = "new", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setNew(Integer _new);

	@GraphQLScalar(fieldName = "new", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getNew();

	@GraphQLScalar(fieldName = "new_from_date", graphQLTypeName = "String", javaClass = String.class)
	public void setNew_from_date(String new_from_date);

	@GraphQLScalar(fieldName = "new_from_date", graphQLTypeName = "String", javaClass = String.class)
	public String getNew_from_date();

	@GraphQLScalar(fieldName = "new_to_date", graphQLTypeName = "String", javaClass = String.class)
	public void setNew_to_date(String new_to_date);

	@GraphQLScalar(fieldName = "new_to_date", graphQLTypeName = "String", javaClass = String.class)
	public String getNew_to_date();

	@GraphQLScalar(fieldName = "only_x_left_in_stock", graphQLTypeName = "Float", javaClass = Double.class)
	public void setOnly_x_left_in_stock(Double only_x_left_in_stock);

	@GraphQLScalar(fieldName = "only_x_left_in_stock", graphQLTypeName = "Float", javaClass = Double.class)
	public Double getOnly_x_left_in_stock();

	@GraphQLScalar(fieldName = "options_container", graphQLTypeName = "String", javaClass = String.class)
	public void setOptions_container(String options_container);

	@GraphQLScalar(fieldName = "options_container", graphQLTypeName = "String", javaClass = String.class)
	public String getOptions_container();

	@GraphQLScalar(fieldName = "pattern", graphQLTypeName = "String", javaClass = String.class)
	public void setPattern(String pattern);

	@GraphQLScalar(fieldName = "pattern", graphQLTypeName = "String", javaClass = String.class)
	public String getPattern();

	@GraphQLScalar(fieldName = "performance_fabric", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setPerformance_fabric(Integer performance_fabric);

	@GraphQLScalar(fieldName = "performance_fabric", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getPerformance_fabric();

	@GraphQLNonScalar(fieldName = "price", graphQLTypeName = "ProductPrices", javaClass = ProductPrices.class)
	public void setPrice(ProductPrices price);

	@GraphQLNonScalar(fieldName = "price", graphQLTypeName = "ProductPrices", javaClass = ProductPrices.class)
	public ProductPrices getPrice();

	@GraphQLNonScalar(fieldName = "price_range", graphQLTypeName = "PriceRange", javaClass = PriceRange.class)
	public void setPrice_range(PriceRange price_range);

	@GraphQLNonScalar(fieldName = "price_range", graphQLTypeName = "PriceRange", javaClass = PriceRange.class)
	public PriceRange getPrice_range();

	@GraphQLNonScalar(fieldName = "price_tiers", graphQLTypeName = "TierPrice", javaClass = TierPrice.class)
	public void setPrice_tiers(List<TierPrice> price_tiers);

	@GraphQLNonScalar(fieldName = "price_tiers", graphQLTypeName = "TierPrice", javaClass = TierPrice.class)
	public List<TierPrice> getPrice_tiers();

	@GraphQLNonScalar(fieldName = "product_links", graphQLTypeName = "ProductLinksInterface", javaClass = ProductLinksInterface.class)
	public void setProduct_links(List<ProductLinksInterface> product_links);

	@GraphQLNonScalar(fieldName = "product_links", graphQLTypeName = "ProductLinksInterface", javaClass = ProductLinksInterface.class)
	public List<ProductLinksInterface> getProduct_links();

	@GraphQLNonScalar(fieldName = "related_products", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	public void setRelated_products(List<ProductInterface> related_products);

	@GraphQLNonScalar(fieldName = "related_products", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	public List<ProductInterface> getRelated_products();

	@GraphQLScalar(fieldName = "sale", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setSale(Integer sale);

	@GraphQLScalar(fieldName = "sale", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getSale();

	@GraphQLNonScalar(fieldName = "short_description", graphQLTypeName = "ComplexTextValue", javaClass = ComplexTextValue.class)
	public void setShort_description(ComplexTextValue short_description);

	@GraphQLNonScalar(fieldName = "short_description", graphQLTypeName = "ComplexTextValue", javaClass = ComplexTextValue.class)
	public ComplexTextValue getShort_description();

	@GraphQLScalar(fieldName = "size", graphQLTypeName = "Int", javaClass = Integer.class)
	public void setSize(Integer size);

	@GraphQLScalar(fieldName = "size", graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getSize();

	@GraphQLScalar(fieldName = "sku", graphQLTypeName = "String", javaClass = String.class)
	public void setSku(String sku);

	@GraphQLScalar(fieldName = "sku", graphQLTypeName = "String", javaClass = String.class)
	public String getSku();

	@GraphQLScalar(fieldName = "sleeve", graphQLTypeName = "String", javaClass = String.class)
	public void setSleeve(String sleeve);

	@GraphQLScalar(fieldName = "sleeve", graphQLTypeName = "String", javaClass = String.class)
	public String getSleeve();

	@GraphQLNonScalar(fieldName = "small_image", graphQLTypeName = "ProductImage", javaClass = ProductImage.class)
	public void setSmall_image(ProductImage small_image);

	@GraphQLNonScalar(fieldName = "small_image", graphQLTypeName = "ProductImage", javaClass = ProductImage.class)
	public ProductImage getSmall_image();

	@GraphQLScalar(fieldName = "special_from_date", graphQLTypeName = "String", javaClass = String.class)
	public void setSpecial_from_date(String special_from_date);

	@GraphQLScalar(fieldName = "special_from_date", graphQLTypeName = "String", javaClass = String.class)
	public String getSpecial_from_date();

	@GraphQLScalar(fieldName = "special_price", graphQLTypeName = "Float", javaClass = Double.class)
	public void setSpecial_price(Double special_price);

	@GraphQLScalar(fieldName = "special_price", graphQLTypeName = "Float", javaClass = Double.class)
	public Double getSpecial_price();

	@GraphQLScalar(fieldName = "special_to_date", graphQLTypeName = "String", javaClass = String.class)
	public void setSpecial_to_date(String special_to_date);

	@GraphQLScalar(fieldName = "special_to_date", graphQLTypeName = "String", javaClass = String.class)
	public String getSpecial_to_date();

	@GraphQLScalar(fieldName = "stock_status", graphQLTypeName = "ProductStockStatus", javaClass = ProductStockStatus.class)
	public void setStock_status(ProductStockStatus stock_status);

	@GraphQLScalar(fieldName = "stock_status", graphQLTypeName = "ProductStockStatus", javaClass = ProductStockStatus.class)
	public ProductStockStatus getStock_status();

	@GraphQLScalar(fieldName = "strap_bags", graphQLTypeName = "String", javaClass = String.class)
	public void setStrap_bags(String strap_bags);

	@GraphQLScalar(fieldName = "strap_bags", graphQLTypeName = "String", javaClass = String.class)
	public String getStrap_bags();

	@GraphQLScalar(fieldName = "style_bags", graphQLTypeName = "String", javaClass = String.class)
	public void setStyle_bags(String style_bags);

	@GraphQLScalar(fieldName = "style_bags", graphQLTypeName = "String", javaClass = String.class)
	public String getStyle_bags();

	@GraphQLScalar(fieldName = "style_bottom", graphQLTypeName = "String", javaClass = String.class)
	public void setStyle_bottom(String style_bottom);

	@GraphQLScalar(fieldName = "style_bottom", graphQLTypeName = "String", javaClass = String.class)
	public String getStyle_bottom();

	@GraphQLScalar(fieldName = "style_general", graphQLTypeName = "String", javaClass = String.class)
	public void setStyle_general(String style_general);

	@GraphQLScalar(fieldName = "style_general", graphQLTypeName = "String", javaClass = String.class)
	public String getStyle_general();

	@GraphQLScalar(fieldName = "swatch_image", graphQLTypeName = "String", javaClass = String.class)
	public void setSwatch_image(String swatch_image);

	@GraphQLScalar(fieldName = "swatch_image", graphQLTypeName = "String", javaClass = String.class)
	public String getSwatch_image();

	@GraphQLNonScalar(fieldName = "thumbnail", graphQLTypeName = "ProductImage", javaClass = ProductImage.class)
	public void setThumbnail(ProductImage thumbnail);

	@GraphQLNonScalar(fieldName = "thumbnail", graphQLTypeName = "ProductImage", javaClass = ProductImage.class)
	public ProductImage getThumbnail();

	@GraphQLScalar(fieldName = "tier_price", graphQLTypeName = "Float", javaClass = Double.class)
	public void setTier_price(Double tier_price);

	@GraphQLScalar(fieldName = "tier_price", graphQLTypeName = "Float", javaClass = Double.class)
	public Double getTier_price();

	@GraphQLNonScalar(fieldName = "tier_prices", graphQLTypeName = "ProductTierPrices", javaClass = ProductTierPrices.class)
	public void setTier_prices(List<ProductTierPrices> tier_prices);

	@GraphQLNonScalar(fieldName = "tier_prices", graphQLTypeName = "ProductTierPrices", javaClass = ProductTierPrices.class)
	public List<ProductTierPrices> getTier_prices();

	@GraphQLScalar(fieldName = "type_id", graphQLTypeName = "String", javaClass = String.class)
	public void setType_id(String type_id);

	@GraphQLScalar(fieldName = "type_id", graphQLTypeName = "String", javaClass = String.class)
	public String getType_id();

	@GraphQLScalar(fieldName = "updated_at", graphQLTypeName = "String", javaClass = String.class)
	public void setUpdated_at(String updated_at);

	@GraphQLScalar(fieldName = "updated_at", graphQLTypeName = "String", javaClass = String.class)
	public String getUpdated_at();

	@GraphQLNonScalar(fieldName = "upsell_products", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	public void setUpsell_products(List<ProductInterface> upsell_products);

	@GraphQLNonScalar(fieldName = "upsell_products", graphQLTypeName = "ProductInterface", javaClass = ProductInterface.class)
	public List<ProductInterface> getUpsell_products();

	@GraphQLScalar(fieldName = "url_key", graphQLTypeName = "String", javaClass = String.class)
	public void setUrl_key(String url_key);

	@GraphQLScalar(fieldName = "url_key", graphQLTypeName = "String", javaClass = String.class)
	public String getUrl_key();

	@GraphQLScalar(fieldName = "url_path", graphQLTypeName = "String", javaClass = String.class)
	public void setUrl_path(String url_path);

	@GraphQLScalar(fieldName = "url_path", graphQLTypeName = "String", javaClass = String.class)
	public String getUrl_path();

	@GraphQLNonScalar(fieldName = "url_rewrites", graphQLTypeName = "UrlRewrite", javaClass = UrlRewrite.class)
	public void setUrl_rewrites(List<UrlRewrite> url_rewrites);

	@GraphQLNonScalar(fieldName = "url_rewrites", graphQLTypeName = "UrlRewrite", javaClass = UrlRewrite.class)
	public List<UrlRewrite> getUrl_rewrites();

	@GraphQLScalar(fieldName = "url_suffix", graphQLTypeName = "String", javaClass = String.class)
	public void setUrl_suffix(String url_suffix);

	@GraphQLScalar(fieldName = "url_suffix", graphQLTypeName = "String", javaClass = String.class)
	public String getUrl_suffix();

	@GraphQLNonScalar(fieldName = "websites", graphQLTypeName = "Website", javaClass = Website.class)
	public void setWebsites(List<Website> websites);

	@GraphQLNonScalar(fieldName = "websites", graphQLTypeName = "Website", javaClass = Website.class)
	public List<Website> getWebsites();
}