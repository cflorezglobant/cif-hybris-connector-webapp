package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.hybris.api.client.HybrisRestAPIClient;
import com.rockwell.cif.connector.hybris.model.CategoryHierarchy;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;
import com.rockwell.cif.connector.server.graphql.fetcher.util.ProductsUtil;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import com.rockwell.cif.connector.server.graphql.model.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataFetchersDelegateCategoryTreeImpl implements DataFetchersDelegateCategoryTree {
    @Resource
    private ProductsUtil productsUtil;

    @Resource
    private HybrisRestAPIClient hybrisRestAPIClient;

    @Override
    public List<String> available_sort_by(DataFetchingEnvironment dataFetchingEnvironment, CategoryTree origin) {
        return null;
    }

    @Override
    public List<Breadcrumb> breadcrumbs(DataFetchingEnvironment dataFetchingEnvironment, CategoryTree origin) {
        return null;
    }

    @Override
    public List<CategoryTree> children(DataFetchingEnvironment dataFetchingEnvironment, CategoryTree origin) {
           List<CategoryTree> children = new ArrayList<>();
            if (Integer.valueOf(origin.getChildren_count()) > 0) {
                int position = 1;
                CategoryHierarchy categoryHierarchy = hybrisRestAPIClient.getCategory(String.valueOf(origin.getId()));
                if (categoryHierarchy != null) {
                    for (CategoryHierarchy subCategory : categoryHierarchy.getSubcategories()) {
                        CategoryTree child = subCategory.adaptToGrahQL();
                        ProductSearchPage productSearchPage = hybrisRestAPIClient.getProductsByCategory(String.valueOf(subCategory.getId()));
                        if (productSearchPage != null && productSearchPage.getPagination() != null)
                            child.setProduct_count(productSearchPage.getPagination().getTotalResults().intValue());
                        child.setPosition(position);
                        position++;
                        children.add(child);
                    }
                }
            }
            return children;
    }

    @Override
    public CmsBlock cms_block(DataFetchingEnvironment dataFetchingEnvironment, CategoryTree origin) {
        return null;
    }

    @Override
    public CategoryProducts products(DataFetchingEnvironment dataFetchingEnvironment, CategoryTree origin, Integer pageSize, Integer currentPage, ProductAttributeSortInput sort) {
        return productsUtil.getProductsByCategory(origin, pageSize, currentPage, sort);
    }
}
