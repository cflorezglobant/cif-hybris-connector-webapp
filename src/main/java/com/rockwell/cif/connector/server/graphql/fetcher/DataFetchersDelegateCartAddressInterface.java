/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.fetcher;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.rockwell.cif.connector.server.graphql.model.CartAddressCountry;
import com.rockwell.cif.connector.server.graphql.model.CartAddressInterface;
import com.rockwell.cif.connector.server.graphql.model.CartAddressRegion;
import graphql.schema.DataFetchingEnvironment;

import java.lang.String;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface DataFetchersDelegateCartAddressInterface {
	
	/**
	 * This method loads the data for CartAddressInterface.country. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the country attribute
	 *    of the <I>origin</I>, which is an instance of {CartAddressInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public CartAddressCountry country(DataFetchingEnvironment dataFetchingEnvironment, CartAddressInterface origin);

	/**
	 * This method loads the data for CartAddressInterface.region. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the region attribute
	 *    of the <I>origin</I>, which is an instance of {CartAddressInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public CartAddressRegion region(DataFetchingEnvironment dataFetchingEnvironment, CartAddressInterface origin);

	/**
	 * This method loads the data for CartAddressInterface.street. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the street attribute
	 *    of the <I>origin</I>, which is an instance of {CartAddressInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public List<String> street(DataFetchingEnvironment dataFetchingEnvironment, CartAddressInterface origin);

}
