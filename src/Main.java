public class Main {

    public static void main(String[] args) throws NoTransportException {

        EmailNotification emailNotification =
                new EmailNotification("Test", "Testing this project", "evancoakley1@gmail.com", "Google");
        TextNotification textNotification =
                new TextNotification("Texting is vacant", "It deprives human connection", "anyone who will listen", "Sprint");

        emailNotification.transport();
        textNotification.transport();



    }

}
