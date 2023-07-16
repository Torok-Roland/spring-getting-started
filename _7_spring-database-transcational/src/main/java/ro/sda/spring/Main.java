package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.Config;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;
import ro.sda.spring.service.ProductService;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(Config.class)) {

//            ProductRepository repository = ctx.getBean(ProductRepository.class);
//
//            repository.addProduct(new Product("Iphone 14", "Like the previous one"));
//            repository.addProduct(new Product("PS5", "Nice product"));
//            repository.addProduct(new Product("Samsung S22", "Good product"));
//
//            List<Product> products = repository.getAllProducts();

            // we used method reference operator (resolution operator "::") comibed with
            // forEach and this means that every object from the list will be passed through
            // the system out println method as a parameter
            //  products.forEach(System.out::println);

//            for(var p : products){
//                System.out.println(p);
//            }

            var productService = ctx.getBean(ProductService.class);
            productService.addProduct(" New Iphone 14 from service", " This product is from the service logic");
            productService.addProduct(" New Iphone 15 from service", " This product is from the service logic");
            productService.addProduct(" New Iphone 16 from service", " This product is from the service logic");
            productService.addProduct(" New Iphone 17 from service", " This product is from the service logic");

//            List<Product> products = productService.getAllProducts();
//
//            for (var p : products) {
//                System.out.println(p);
//            }

            productService.addProductsWithTransaction(new Product("p1", "abcd"), new Product("wrong", "abcd"));

            List<Product> products = productService.getAllProducts();

            for (var p : products) {
                System.out.println(p);
            }

        }
    }
}