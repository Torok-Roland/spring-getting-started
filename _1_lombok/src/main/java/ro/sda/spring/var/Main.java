package ro.sda.spring.var;

import lombok.ToString;

public class Main {


    public static void main(String[] args) {

        String s1 = "a";
        MyClass m1 = new MyClass("name");

        var m2 = new MyClass("name2");

    }

    // java is strong type because we need every time to specify the parmeter types
    public static void myMethod(MyClass myClass){
        System.out.println(myClass);
    }

}

@ToString
class MyClass{
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
