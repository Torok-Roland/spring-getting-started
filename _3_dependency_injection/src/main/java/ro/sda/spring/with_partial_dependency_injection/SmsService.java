package ro.sda.spring.with_partial_dependency_injection;

public class SmsService implements MessageService{
    @Override
    public void sendEmail(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with message: " + message);
    }
}
