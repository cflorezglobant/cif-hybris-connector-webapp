package com.rockwell.cif.connector.server.graphql.fetcher;

import com.rockwell.cif.connector.server.graphql.model.*;
import com.rockwell.cif.connector.server.graphql.model.*;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateShippingCartAddressImpl implements DataFetchersDelegateShippingCartAddress {
    @Override
    public List<AvailableShippingMethod> available_shipping_methods(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }

    @Override
    public List<CartItemQuantity> cart_items(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }

    @Override
    public List<CartItemInterface> cart_items_v2(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }

    @Override
    public CartAddressCountry country(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }

    @Override
    public CartAddressRegion region(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }

    @Override
    public SelectedShippingMethod selected_shipping_method(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }

    @Override
    public List<String> street(DataFetchingEnvironment dataFetchingEnvironment, ShippingCartAddress origin) {
        return null;
    }
}
