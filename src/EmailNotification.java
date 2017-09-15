import java.time.LocalDateTime;

public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;



    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
    }

    public String getRecipient() {

        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println(getCreatedAt());
        System.out.println(getBody());
        System.out.println(getSubject());
        System.out.println(getRecipient());
        System.out.println(getSmtpProvider());


    }




}
