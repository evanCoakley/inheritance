import java.time.LocalDateTime;

public abstract class Notification {


    private LocalDateTime createdAt;
    private String subject;
    private String body;
    



    }

    public Notification(LocalDateTime createdAt, String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;


    }

    public void transport(){

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



}