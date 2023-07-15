package ro.sda.spring._6_.components;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Owner {
    private String name;
    private Cat cat;
    // we used constructor to inject the dependencies in this component

    public Owner(@Value("Messi") String name, Cat cat) {
        this.name = name;
        this.cat = cat;
        System.out.println("Owner constructor called");
    }
}