package ro.sda.spring._6_;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._6_.components.Cat;
import ro.sda.spring._6_.config.Config;
public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(Config.class)) {
            Cat c = ctx.getBean(Cat.class);
            c.sayMeow();
        }
    }
}