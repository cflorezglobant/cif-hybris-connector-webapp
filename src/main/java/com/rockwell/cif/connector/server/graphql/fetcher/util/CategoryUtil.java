package com.rockwell.cif.connector.server.graphql.fetcher.util;

import com.rockwell.cif.connector.hybris.api.client.HybrisRestAPIClient;
import com.rockwell.cif.connector.hybris.model.CategoryHierarchy;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;
import com.rockwell.cif.connector.server.graphql.model.CategoryTree;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class CategoryUtil {

    @Resource
    private HybrisRestAPIClient hybrisRestAPIClient;

    public CategoryTree getCategoryData(String id) {
        CategoryHierarchy categoryHierarchy = hybrisRestAPIClient.getCategory(id);

        if (categoryHierarchy != null) {
            CategoryTree result = categoryHierarchy.adaptToGrahQL();
            //Count total of products for this category, it needs to consume another API.
            ProductSearchPage productSearchPage = hybrisRestAPIClient.getProductsByCategory(id);
            if (productSearchPage != null && productSearchPage.getPagination() != null)
                result.setProduct_count(productSearchPage.getPagination().getTotalResults().intValue());
            result.setPosition(1);
            return result;
        }
        return null;
    }

}
