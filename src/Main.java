public class Main {

    public static void main(String[] args) throws NoTransportException {

        EmailNotification email =
                new EmailNotification("Test", "Testing this project", "evancoakley1@gmail.com", "Google");
        TextNotification text =
                new TextNotification("Texting is vacant", "It deprives human connection", "anyone who will listen", "Sprint");

        email.transport();
        text.transport();

        text.randomText();
        email.randomText();

        text.showStatus();
        email.showStatus();

        EmailNotification clone = (EmailNotification) email.clone();
        System.out.println("Testing Clone: " + email.equals(clone));

    }

}
