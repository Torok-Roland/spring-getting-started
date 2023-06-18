package ro.sda.spring.without_dependency_injection;

/**
 * EmailService class that holds the logic to send emails messages to recipient email addresses.
 */
public class EmailService {

    public void sendEmail(String message, String receiver){

        //logic to send email
        System.out.println("Email sent to " + receiver + " with message " + message);
    }
}
