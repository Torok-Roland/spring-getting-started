package ro.sda.spring.with_partial_dependency_injection;

public class Main {
    public static void main(String[] args) {
        ServiceConsumer consumer = new ServiceConsumer(new EmailService());

        consumer.processMessage("Alert", "ionut@abc.com");
    }
}
