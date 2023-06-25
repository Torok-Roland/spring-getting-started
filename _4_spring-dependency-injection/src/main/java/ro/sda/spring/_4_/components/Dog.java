package ro.sda.spring._4_.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Dog {
    @Value("Rex")
    private String name;
    public Dog() {
        System.out.println("Dog constructor called!");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}