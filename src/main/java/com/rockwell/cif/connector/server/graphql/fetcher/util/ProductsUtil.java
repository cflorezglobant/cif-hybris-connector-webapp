package com.rockwell.cif.connector.server.graphql.fetcher.util;

import com.rockwell.cif.connector.hybris.api.client.HybrisRestAPIClient;
import com.rockwell.cif.connector.hybris.model.Product;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductsUtil {

    @Resource
    private HybrisRestAPIClient hybrisRestAPIClient;

    @Value("${hybris.default.category.id}")
    private String hybrisDefaultCategory;

    public Products products(String search, ProductAttributeFilterInput filter,
                             Integer pageSize, Integer currentPage, ProductAttributeSortInput sort) {
        Products result = new Products();
        result.setItems(new ArrayList<>());

        if (filter != null && filter.getSku() != null && StringUtils.isNotEmpty(filter.getSku().getEq())) {

            Product product = hybrisRestAPIClient.getProduct(filter.getSku().getEq());
            if (product != null)
                result.getItems().add(product.adaptToConfigurableProduct());

        } else if (filter != null && filter.getUrl_key() != null && StringUtils.isNotEmpty(filter.getUrl_key().getEq())) {

            Product product = hybrisRestAPIClient.getProduct(filter.getUrl_key().getEq());
            if (product != null)
                result.getItems().add(product.adaptToConfigurableProduct());

        } else if (filter != null && filter.getSku() != null && filter.getSku().getIn() != null && !filter.getSku().getIn().isEmpty()) {

            for (String productId : filter.getSku().getIn()) {
                Product product = hybrisRestAPIClient.getProduct(productId);
                if (product != null) {
                    result.getItems().add(product.adaptToConfigurableProduct());
                }

            }

        } else if (filter != null && filter.getPrice() != null) {
            //search for assets
            ProductSearchPage productSearchPage = hybrisRestAPIClient.getProductsByCategory(hybrisDefaultCategory, --currentPage, pageSize);
            if (productSearchPage != null) {
                result.setTotal_count(productSearchPage.getPagination().getTotalResults().intValue());
                for (Product product : productSearchPage.getProducts()) {

                    SimpleProduct productInterface = product.adaptToSimpleProduct();

                    result.getItems().add(productInterface);

                }
            }

        } else if (filter != null && filter.getCategory_id() != null && StringUtils.isNotEmpty(filter.getCategory_id().getEq())) {
            String categoryId = filter.getCategory_id().getEq();
            ProductSearchPage productSearchPage = hybrisRestAPIClient.getProductsByCategory(categoryId, --currentPage, pageSize);
            if (productSearchPage != null) {
                result.setTotal_count(productSearchPage.getPagination().getTotalResults().intValue());

                for (Product product : productSearchPage.getProducts()) {

                    ConfigurableProduct productInterface = product.adaptToConfigurableProduct();

                    result.getItems().add(productInterface);

                }
            }

        } else if (sort != null && sort.getPrice() != null ) {
            //TODO: Get products sorted by price
            ProductSearchPage productSearchPage = hybrisRestAPIClient.getProductsByCategory(hybrisDefaultCategory, --currentPage, pageSize);
            if (productSearchPage != null) {
                result.setTotal_count(productSearchPage.getPagination().getTotalResults().intValue());

                for (Product product : productSearchPage.getProducts()) {

                    ConfigurableProduct productInterface = product.adaptToConfigurableProduct();

                    result.getItems().add(productInterface);

                }
            }

        } else if (StringUtils.isNotEmpty(search)) {
            //search products by user input
            ProductSearchPage productSearchPage = hybrisRestAPIClient.getProductsByCategory(hybrisDefaultCategory);
            if (productSearchPage != null) {
                result.setTotal_count(productSearchPage.getPagination().getTotalResults().intValue());
                List<Product> productsSearched = productSearchPage.getProducts().stream().filter(p->p.getName().contains(search)).collect(Collectors.toList());
                for (Product product : productsSearched) {
                    SimpleProduct productInterface = product.adaptToSimpleProduct();
                    result.getItems().add(productInterface);
                }
            }

        }

        return result;
    }


    public CategoryProducts getProductsByCategory(CategoryInterface origin, Integer pageSize, Integer currentPage, ProductAttributeSortInput sort) {
        CategoryProducts result = new CategoryProducts();
        ProductSearchPage productSearchPage = this.hybrisRestAPIClient.getProductsByCategory(String.valueOf(origin.getId()), --currentPage , pageSize);
        if (productSearchPage!=null && productSearchPage.getProducts()!=null)
            result.setTotal_count(productSearchPage.getPagination().getTotalResults().intValue());
        result.setItems(new ArrayList<>());
        productSearchPage.getProducts().forEach(
                p -> result.getItems().add(p.adaptToSimpleProduct()));
        return result;
    }

}
