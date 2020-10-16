/** Generated by the default template from graphql-java-generator */
package com.rockwell.cif.connector.server.graphql.fetcher;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import com.rockwell.cif.connector.server.graphql.model.Cart;
import org.dataloader.DataLoader;

import graphql.schema.DataFetchingEnvironment;

import com.rockwell.cif.connector.server.graphql.model.ApplyCouponToCartOutput;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface DataFetchersDelegateApplyCouponToCartOutput {
	
	/**
	 * This method loads the data for ApplyCouponToCartOutput.cart. 
	 * <BR/>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the cart attribute
	 *    of the <I>origin</I>, which is an instance of {ApplyCouponToCartOutput}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public Cart cart(DataFetchingEnvironment dataFetchingEnvironment, ApplyCouponToCartOutput origin);

	/**
	 * This method loads the data for ApplyCouponToCartOutput.cart. 
	 * <BR/>
	 * For optimization, this method returns a CompletableFuture. This allows to use 
	 * <A HREF="https://github.com/graphql-java/java-dataloader">graphql-java java-dataloader</A> to highly optimize the
	 * number of requests to the server.<BR/>
	 * The principle is this one: The data loader collects all the data to load, avoid to load several times the same data, 
	 * and allows parallel execution of the queries, if multiple queries are to be run.<BR/>
	 * You can implements this method like this:
	 * <PRE>
	 * @Override
	 * public CompletableFuture<List<Character>> friends(DataFetchingEnvironment environment, DataLoader<UUID, Cart> dataLoader, Human origin) {
	 *     List<UUID> friendIds = origin.getFriendIds();
	 *     DataLoader<UUID, CharacterImpl> dataLoader = environment.getDataLoader("Character");
	 *     return dataLoader.loadMany(friendIds);
	 * }
	 * </PRE>
	 * <BR/>
	 * 
	 * @param dataFetchingEnvironment 
	 *     The GraphQL {@link DataFetchingEnvironment}. It gives you access to the full GraphQL context for this DataFetcher
	 * @param dataLoader
	 *            The {@link DataLoader} allows to load several data in one query. It allows to solve the (n+1) queries
	 *            issues, and greatly optimizes the response time.<BR/>
	 *            You'll find more informations here: <A HREF=
	 *            "https://github.com/graphql-java/java-dataloader">https://github.com/graphql-java/java-dataloader</A>
	 * @param origin 
	 *    The object from which the field is fetch. In other word: the aim of this data fetcher is to fetch the cart attribute
	 *    of the <I>origin</I>, which is an instance of {ApplyCouponToCartOutput}. It depends on your data modle, but it typically contains 
	 *    the id to use in the query.
	 * @throws NoSuchElementException 
	 *     This method may return a {@link NoSuchElementException} exception. In this case, the exception is trapped 
	 *     by the calling method, and the return is consider as null. This allows to use the {@link Optional#get()} method directly, without caring of 
	 *     whether or not there is a value. The generated code will take care of the {@link NoSuchElementException} exception. 
	 */
	public CompletableFuture<Cart> cart(DataFetchingEnvironment dataFetchingEnvironment, DataLoader<UUID, Cart> dataLoader, ApplyCouponToCartOutput origin);

}
