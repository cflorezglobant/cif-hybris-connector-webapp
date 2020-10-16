/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.fetcher;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.rockwell.cif.connector.server.graphql.model.CartItemPrices;
import com.rockwell.cif.connector.server.graphql.model.ConfigurableCartItem;
import com.rockwell.cif.connector.server.graphql.model.ProductInterface;
import graphql.schema.DataFetchingEnvironment;

import com.rockwell.cif.connector.server.graphql.model.SelectedConfigurableOption;
import com.rockwell.cif.connector.server.graphql.model.SelectedCustomizableOption;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface DataFetchersDelegateConfigurableCartItem {
	
	/**
	 * This method loads the data for ConfigurableCartItem.configurable_options. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the configurable_options attribute
	 *    of the <I>origin</I>, which is an instance of {ConfigurableCartItem}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public List<SelectedConfigurableOption> configurable_options(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin);

	/**
	 * This method loads the data for ConfigurableCartItem.customizable_options. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the customizable_options attribute
	 *    of the <I>origin</I>, which is an instance of {ConfigurableCartItem}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public List<SelectedCustomizableOption> customizable_options(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin);

	/**
	 * This method loads the data for ConfigurableCartItem.prices. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the prices attribute
	 *    of the <I>origin</I>, which is an instance of {ConfigurableCartItem}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public CartItemPrices prices(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin);

	/**
	 * This method loads the data for ConfigurableCartItem.product. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the product attribute
	 *    of the <I>origin</I>, which is an instance of {ConfigurableCartItem}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public ProductInterface product(DataFetchingEnvironment dataFetchingEnvironment, ConfigurableCartItem origin);

}
