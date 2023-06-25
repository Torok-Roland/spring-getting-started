package ro.sda.spring._4_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._4_.components.Dog;
import ro.sda.spring._4_.components.Owner;
import ro.sda.spring._4_.config.ProjectConfiguration;
public class Main {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
            Owner o = context.getBean(Owner.class);
            System.out.println(o);
            Dog d = o.getDog();
            System.out.println(d);
            Dog d2 = context.getBean(Dog.class);
            System.out.println(d2);
        }
    }
}