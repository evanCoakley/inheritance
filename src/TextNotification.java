

public class TextNotification extends Notification {

    private String recipient;
    private String smsProvider;



    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        this.status =   "I am TEXT";
    }

    public String getRecipient() {

        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("Created at: " + getCreatedAt());
        System.out.println("Subject is " + getSubject());
        System.out.println("Body is " + getBody());
        System.out.println("Recipient is " + getRecipient());
        System.out.println("Provider is " + getSmsProvider());
     }

     public void randomText(){
         System.out.println("Over here in an existential void (FROM TEXT)");
     }


   
   
        
     
}
