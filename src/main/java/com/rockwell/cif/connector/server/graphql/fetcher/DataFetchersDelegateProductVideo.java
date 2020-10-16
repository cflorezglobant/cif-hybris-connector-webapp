/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.fetcher;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.rockwell.cif.connector.server.graphql.model.ProductVideo;
import graphql.schema.DataFetchingEnvironment;

import com.rockwell.cif.connector.server.graphql.model.ProductMediaGalleryEntriesVideoContent;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface DataFetchersDelegateProductVideo {
	
	/**
	 * This method loads the data for ProductVideo.video_content. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the video_content attribute
	 *    of the <I>origin</I>, which is an instance of {ProductVideo}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public ProductMediaGalleryEntriesVideoContent video_content(DataFetchingEnvironment dataFetchingEnvironment, ProductVideo origin);

}
