package ro.sda.spring._1_.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._1_.beans.Cat;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring._1_.components")
public class ProjectConfig {
    // we mark this method as bean which tells spring that it needs to manage this component
    // by manage we understand that this component is going to be register in application context
    @Bean
    public Cat cat123() {
        System.out.println("Cat bean is creating");
        return new Cat();
    }


}
