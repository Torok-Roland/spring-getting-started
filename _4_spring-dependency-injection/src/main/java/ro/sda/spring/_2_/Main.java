package ro.sda.spring._2_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._2_.beans.Dog;
import ro.sda.spring._2_.beans.Owner;
import ro.sda.spring._2_.config.ProjectConfig;


public class Main {

    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Owner o1 = context.getBean("owner1", Owner.class);
            System.out.println(o1);

            Owner o2 = context.getBean("owner2", Owner.class);
            System.out.println(o1);

            Dog d1 = o1.getDog();
            System.out.println(d1);

            Dog d2 = o2.getDog();
            System.out.println(d2);

            Dog d3 = context.getBean(Dog.class);
            System.out.println(d3);

        }

    }


}
