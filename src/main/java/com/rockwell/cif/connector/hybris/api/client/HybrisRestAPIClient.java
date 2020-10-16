package com.rockwell.cif.connector.hybris.api.client;

import com.rockwell.cif.connector.hybris.model.CategoryHierarchy;
import com.rockwell.cif.connector.hybris.model.Product;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;

public interface HybrisRestAPIClient {

    ProductSearchPage getProductsByCategory(String id);

    ProductSearchPage getProductsByCategory(String id, Integer currentPage, Integer pageSize);

    CategoryHierarchy getCategory(String id);

    Product getProduct(String id);
}
