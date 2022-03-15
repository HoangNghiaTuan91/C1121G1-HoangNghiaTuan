package repository.impl;

import model.Product;
import repository.ProductRepository;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository {
    private static Map<Integer, Product> productHashMap = new HashMap<>();

    static {
        productHashMap.put(1, new Product(1, "Iphone 13 Promax", 30000.0, "New", "Iphone"));
        productHashMap.put(2, new Product(2, "Iphone 11", 15000.0, "New", "Iphone"));
        productHashMap.put(3, new Product(3, "Samsung ZFlip", 30000.0, "New", "Samsung"));
        productHashMap.put(4, new Product(4, "Samsung Fold 3", 40000.0, "Used", "Samsung"));
        productHashMap.put(5, new Product(5, "Nokia 1280", 300.0, "Used", "Nokia"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productHashMap.values());
    }

    @Override
    public void save(Product product) {
        productHashMap.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productHashMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        productHashMap.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        Set<Product> productSet = new HashSet(productHashMap.values());
        List<Product> products = new ArrayList<>();
        for (Product product : productSet) {
            if (product.getName().contains(name)) {
                products.add(productHashMap.get(product.getId()));
            }
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        return productHashMap.get(id);
    }

}
