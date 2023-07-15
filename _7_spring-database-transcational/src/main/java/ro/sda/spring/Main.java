package ro.sda.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring.config.Config;
import ro.sda.spring.model.Product;
import ro.sda.spring.repository.ProductRepository;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(Config.class)) {

            ProductRepository repository = ctx.getBean(ProductRepository.class);

            repository.addProduct(new Product("Iphone 14", "Like the previous one"));
            repository.addProduct(new Product("PS5", "Nice product"));
            repository.addProduct(new Product("Samsung S22", "Good product"));

            List<Product> products = repository.getAllProducts();

            // we used method reference operator (resolution operator "::") comibed with
            // forEach and this means that every object from the list will be passed through
            // the system out println method as a parameter
            //  products.forEach(System.out::println);

            for(var p : products){
                System.out.println(p);
            }

        }
    }
}