/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("ProductMediaGalleryEntriesVideoContent")
public class ProductMediaGalleryEntriesVideoContent  {

	public ProductMediaGalleryEntriesVideoContent(){
		// No action
	}

	@GraphQLScalar(fieldName = "media_type", graphQLTypeName = "String", javaClass = String.class)
	String media_type;


	@GraphQLScalar(fieldName = "video_description", graphQLTypeName = "String", javaClass = String.class)
	String video_description;


	@GraphQLScalar(fieldName = "video_metadata", graphQLTypeName = "String", javaClass = String.class)
	String video_metadata;


	@GraphQLScalar(fieldName = "video_provider", graphQLTypeName = "String", javaClass = String.class)
	String video_provider;


	@GraphQLScalar(fieldName = "video_title", graphQLTypeName = "String", javaClass = String.class)
	String video_title;


	@GraphQLScalar(fieldName = "video_url", graphQLTypeName = "String", javaClass = String.class)
	String video_url;



	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setVideo_description(String video_description) {
		this.video_description = video_description;
	}

	public String getVideo_description() {
		return video_description;
	}

	public void setVideo_metadata(String video_metadata) {
		this.video_metadata = video_metadata;
	}

	public String getVideo_metadata() {
		return video_metadata;
	}

	public void setVideo_provider(String video_provider) {
		this.video_provider = video_provider;
	}

	public String getVideo_provider() {
		return video_provider;
	}

	public void setVideo_title(String video_title) {
		this.video_title = video_title;
	}

	public String getVideo_title() {
		return video_title;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getVideo_url() {
		return video_url;
	}

    public String toString() {
        return "ProductMediaGalleryEntriesVideoContent {"
				+ "media_type: " + media_type
				+ ", "
				+ "video_description: " + video_description
				+ ", "
				+ "video_metadata: " + video_metadata
				+ ", "
				+ "video_provider: " + video_provider
				+ ", "
				+ "video_title: " + video_title
				+ ", "
				+ "video_url: " + video_url
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Media_type("media_type"),
		Video_description("video_description"),
		Video_metadata("video_metadata"),
		Video_provider("video_provider"),
		Video_title("video_title"),
		Video_url("video_url");

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
		private String media_type;
		private String video_description;
		private String video_metadata;
		private String video_provider;
		private String video_title;
		private String video_url;


		public Builder withMedia_type(String media_type) {
			this.media_type = media_type;
			return this;
		}
		public Builder withVideo_description(String video_description) {
			this.video_description = video_description;
			return this;
		}
		public Builder withVideo_metadata(String video_metadata) {
			this.video_metadata = video_metadata;
			return this;
		}
		public Builder withVideo_provider(String video_provider) {
			this.video_provider = video_provider;
			return this;
		}
		public Builder withVideo_title(String video_title) {
			this.video_title = video_title;
			return this;
		}
		public Builder withVideo_url(String video_url) {
			this.video_url = video_url;
			return this;
		}

		public ProductMediaGalleryEntriesVideoContent build() {
			ProductMediaGalleryEntriesVideoContent _object = new ProductMediaGalleryEntriesVideoContent();
			_object.setMedia_type(media_type);
			_object.setVideo_description(video_description);
			_object.setVideo_metadata(video_metadata);
			_object.setVideo_provider(video_provider);
			_object.setVideo_title(video_title);
			_object.setVideo_url(video_url);
			return _object;
		}
	}
}