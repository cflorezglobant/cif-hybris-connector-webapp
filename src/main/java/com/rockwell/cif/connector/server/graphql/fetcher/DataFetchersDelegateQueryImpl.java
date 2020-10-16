package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.hybris.api.client.HybrisRestAPIClient;
import com.rockwell.cif.connector.hybris.api.client.HybrisRestAPIClientImpl;
import com.rockwell.cif.connector.hybris.model.CategoryHierarchy;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;
import com.rockwell.cif.connector.server.graphql.fetcher.util.CategoryUtil;
import com.rockwell.cif.connector.server.graphql.fetcher.util.ProductsUtil;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataFetchersDelegateQueryImpl implements DataFetchersDelegateQuery {

    @Resource
    private CategoryUtil categoryUtil;

    @Resource
    private ProductsUtil productsUtil;

    @Override
    public Cart cart(DataFetchingEnvironment dataFetchingEnvironment, String cart_id) {
        return null;
    }

    @Override
    public CategoryTree category(DataFetchingEnvironment dataFetchingEnvironment, Integer id) {
        return categoryUtil.getCategoryData(String.valueOf(id));
    }

    @Override
    public List<CategoryTree> categoryList(DataFetchingEnvironment dataFetchingEnvironment, CategoryFilterInput filters) {
        List<CategoryTree> list = new ArrayList<>();
        if (filters.getIds() != null && StringUtils.isNotEmpty(filters.getIds().getEq())) {
            String id = filters.getIds().getEq();
            if (StringUtils.isNotEmpty(id)) {
                CategoryTree categoryTree = categoryUtil.getCategoryData(id);
                if (categoryTree != null)
                    list.add(categoryTree);
            }
        } else {
            String id = filters.getUrl_key().getEq();
            if (StringUtils.isNotEmpty(id)) {
                CategoryTree categoryTree = categoryUtil.getCategoryData(id);
                if (categoryTree != null)
                    list.add(categoryTree);
            }
        }


        return list;
    }

    @Override
    public List<CheckoutAgreement> checkoutAgreements(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public CmsBlocks cmsBlocks(DataFetchingEnvironment dataFetchingEnvironment, List<String> identifiers) {
        return null;
    }

    @Override
    public CmsPage cmsPage(DataFetchingEnvironment dataFetchingEnvironment, Integer id, String identifier) {
        return null;
    }

    @Override
    public List<Country> countries(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public Country country(DataFetchingEnvironment dataFetchingEnvironment, String id) {
        return null;
    }

    @Override
    public Currency currency(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public CustomAttributeMetadata customAttributeMetadata(DataFetchingEnvironment dataFetchingEnvironment, List<AttributeInput> attributes) {
        return null;
    }

    @Override
    public Customer customer(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public Cart customerCart(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public CustomerDownloadableProducts customerDownloadableProducts(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public CustomerOrders customerOrders(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public CustomerPaymentTokens customerPaymentTokens(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }

    @Override
    public HostedProUrl getHostedProUrl(DataFetchingEnvironment dataFetchingEnvironment, HostedProUrlInput input) {
        return null;
    }

    @Override
    public PayflowLinkToken getPayflowLinkToken(DataFetchingEnvironment dataFetchingEnvironment, PayflowLinkTokenInput input) {
        return null;
    }

    @Override
    public IsEmailAvailableOutput isEmailAvailable(DataFetchingEnvironment dataFetchingEnvironment, String email) {
        return null;
    }

    @Override
    public Products products(DataFetchingEnvironment dataFetchingEnvironment, String search, ProductAttributeFilterInput filter, Integer pageSize, Integer currentPage, ProductAttributeSortInput sort)  {
        return productsUtil.products(search, filter, pageSize, currentPage, sort);
    }

    @Override
    public StoreConfig storeConfig(DataFetchingEnvironment dataFetchingEnvironment) {
        StoreConfig storeConfig = new StoreConfig();
        storeConfig.setSecure_base_media_url("");
        return  storeConfig;
    }

    @Override
    public EntityUrl urlResolver(DataFetchingEnvironment dataFetchingEnvironment, String url) {
        return null;
    }

    @Override
    public WishlistOutput wishlist(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }



}
