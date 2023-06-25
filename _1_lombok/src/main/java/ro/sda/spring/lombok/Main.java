package ro.sda.spring.lombok;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("Cătălin");
        user1.setLastName("Manaila");
        user1.setAge(25);
        System.out.println(user1);

        User u2 = new User("Leo", "Messi", 35);
        System.out.println(u2);
    }
}