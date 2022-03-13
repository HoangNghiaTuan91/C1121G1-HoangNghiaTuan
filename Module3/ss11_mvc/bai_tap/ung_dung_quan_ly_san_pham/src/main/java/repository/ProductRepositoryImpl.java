package repository;

import model.Product;

import java.util.*;

public class ProductRepositoryImpl implements ProductRepository{
    private static Map<Integer, Product> productList = new HashMap<>();

    static {
        productList.put(1, new Product(1, "Iphone 13 Promax", 30000.0, "New", "Iphone"));
        productList.put(2, new Product(2, "Iphone 11", 15000.0, "New", "Iphone"));
        productList.put(3, new Product(3, "Samsung ZFlip", 30000.0, "New", "Samsung"));
        productList.put(4, new Product(4, "Samsung Fold 3", 40000.0, "Used", "Samsung"));
        productList.put(5, new Product(5, "Nokia 1280", 300.0, "Used", "Nokia"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        Set<Product> productSet = new HashSet(productList.values());
        List<Product> products = new ArrayList<>();
        for (Product product : productSet) {
            if (product.getName().contains(name)) {
                products.add(productList.get(product.getId()));
            }
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }
}
