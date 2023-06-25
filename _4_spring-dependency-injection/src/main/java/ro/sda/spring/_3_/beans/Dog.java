package ro.sda.spring._3_.beans;

public class Dog {
    private String name;

    public Dog() {
        System.out.println("Dog constructor called!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
