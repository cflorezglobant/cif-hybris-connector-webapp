/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("ProductVideo")
public class ProductVideo implements MediaGalleryInterface {

	public ProductVideo(){
		// No action
	}

	@GraphQLScalar(fieldName = "label", graphQLTypeName = "String", javaClass = String.class)
	String label;


	@GraphQLScalar(fieldName = "url", graphQLTypeName = "String", javaClass = String.class)
	String url;


	@GraphQLScalar(fieldName = "disabled", graphQLTypeName = "Boolean", javaClass = Boolean.class)
	Boolean disabled;


	@GraphQLScalar(fieldName = "position", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer position;


	@GraphQLNonScalar(fieldName = "video_content", graphQLTypeName = "ProductMediaGalleryEntriesVideoContent", javaClass = ProductMediaGalleryEntriesVideoContent.class)
	ProductMediaGalleryEntriesVideoContent video_content;



	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getPosition() {
		return position;
	}

	public void setVideo_content(ProductMediaGalleryEntriesVideoContent video_content) {
		this.video_content = video_content;
	}

	public ProductMediaGalleryEntriesVideoContent getVideo_content() {
		return video_content;
	}

    public String toString() {
        return "ProductVideo {"
				+ "label: " + label
				+ ", "
				+ "url: " + url
				+ ", "
				+ "disabled: " + disabled
				+ ", "
				+ "position: " + position
				+ ", "
				+ "video_content: " + video_content
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Label("label"),
		Url("url"),
		Disabled("disabled"),
		Position("position"),
		Video_content("video_content");

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
		private String label;
		private String url;
		private Boolean disabled;
		private Integer position;
		private ProductMediaGalleryEntriesVideoContent video_content;


		public Builder withLabel(String label) {
			this.label = label;
			return this;
		}
		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}
		public Builder withDisabled(Boolean disabled) {
			this.disabled = disabled;
			return this;
		}
		public Builder withPosition(Integer position) {
			this.position = position;
			return this;
		}
		public Builder withVideo_content(ProductMediaGalleryEntriesVideoContent video_content) {
			this.video_content = video_content;
			return this;
		}

		public ProductVideo build() {
			ProductVideo _object = new ProductVideo();
			_object.setLabel(label);
			_object.setUrl(url);
			_object.setDisabled(disabled);
			_object.setPosition(position);
			_object.setVideo_content(video_content);
			return _object;
		}
	}
}
