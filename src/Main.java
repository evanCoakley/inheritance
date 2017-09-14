public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification();
        TextNotification textNotification = new TextNotification();

        emailNotification.transport();
        textNotification.transport();

    }
}
