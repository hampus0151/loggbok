import java.util.Calendar;
import java.util.Date;

public class logEntry {
    private Date createdAt;
    private Date updatedAt;
    private String message;

    public logEntry(String message) {
        this.message = message;
        createdAt = new Date();
        updatedAt = new Date();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "logEntry{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", message='" + message + '\'' +
                '}';
    }
    public void update(String newMessage){

    }
}
