/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.fetcher;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import com.rockwell.cif.connector.server.graphql.model.Breadcrumb;
import com.rockwell.cif.connector.server.graphql.model.CategoryInterface;
import com.rockwell.cif.connector.server.graphql.model.CategoryProducts;
import com.rockwell.cif.connector.server.graphql.model.CmsBlock;
import graphql.schema.DataFetchingEnvironment;

import java.lang.Integer;
import java.lang.String;

import com.rockwell.cif.connector.server.graphql.model.ProductAttributeSortInput;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface DataFetchersDelegateCategoryInterface {
	
	/**
	 * This method loads the data for CategoryInterface.available_sort_by. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the available_sort_by attribute
	 *    of the <I>origin</I>, which is an instance of {CategoryInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public List<String> available_sort_by(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin);

	/**
	 * This method loads the data for CategoryInterface.breadcrumbs. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the breadcrumbs attribute
	 *    of the <I>origin</I>, which is an instance of {CategoryInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public List<Breadcrumb> breadcrumbs(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin);

	/**
	 * This method loads the data for CategoryInterface.cms_block. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the cms_block attribute
	 *    of the <I>origin</I>, which is an instance of {CategoryInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public CmsBlock cms_block(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin);

	/**
	 * This method loads the data for CategoryInterface.products. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the products attribute
	 *    of the <I>origin</I>, which is an instance of {CategoryInterface}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @param pageSize 
	 *     The input parameter sent in the query by the GraphQL consumer, as defined in the GraphQL schema.
	 * @param currentPage 
	 *     The input parameter sent in the query by the GraphQL consumer, as defined in the GraphQL schema.
	 * @param sort 
	 *     The input parameter sent in the query by the GraphQL consumer, as defined in the GraphQL schema.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public CategoryProducts products(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin, Integer  pageSize, Integer  currentPage, ProductAttributeSortInput  sort);

}
