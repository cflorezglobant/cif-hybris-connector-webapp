/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("ProductSortInput")
public class ProductSortInput  {

	public ProductSortInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "country_of_manufacture", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum country_of_manufacture;


	@GraphQLScalar(fieldName = "created_at", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum created_at;


	@GraphQLScalar(fieldName = "custom_layout", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum custom_layout;


	@GraphQLScalar(fieldName = "custom_layout_update", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum custom_layout_update;


	@GraphQLScalar(fieldName = "description", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum description;


	@GraphQLScalar(fieldName = "gift_message_available", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum gift_message_available;


	@GraphQLScalar(fieldName = "has_options", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum has_options;


	@GraphQLScalar(fieldName = "image", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum image;


	@GraphQLScalar(fieldName = "image_label", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum image_label;


	@GraphQLScalar(fieldName = "manufacturer", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum manufacturer;


	@GraphQLScalar(fieldName = "meta_description", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum meta_description;


	@GraphQLScalar(fieldName = "meta_keyword", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum meta_keyword;


	@GraphQLScalar(fieldName = "meta_title", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum meta_title;


	@GraphQLScalar(fieldName = "name", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum name;


	@GraphQLScalar(fieldName = "news_from_date", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum news_from_date;


	@GraphQLScalar(fieldName = "news_to_date", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum news_to_date;


	@GraphQLScalar(fieldName = "options_container", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum options_container;


	@GraphQLScalar(fieldName = "price", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum price;


	@GraphQLScalar(fieldName = "required_options", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum required_options;


	@GraphQLScalar(fieldName = "short_description", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum short_description;


	@GraphQLScalar(fieldName = "sku", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum sku;


	@GraphQLScalar(fieldName = "small_image", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum small_image;


	@GraphQLScalar(fieldName = "small_image_label", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum small_image_label;


	@GraphQLScalar(fieldName = "special_from_date", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum special_from_date;


	@GraphQLScalar(fieldName = "special_price", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum special_price;


	@GraphQLScalar(fieldName = "special_to_date", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum special_to_date;


	@GraphQLScalar(fieldName = "swatch_image", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum swatch_image;


	@GraphQLScalar(fieldName = "thumbnail", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum thumbnail;


	@GraphQLScalar(fieldName = "thumbnail_label", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum thumbnail_label;


	@GraphQLScalar(fieldName = "tier_price", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum tier_price;


	@GraphQLScalar(fieldName = "updated_at", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum updated_at;


	@GraphQLScalar(fieldName = "url_key", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum url_key;


	@GraphQLScalar(fieldName = "url_path", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum url_path;


	@GraphQLScalar(fieldName = "weight", graphQLTypeName = "SortEnum", javaClass = SortEnum.class)
	SortEnum weight;



	public void setCountry_of_manufacture(SortEnum country_of_manufacture) {
		this.country_of_manufacture = country_of_manufacture;
	}

	public SortEnum getCountry_of_manufacture() {
		return country_of_manufacture;
	}

	public void setCreated_at(SortEnum created_at) {
		this.created_at = created_at;
	}

	public SortEnum getCreated_at() {
		return created_at;
	}

	public void setCustom_layout(SortEnum custom_layout) {
		this.custom_layout = custom_layout;
	}

	public SortEnum getCustom_layout() {
		return custom_layout;
	}

	public void setCustom_layout_update(SortEnum custom_layout_update) {
		this.custom_layout_update = custom_layout_update;
	}

	public SortEnum getCustom_layout_update() {
		return custom_layout_update;
	}

	public void setDescription(SortEnum description) {
		this.description = description;
	}

	public SortEnum getDescription() {
		return description;
	}

	public void setGift_message_available(SortEnum gift_message_available) {
		this.gift_message_available = gift_message_available;
	}

	public SortEnum getGift_message_available() {
		return gift_message_available;
	}

	public void setHas_options(SortEnum has_options) {
		this.has_options = has_options;
	}

	public SortEnum getHas_options() {
		return has_options;
	}

	public void setImage(SortEnum image) {
		this.image = image;
	}

	public SortEnum getImage() {
		return image;
	}

	public void setImage_label(SortEnum image_label) {
		this.image_label = image_label;
	}

	public SortEnum getImage_label() {
		return image_label;
	}

	public void setManufacturer(SortEnum manufacturer) {
		this.manufacturer = manufacturer;
	}

	public SortEnum getManufacturer() {
		return manufacturer;
	}

	public void setMeta_description(SortEnum meta_description) {
		this.meta_description = meta_description;
	}

	public SortEnum getMeta_description() {
		return meta_description;
	}

	public void setMeta_keyword(SortEnum meta_keyword) {
		this.meta_keyword = meta_keyword;
	}

	public SortEnum getMeta_keyword() {
		return meta_keyword;
	}

	public void setMeta_title(SortEnum meta_title) {
		this.meta_title = meta_title;
	}

	public SortEnum getMeta_title() {
		return meta_title;
	}

	public void setName(SortEnum name) {
		this.name = name;
	}

	public SortEnum getName() {
		return name;
	}

	public void setNews_from_date(SortEnum news_from_date) {
		this.news_from_date = news_from_date;
	}

	public SortEnum getNews_from_date() {
		return news_from_date;
	}

	public void setNews_to_date(SortEnum news_to_date) {
		this.news_to_date = news_to_date;
	}

	public SortEnum getNews_to_date() {
		return news_to_date;
	}

	public void setOptions_container(SortEnum options_container) {
		this.options_container = options_container;
	}

	public SortEnum getOptions_container() {
		return options_container;
	}

	public void setPrice(SortEnum price) {
		this.price = price;
	}

	public SortEnum getPrice() {
		return price;
	}

	public void setRequired_options(SortEnum required_options) {
		this.required_options = required_options;
	}

	public SortEnum getRequired_options() {
		return required_options;
	}

	public void setShort_description(SortEnum short_description) {
		this.short_description = short_description;
	}

	public SortEnum getShort_description() {
		return short_description;
	}

	public void setSku(SortEnum sku) {
		this.sku = sku;
	}

	public SortEnum getSku() {
		return sku;
	}

	public void setSmall_image(SortEnum small_image) {
		this.small_image = small_image;
	}

	public SortEnum getSmall_image() {
		return small_image;
	}

	public void setSmall_image_label(SortEnum small_image_label) {
		this.small_image_label = small_image_label;
	}

	public SortEnum getSmall_image_label() {
		return small_image_label;
	}

	public void setSpecial_from_date(SortEnum special_from_date) {
		this.special_from_date = special_from_date;
	}

	public SortEnum getSpecial_from_date() {
		return special_from_date;
	}

	public void setSpecial_price(SortEnum special_price) {
		this.special_price = special_price;
	}

	public SortEnum getSpecial_price() {
		return special_price;
	}

	public void setSpecial_to_date(SortEnum special_to_date) {
		this.special_to_date = special_to_date;
	}

	public SortEnum getSpecial_to_date() {
		return special_to_date;
	}

	public void setSwatch_image(SortEnum swatch_image) {
		this.swatch_image = swatch_image;
	}

	public SortEnum getSwatch_image() {
		return swatch_image;
	}

	public void setThumbnail(SortEnum thumbnail) {
		this.thumbnail = thumbnail;
	}

	public SortEnum getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail_label(SortEnum thumbnail_label) {
		this.thumbnail_label = thumbnail_label;
	}

	public SortEnum getThumbnail_label() {
		return thumbnail_label;
	}

	public void setTier_price(SortEnum tier_price) {
		this.tier_price = tier_price;
	}

	public SortEnum getTier_price() {
		return tier_price;
	}

	public void setUpdated_at(SortEnum updated_at) {
		this.updated_at = updated_at;
	}

	public SortEnum getUpdated_at() {
		return updated_at;
	}

	public void setUrl_key(SortEnum url_key) {
		this.url_key = url_key;
	}

	public SortEnum getUrl_key() {
		return url_key;
	}

	public void setUrl_path(SortEnum url_path) {
		this.url_path = url_path;
	}

	public SortEnum getUrl_path() {
		return url_path;
	}

	public void setWeight(SortEnum weight) {
		this.weight = weight;
	}

	public SortEnum getWeight() {
		return weight;
	}

    public String toString() {
        return "ProductSortInput {"
				+ "country_of_manufacture: " + country_of_manufacture
				+ ", "
				+ "created_at: " + created_at
				+ ", "
				+ "custom_layout: " + custom_layout
				+ ", "
				+ "custom_layout_update: " + custom_layout_update
				+ ", "
				+ "description: " + description
				+ ", "
				+ "gift_message_available: " + gift_message_available
				+ ", "
				+ "has_options: " + has_options
				+ ", "
				+ "image: " + image
				+ ", "
				+ "image_label: " + image_label
				+ ", "
				+ "manufacturer: " + manufacturer
				+ ", "
				+ "meta_description: " + meta_description
				+ ", "
				+ "meta_keyword: " + meta_keyword
				+ ", "
				+ "meta_title: " + meta_title
				+ ", "
				+ "name: " + name
				+ ", "
				+ "news_from_date: " + news_from_date
				+ ", "
				+ "news_to_date: " + news_to_date
				+ ", "
				+ "options_container: " + options_container
				+ ", "
				+ "price: " + price
				+ ", "
				+ "required_options: " + required_options
				+ ", "
				+ "short_description: " + short_description
				+ ", "
				+ "sku: " + sku
				+ ", "
				+ "small_image: " + small_image
				+ ", "
				+ "small_image_label: " + small_image_label
				+ ", "
				+ "special_from_date: " + special_from_date
				+ ", "
				+ "special_price: " + special_price
				+ ", "
				+ "special_to_date: " + special_to_date
				+ ", "
				+ "swatch_image: " + swatch_image
				+ ", "
				+ "thumbnail: " + thumbnail
				+ ", "
				+ "thumbnail_label: " + thumbnail_label
				+ ", "
				+ "tier_price: " + tier_price
				+ ", "
				+ "updated_at: " + updated_at
				+ ", "
				+ "url_key: " + url_key
				+ ", "
				+ "url_path: " + url_path
				+ ", "
				+ "weight: " + weight
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Country_of_manufacture("country_of_manufacture"),
		Created_at("created_at"),
		Custom_layout("custom_layout"),
		Custom_layout_update("custom_layout_update"),
		Description("description"),
		Gift_message_available("gift_message_available"),
		Has_options("has_options"),
		Image("image"),
		Image_label("image_label"),
		Manufacturer("manufacturer"),
		Meta_description("meta_description"),
		Meta_keyword("meta_keyword"),
		Meta_title("meta_title"),
		Name("name"),
		News_from_date("news_from_date"),
		News_to_date("news_to_date"),
		Options_container("options_container"),
		Price("price"),
		Required_options("required_options"),
		Short_description("short_description"),
		Sku("sku"),
		Small_image("small_image"),
		Small_image_label("small_image_label"),
		Special_from_date("special_from_date"),
		Special_price("special_price"),
		Special_to_date("special_to_date"),
		Swatch_image("swatch_image"),
		Thumbnail("thumbnail"),
		Thumbnail_label("thumbnail_label"),
		Tier_price("tier_price"),
		Updated_at("updated_at"),
		Url_key("url_key"),
		Url_path("url_path"),
		Weight("weight");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
			return new Builder();
		}



	/**
	 * Builder
	 */
	public static class Builder {
		private SortEnum country_of_manufacture;
		private SortEnum created_at;
		private SortEnum custom_layout;
		private SortEnum custom_layout_update;
		private SortEnum description;
		private SortEnum gift_message_available;
		private SortEnum has_options;
		private SortEnum image;
		private SortEnum image_label;
		private SortEnum manufacturer;
		private SortEnum meta_description;
		private SortEnum meta_keyword;
		private SortEnum meta_title;
		private SortEnum name;
		private SortEnum news_from_date;
		private SortEnum news_to_date;
		private SortEnum options_container;
		private SortEnum price;
		private SortEnum required_options;
		private SortEnum short_description;
		private SortEnum sku;
		private SortEnum small_image;
		private SortEnum small_image_label;
		private SortEnum special_from_date;
		private SortEnum special_price;
		private SortEnum special_to_date;
		private SortEnum swatch_image;
		private SortEnum thumbnail;
		private SortEnum thumbnail_label;
		private SortEnum tier_price;
		private SortEnum updated_at;
		private SortEnum url_key;
		private SortEnum url_path;
		private SortEnum weight;


		public Builder withCountry_of_manufacture(SortEnum country_of_manufacture) {
			this.country_of_manufacture = country_of_manufacture;
			return this;
		}
		public Builder withCreated_at(SortEnum created_at) {
			this.created_at = created_at;
			return this;
		}
		public Builder withCustom_layout(SortEnum custom_layout) {
			this.custom_layout = custom_layout;
			return this;
		}
		public Builder withCustom_layout_update(SortEnum custom_layout_update) {
			this.custom_layout_update = custom_layout_update;
			return this;
		}
		public Builder withDescription(SortEnum description) {
			this.description = description;
			return this;
		}
		public Builder withGift_message_available(SortEnum gift_message_available) {
			this.gift_message_available = gift_message_available;
			return this;
		}
		public Builder withHas_options(SortEnum has_options) {
			this.has_options = has_options;
			return this;
		}
		public Builder withImage(SortEnum image) {
			this.image = image;
			return this;
		}
		public Builder withImage_label(SortEnum image_label) {
			this.image_label = image_label;
			return this;
		}
		public Builder withManufacturer(SortEnum manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}
		public Builder withMeta_description(SortEnum meta_description) {
			this.meta_description = meta_description;
			return this;
		}
		public Builder withMeta_keyword(SortEnum meta_keyword) {
			this.meta_keyword = meta_keyword;
			return this;
		}
		public Builder withMeta_title(SortEnum meta_title) {
			this.meta_title = meta_title;
			return this;
		}
		public Builder withName(SortEnum name) {
			this.name = name;
			return this;
		}
		public Builder withNews_from_date(SortEnum news_from_date) {
			this.news_from_date = news_from_date;
			return this;
		}
		public Builder withNews_to_date(SortEnum news_to_date) {
			this.news_to_date = news_to_date;
			return this;
		}
		public Builder withOptions_container(SortEnum options_container) {
			this.options_container = options_container;
			return this;
		}
		public Builder withPrice(SortEnum price) {
			this.price = price;
			return this;
		}
		public Builder withRequired_options(SortEnum required_options) {
			this.required_options = required_options;
			return this;
		}
		public Builder withShort_description(SortEnum short_description) {
			this.short_description = short_description;
			return this;
		}
		public Builder withSku(SortEnum sku) {
			this.sku = sku;
			return this;
		}
		public Builder withSmall_image(SortEnum small_image) {
			this.small_image = small_image;
			return this;
		}
		public Builder withSmall_image_label(SortEnum small_image_label) {
			this.small_image_label = small_image_label;
			return this;
		}
		public Builder withSpecial_from_date(SortEnum special_from_date) {
			this.special_from_date = special_from_date;
			return this;
		}
		public Builder withSpecial_price(SortEnum special_price) {
			this.special_price = special_price;
			return this;
		}
		public Builder withSpecial_to_date(SortEnum special_to_date) {
			this.special_to_date = special_to_date;
			return this;
		}
		public Builder withSwatch_image(SortEnum swatch_image) {
			this.swatch_image = swatch_image;
			return this;
		}
		public Builder withThumbnail(SortEnum thumbnail) {
			this.thumbnail = thumbnail;
			return this;
		}
		public Builder withThumbnail_label(SortEnum thumbnail_label) {
			this.thumbnail_label = thumbnail_label;
			return this;
		}
		public Builder withTier_price(SortEnum tier_price) {
			this.tier_price = tier_price;
			return this;
		}
		public Builder withUpdated_at(SortEnum updated_at) {
			this.updated_at = updated_at;
			return this;
		}
		public Builder withUrl_key(SortEnum url_key) {
			this.url_key = url_key;
			return this;
		}
		public Builder withUrl_path(SortEnum url_path) {
			this.url_path = url_path;
			return this;
		}
		public Builder withWeight(SortEnum weight) {
			this.weight = weight;
			return this;
		}

		public ProductSortInput build() {
			ProductSortInput _object = new ProductSortInput();
			_object.setCountry_of_manufacture(country_of_manufacture);
			_object.setCreated_at(created_at);
			_object.setCustom_layout(custom_layout);
			_object.setCustom_layout_update(custom_layout_update);
			_object.setDescription(description);
			_object.setGift_message_available(gift_message_available);
			_object.setHas_options(has_options);
			_object.setImage(image);
			_object.setImage_label(image_label);
			_object.setManufacturer(manufacturer);
			_object.setMeta_description(meta_description);
			_object.setMeta_keyword(meta_keyword);
			_object.setMeta_title(meta_title);
			_object.setName(name);
			_object.setNews_from_date(news_from_date);
			_object.setNews_to_date(news_to_date);
			_object.setOptions_container(options_container);
			_object.setPrice(price);
			_object.setRequired_options(required_options);
			_object.setShort_description(short_description);
			_object.setSku(sku);
			_object.setSmall_image(small_image);
			_object.setSmall_image_label(small_image_label);
			_object.setSpecial_from_date(special_from_date);
			_object.setSpecial_price(special_price);
			_object.setSpecial_to_date(special_to_date);
			_object.setSwatch_image(swatch_image);
			_object.setThumbnail(thumbnail);
			_object.setThumbnail_label(thumbnail_label);
			_object.setTier_price(tier_price);
			_object.setUpdated_at(updated_at);
			_object.setUrl_key(url_key);
			_object.setUrl_path(url_path);
			_object.setWeight(weight);
			return _object;
		}
	}
}
