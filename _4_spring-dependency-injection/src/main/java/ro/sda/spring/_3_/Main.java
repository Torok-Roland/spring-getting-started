package ro.sda.spring._3_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._3_.beans.Dog;
import ro.sda.spring._3_.beans.Owner;
import ro.sda.spring._3_.config.Config;

public class Main {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(Config.class)) {

            Owner o = context.getBean(Owner.class);

            o.walkWithDog();

            Dog d = o.getDog();
            System.out.println(d);

            Dog d2 = context.getBean(Dog.class);
            System.out.println(d2);

        }
    }
}
