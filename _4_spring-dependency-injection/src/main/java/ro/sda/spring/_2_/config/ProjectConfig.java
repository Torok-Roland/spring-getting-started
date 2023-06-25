package ro.sda.spring._2_.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._2_.beans.Dog;
import ro.sda.spring._2_.beans.Owner;

@Configuration
public class ProjectConfig {

    @Bean
    public Owner owner1(){
        Owner o = new Owner();
        o.setName("George");
        o.setDog(dog());
        return o;
    }

    @Bean
    public Owner owner2(Dog dog){
        Owner o = new Owner();
        o.setName("Catalin");
        o.setDog(dog);
        return o;
    }

    @Bean
    public Dog dog(){
        Dog d = new Dog();
        d.setName("Rex");
        return d;
    }


}
