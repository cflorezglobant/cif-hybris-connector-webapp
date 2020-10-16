package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.FixedProductTax;
import com.rockwell.cif.connector.server.graphql.model.Money;
import com.rockwell.cif.connector.server.graphql.model.ProductDiscount;
import com.rockwell.cif.connector.server.graphql.model.ProductPrice;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateProductPriceImpl implements DataFetchersDelegateProductPrice {
    @Override
    public ProductDiscount discount(DataFetchingEnvironment dataFetchingEnvironment, ProductPrice origin) {
        return origin.getDiscount();
    }

    @Override
    public Money final_price(DataFetchingEnvironment dataFetchingEnvironment, ProductPrice origin) {
        return origin.getFinal_price();
    }

    @Override
    public List<FixedProductTax> fixed_product_taxes(DataFetchingEnvironment dataFetchingEnvironment, ProductPrice origin) {
        return origin.getFixed_product_taxes();
    }

    @Override
    public Money regular_price(DataFetchingEnvironment dataFetchingEnvironment, ProductPrice origin) {
        return origin.getRegular_price();
    }
}
