package ro.sda.spring._5_;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._5_.beans.Dog;
import ro.sda.spring._5_.beans.Owner;
import ro.sda.spring._5_.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Dog d1 = ctx.getBean(Dog.class);
            d1.sayHam();
            Owner o1 = ctx.getBean(Owner.class);
            Dog d2 = o1.getDog();
            d2.sayHam();
            System.out.println("Last line before shutting down the context");
        }
        System.out.println("The context was shut down!");
    }
}