import java.time.LocalDateTime;

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;


    public Notification(String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "DEFAULT Status";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;

    }

    public abstract void transport() throws NoTransportException;


    public void showStatus() {
        System.out.println("Current status:" + status);
    }

    protected void randomText() {
        System.out.println("Funky Monkey");
    }

}

