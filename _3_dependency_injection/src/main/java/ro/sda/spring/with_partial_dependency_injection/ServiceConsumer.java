package ro.sda.spring.with_partial_dependency_injection;

public class ServiceConsumer {
    private MessageService service;

    public ServiceConsumer(MessageService service){
        this.service = service;
    }
    public void processMessage(String msg, String receiver){
        //do some message validation, manipulation logic
        service.sendEmail(msg,receiver);
    }
}
