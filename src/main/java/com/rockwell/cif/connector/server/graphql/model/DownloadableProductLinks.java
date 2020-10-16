/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("DownloadableProductLinks")
public class DownloadableProductLinks  {

	public DownloadableProductLinks(){
		// No action
	}

	@GraphQLScalar(fieldName = "id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer id;


	@GraphQLScalar(fieldName = "is_shareable", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean is_shareable;


	@GraphQLScalar(fieldName = "link_type", graphQLTypeName = "DownloadableFileTypeEnum", javaClass = DownloadableFileTypeEnum.class)
	DownloadableFileTypeEnum link_type;


	@GraphQLScalar(fieldName = "number_of_downloads", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer number_of_downloads;


	@GraphQLScalar(fieldName = "price", graphQLTypeName = "Float", javaClass = Double.class)
	Double price;


	@GraphQLScalar(fieldName = "sample_file", graphQLTypeName = "String", javaClass = String.class)
	String sample_file;


	@GraphQLScalar(fieldName = "sample_type", graphQLTypeName = "DownloadableFileTypeEnum", javaClass = DownloadableFileTypeEnum.class)
	DownloadableFileTypeEnum sample_type;


	@GraphQLScalar(fieldName = "sample_url", graphQLTypeName = "String", javaClass = String.class)
	String sample_url;


	@GraphQLScalar(fieldName = "sort_order", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer sort_order;


	@GraphQLScalar(fieldName = "title", graphQLTypeName = "String", javaClass = String.class)
	String title;



	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setIs_shareable(Boolean is_shareable) {
		this.is_shareable = is_shareable;
	}

	public Boolean getIs_shareable() {
		return is_shareable;
	}

	public void setLink_type(DownloadableFileTypeEnum link_type) {
		this.link_type = link_type;
	}

	public DownloadableFileTypeEnum getLink_type() {
		return link_type;
	}

	public void setNumber_of_downloads(Integer number_of_downloads) {
		this.number_of_downloads = number_of_downloads;
	}

	public Integer getNumber_of_downloads() {
		return number_of_downloads;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPrice() {
		return price;
	}

	public void setSample_file(String sample_file) {
		this.sample_file = sample_file;
	}

	public String getSample_file() {
		return sample_file;
	}

	public void setSample_type(DownloadableFileTypeEnum sample_type) {
		this.sample_type = sample_type;
	}

	public DownloadableFileTypeEnum getSample_type() {
		return sample_type;
	}

	public void setSample_url(String sample_url) {
		this.sample_url = sample_url;
	}

	public String getSample_url() {
		return sample_url;
	}

	public void setSort_order(Integer sort_order) {
		this.sort_order = sort_order;
	}

	public Integer getSort_order() {
		return sort_order;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

    public String toString() {
        return "DownloadableProductLinks {"
				+ "id: " + id
				+ ", "
				+ "is_shareable: " + is_shareable
				+ ", "
				+ "link_type: " + link_type
				+ ", "
				+ "number_of_downloads: " + number_of_downloads
				+ ", "
				+ "price: " + price
				+ ", "
				+ "sample_file: " + sample_file
				+ ", "
				+ "sample_type: " + sample_type
				+ ", "
				+ "sample_url: " + sample_url
				+ ", "
				+ "sort_order: " + sort_order
				+ ", "
				+ "title: " + title
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Id("id"),
		Is_shareable("is_shareable"),
		Link_type("link_type"),
		Number_of_downloads("number_of_downloads"),
		Price("price"),
		Sample_file("sample_file"),
		Sample_type("sample_type"),
		Sample_url("sample_url"),
		Sort_order("sort_order"),
		Title("title");

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
		private Integer id;
		private Boolean is_shareable;
		private DownloadableFileTypeEnum link_type;
		private Integer number_of_downloads;
		private Double price;
		private String sample_file;
		private DownloadableFileTypeEnum sample_type;
		private String sample_url;
		private Integer sort_order;
		private String title;


		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}
		public Builder withIs_shareable(Boolean is_shareable) {
			this.is_shareable = is_shareable;
			return this;
		}
		public Builder withLink_type(DownloadableFileTypeEnum link_type) {
			this.link_type = link_type;
			return this;
		}
		public Builder withNumber_of_downloads(Integer number_of_downloads) {
			this.number_of_downloads = number_of_downloads;
			return this;
		}
		public Builder withPrice(Double price) {
			this.price = price;
			return this;
		}
		public Builder withSample_file(String sample_file) {
			this.sample_file = sample_file;
			return this;
		}
		public Builder withSample_type(DownloadableFileTypeEnum sample_type) {
			this.sample_type = sample_type;
			return this;
		}
		public Builder withSample_url(String sample_url) {
			this.sample_url = sample_url;
			return this;
		}
		public Builder withSort_order(Integer sort_order) {
			this.sort_order = sort_order;
			return this;
		}
		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public DownloadableProductLinks build() {
			DownloadableProductLinks _object = new DownloadableProductLinks();
			_object.setId(id);
			_object.setIs_shareable(is_shareable);
			_object.setLink_type(link_type);
			_object.setNumber_of_downloads(number_of_downloads);
			_object.setPrice(price);
			_object.setSample_file(sample_file);
			_object.setSample_type(sample_type);
			_object.setSample_url(sample_url);
			_object.setSort_order(sort_order);
			_object.setTitle(title);
			return _object;
		}
	}
}
