package ro.sda.spring._3_.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Owner {

    private String name;

    // field based injection
    // field injection is not recommended because it is harder to test (we need to use reflection to test)
    @Autowired
    private Dog dog;

    public Owner(String name) {
        this.name = name;
        System.out.println("Owner constructor called!");
    }

    public void walkWithDog(){
        System.out.println("Owner " + name + " has taken his dog " + dog.getName() + " out for a walk!");
    }

    public Dog getDog() {
        return dog;
    }
}
