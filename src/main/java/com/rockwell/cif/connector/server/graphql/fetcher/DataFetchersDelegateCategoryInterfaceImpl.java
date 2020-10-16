package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.hybris.api.client.HybrisRestAPIClient;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;
import com.rockwell.cif.connector.server.graphql.fetcher.util.ProductsUtil;
import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class DataFetchersDelegateCategoryInterfaceImpl implements DataFetchersDelegateCategoryInterface {

    @Resource
    private ProductsUtil productsUtil;

    @Override
    public List<String> available_sort_by(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin) {
        return null;
    }

    @Override
    public List<Breadcrumb> breadcrumbs(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin) {
        return null;
    }

    @Override
    public CmsBlock cms_block(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin) {
        return null;
    }

    @Override
    public CategoryProducts products(DataFetchingEnvironment dataFetchingEnvironment, CategoryInterface origin, Integer pageSize, Integer currentPage, ProductAttributeSortInput sort) {
        return productsUtil.getProductsByCategory(origin, pageSize, currentPage, sort);
    }
}
