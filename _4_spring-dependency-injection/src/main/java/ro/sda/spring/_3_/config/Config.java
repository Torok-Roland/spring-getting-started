package ro.sda.spring._3_.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._3_.beans.Dog;
import ro.sda.spring._3_.beans.Owner;

@Configuration
public class Config {

    @Bean
    public Owner owner(){
        Owner o = new Owner("John");
        return o;
    }

    @Bean
    public Dog dog(){
        Dog d = new Dog();
        d.setName("Rex");
        return d;
    }
}
