package ro.sda.spring._5_.beans;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@ToString
public class Owner {
    @Value("Robert")
    private String name;
    // field based injection
    // @Autowired
    private Dog dog;
    public Owner() {
        System.out.println("Owner constructor called");
    }
    // setter based injection
    @Autowired
    public void setDog(Dog dog) {
        System.out.println("Dependency injected using setter");
        this.dog = dog;
    }
    @PostConstruct
    public void init(){
        System.out.println("Owner was created");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Owner is destroying");
    }
    public Dog getDog() {
        return dog;
    }
}