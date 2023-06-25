package ro.sda.spring._4_.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Owner {
    @Value("John")
    private String name;
    private Dog dog;
    public Owner() {
        System.out.println("Owner constructor called!");
    }
    public Dog getDog() {
        return dog;
    }
    // setter based injection - we use setter with @Autowired to inject the Dog dependency
    @Autowired
    public void setDog(Dog dog) {
        System.out.println("Injection dog dependency using setter");
        this.dog = dog;
    }
    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}