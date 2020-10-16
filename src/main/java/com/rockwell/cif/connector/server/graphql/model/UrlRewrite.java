/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.model;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("UrlRewrite")
public class UrlRewrite  {

	public UrlRewrite(){
		// No action
	}

	@GraphQLNonScalar(fieldName = "parameters", graphQLTypeName = "HttpQueryParameter", javaClass = HttpQueryParameter.class)
	List<HttpQueryParameter> parameters;


	@GraphQLScalar(fieldName = "url", graphQLTypeName = "String", javaClass = String.class)
	String url;



	public void setParameters(List<HttpQueryParameter> parameters) {
		this.parameters = parameters;
	}

	public List<HttpQueryParameter> getParameters() {
		return parameters;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

    public String toString() {
        return "UrlRewrite {"
				+ "parameters: " + parameters
				+ ", "
				+ "url: " + url
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Parameters("parameters"),
		Url("url");

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
		private List<HttpQueryParameter> parameters;
		private String url;


		public Builder withParameters(List<HttpQueryParameter> parameters) {
			this.parameters = parameters;
			return this;
		}
		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}

		public UrlRewrite build() {
			UrlRewrite _object = new UrlRewrite();
			_object.setParameters(parameters);
			_object.setUrl(url);
			return _object;
		}
	}
}
