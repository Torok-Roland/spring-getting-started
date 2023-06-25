package ro.sda.spring._3_;

import org.junit.jupiter.api.Test;
import ro.sda.spring._3_.beans.Dog;
import ro.sda.spring._3_.beans.Owner;

import java.lang.reflect.Field;

public class OwnerTest {


    @Test
    public void testOwner() throws NoSuchFieldException, IllegalAccessException {

        Owner o = new Owner("John");

        Field dogField = o.getClass().getDeclaredField("dog");
        dogField.setAccessible(true);
        dogField.set(o, new Dog());

        o.walkWithDog();
    }

}
