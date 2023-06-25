package ro.sda.spring._5_.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@ToString
public class Dog {
    @Value("Rex")
    private String name;
    public Dog() {
        System.out.println("Dog constructor called!");
    }
    @PostConstruct
    private void init(){
        System.out.println("Dog was initialized. ");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Dog is destroying");
    }
    public void sayHam(){
        System.out.println("Ham Ham!");
    }
}