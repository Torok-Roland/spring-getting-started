package ro.sda.spring.without_dependency_injection;

public class Main {
    public static void main(String[] args) {
       ServiceConsumer serviceConsumer = new ServiceConsumer();

       serviceConsumer.processMessage("Alert", "Catalin@abc.com");
    }
}