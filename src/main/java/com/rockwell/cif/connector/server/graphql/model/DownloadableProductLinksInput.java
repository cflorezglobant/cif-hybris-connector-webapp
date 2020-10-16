/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType("DownloadableProductLinksInput")
public class DownloadableProductLinksInput  {

	public DownloadableProductLinksInput(){
		// No action
	}

	@GraphQLScalar(fieldName = "link_id", graphQLTypeName = "Int", javaClass = Integer.class)
	Integer link_id;



	public void setLink_id(Integer link_id) {
		this.link_id = link_id;
	}

	public Integer getLink_id() {
		return link_id;
	}

    public String toString() {
        return "DownloadableProductLinksInput {"
				+ "link_id: " + link_id
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Link_id("link_id");

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
		private Integer link_id;


		public Builder withLink_id(Integer link_id) {
			this.link_id = link_id;
			return this;
		}

		public DownloadableProductLinksInput build() {
			DownloadableProductLinksInput _object = new DownloadableProductLinksInput();
			_object.setLink_id(link_id);
			return _object;
		}
	}
}
