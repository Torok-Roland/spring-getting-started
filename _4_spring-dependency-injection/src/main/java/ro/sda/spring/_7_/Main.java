package ro.sda.spring._7_;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._7_.beans.Cat;
import ro.sda.spring._7_.beans.Owner;
import ro.sda.spring._7_.config.ProjectConfig;
public class Main {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Cat c = ctx.getBean(Cat.class);
            c.sayMeow();
            System.out.println(c);
            Owner o1 = ctx.getBean(Owner.class);
            Cat c2 = o1.getCat();
            System.out.println(c2);
            Cat c3 = ctx.getBean(Cat.class);
            c3.sayMeow();
            System.out.println(c3);
            Owner o2 = ctx.getBean(Owner.class);
            Cat c4 = o2.getCat();
            System.out.println(c4);
        }
    }
}