package ro.sda.spring._6_.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._6_.components.Cat;
@ComponentScan({"ro.sda.spring._6_.components"})
@Configuration
public class Config {
    @Bean
    public Cat cat(){
        return new Cat();
    }
}