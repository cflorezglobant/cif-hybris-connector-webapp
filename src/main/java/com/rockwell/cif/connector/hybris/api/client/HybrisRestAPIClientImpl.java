package com.rockwell.cif.connector.hybris.api.client;

import com.rockwell.cif.connector.hybris.model.CategoryHierarchy;
import com.rockwell.cif.connector.hybris.model.Product;
import com.rockwell.cif.connector.hybris.model.ProductSearchPage;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.net.ssl.SSLContext;
import java.security.cert.X509Certificate;

@Component
public class HybrisRestAPIClientImpl implements HybrisRestAPIClient{

    private RestTemplate restTemplate;

    @Value("${hybris.api.v2.endpoint}")
    private String hybrisAPIEndpoint;

    @Value("${hybris.base.media.url}")
    private String hybrisBaseMediaUrl;

    //This could be a settings
    private String hybrisWebsite = "powertools";

    //This could be a settings
    private String hybrisCatalog = "powertoolsProductCatalog";

    //This could be a settings
    private String hybrisCatalogVersion = "Online";

    private static final String HYBRIS_GET_PRODUCTS_BY_CATEGORY_API = "/%s/categories/%s/products";

    private static final String HYBRIS_GET_CATEGORY_API = "/%s/catalogs/%s/%s/categories/%s";

    private static final String HYBRIS_GET_PRODUCT_API = "/%s/products/%s";


    private static final Logger log = LoggerFactory.getLogger(HybrisRestAPIClientImpl.class);

    @Autowired
    public HybrisRestAPIClientImpl() {
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;

        SSLContext sslContext = null;
        try {
            //Skip SSL java OOTB validation process for self-signed certificates
            //this could be ridoff later
            sslContext = org.apache.http.ssl.SSLContexts.custom()
                    .loadTrustMaterial(null, acceptingTrustStrategy)
                    .build();

            SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);

            CloseableHttpClient httpClient = HttpClients.custom()
                    .setSSLSocketFactory(csf)
                    .build();

            HttpComponentsClientHttpRequestFactory requestFactory =
                    new HttpComponentsClientHttpRequestFactory();

            requestFactory.setHttpClient(httpClient);

            restTemplate = new RestTemplate(requestFactory);

        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


    public ProductSearchPage getProductsByCategory(String id) {
        return this.getProductsByCategory(id, 0, 20);
    }


    public ProductSearchPage getProductsByCategory(String id, Integer currentPage, Integer pageSize) {

        String request = hybrisAPIEndpoint.concat(String.format(HYBRIS_GET_PRODUCTS_BY_CATEGORY_API, hybrisWebsite, id));

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(request);
        builder.queryParam("currentPage", currentPage);
        builder.queryParam("pageSize", pageSize);
        builder.queryParam("fields", "FULL");

        ResponseEntity<ProductSearchPage> response
                = restTemplate.exchange(
                builder.toUriString(), HttpMethod.GET, null, ProductSearchPage.class);
        if (response.getStatusCode().value() == 200) {
            ProductSearchPage productSearchPage = response.getBody();
            productSearchPage.getProducts().forEach(p -> this.setURIProductImages(p));
            return productSearchPage;
        }
        return null;
    }

    public CategoryHierarchy getCategory(String id) {

        String request = hybrisAPIEndpoint.concat(String.format(
                HYBRIS_GET_CATEGORY_API, hybrisWebsite, hybrisCatalog, hybrisCatalogVersion, id));

        ResponseEntity<CategoryHierarchy> response
                = restTemplate.exchange(
                request, HttpMethod.GET, null, CategoryHierarchy.class);
        if (response.getStatusCode().value() == 200) {

            CategoryHierarchy categoryHierarchy = response.getBody();
            return categoryHierarchy;
        }
        return null;
    }

    public Product getProduct(String id) {
        String request = hybrisAPIEndpoint.concat(String.format(
                HYBRIS_GET_PRODUCT_API, hybrisWebsite, id));

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(request);
        builder.queryParam("fields", "FULL");

        Product product = null;

        ResponseEntity<Product> response
                = restTemplate.exchange(
                builder.toUriString(), HttpMethod.GET, null, Product.class);
        if (response.getStatusCode().value() == 200) {
            product = response.getBody();
            setURIProductImages(product);
        }
        return product;
    }

    private void setURIProductImages(Product product) {
        if (product != null && product.getImages() != null) {
            product.getImages().forEach(p -> {
                if (StringUtils.isNotEmpty(p.getUrl())) {
                    p.setUrl(this.hybrisBaseMediaUrl.concat(p.getUrl()));
                }
            });
        }
    }

}
