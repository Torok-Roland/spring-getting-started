package ro.sda.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(String name, String description) {
        productRepository.addProduct(new Product(name, description));
        System.out.println("Product " + name + "created.");
    }

    public List<Product> getAllProducts() {
        List<Product> productList = productRepository.getAllProducts();
        System.out.println("All products retrieved.");
        return productList;
    }

    public void addProductsWithTransaction(Product p1, Product p2) {
        try {
            productRepository.addProductsWithTransaction(p1, p2);
            System.out.println("Both products were added successfully");
        } catch (RuntimeException e){
            System.out.println("Exception occurred with message" + e.getMessage());
        }
    }

}
