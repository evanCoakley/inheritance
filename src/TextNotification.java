public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;



    public TextNotification(String recipient, String smsProvider) {
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {

    }
}
