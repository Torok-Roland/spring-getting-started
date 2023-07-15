package ro.sda.spring._7_.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import lombok.Getter;

@Getter
public class Owner {
    @Value("Messi")
    private String name;
    @Autowired
    private Cat cat;
    public Owner() {
        System.out.println("Owner constructor called");
    }
}