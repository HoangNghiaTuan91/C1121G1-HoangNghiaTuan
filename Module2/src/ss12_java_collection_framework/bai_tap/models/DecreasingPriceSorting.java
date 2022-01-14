package ss12_java_collection_framework.bai_tap.models;

import ss12_java_collection_framework.bai_tap.models.Product;

import java.util.Comparator;

public class DecreasingPriceSorting implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o2.getPriceOfProduct()>o1.getPriceOfProduct()){
            return 1;
        }else if(o2.getPriceOfProduct()<o1.getPriceOfProduct()){
            return -1;
        } else {
            return 0;
        }
    }
}
