package com.rockwell.cif.connector.server.graphql.fetcher.util;

import com.rockwell.cif.connector.server.graphql.model.ProductAttributeSortInput;
import com.rockwell.cif.connector.server.graphql.model.SortEnum;

import java.util.Map;

public class ProductAttributeSortInputFactory {

    public static ProductAttributeSortInput getProductAttributeSortInputInstance(Map<String, Object> sortOptions){
        if (sortOptions!=null){
            ProductAttributeSortInput sort = new ProductAttributeSortInput();
            if (sortOptions.containsKey("name")){
                sort.setName(SortEnum.valueOf(String.valueOf(sortOptions.get("name"))));
            }
            if (sortOptions.containsKey("position")){
                sort.setPosition(SortEnum.valueOf(String.valueOf(sortOptions.get("position"))));
            }
            if (sortOptions.containsKey("price")){
                sort.setPrice(SortEnum.valueOf(String.valueOf(sortOptions.get("price"))));
            }
            if (sortOptions.containsKey("relevance")){
                sort.setRelevance(SortEnum.valueOf(String.valueOf(sortOptions.get("relevance"))));
            }
        }
        return null;
    }
}
