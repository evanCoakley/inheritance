

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

    @Override
    public void randomText() {
        super.randomText();
        System.out.println("I once climbed the walls of my mind only to find a shattered peanut (FROM EMAIL)");
    }



    @Override
    protected Object clone() {
        return new EmailNotification(getSubject(), getBody(), getRecipient(), getSmtpProvider());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (!recipient.equals(that.recipient)) return false;
        return smtpProvider.equals(that.smtpProvider);
    }

    @Override
    public int hashCode() {
        int result = recipient.hashCode();
        result = 31 * result + smtpProvider.hashCode();
        return result;
    }
}
