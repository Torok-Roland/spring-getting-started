package ro.sda.spring._5_.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._5_.beans.Dog;
import ro.sda.spring._5_.beans.Owner;

@Configuration
public class ProjectConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
    @Bean
    public Owner owner(){
        return new Owner();
    }
}
