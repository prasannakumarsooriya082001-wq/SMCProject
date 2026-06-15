package smcproject.Notification;

public class NotificationModel
{
    private int id;
    private String message;
    private String status;

    public NotificationModel(
            int id,
            String message,
            String status)
    {
        this.id = id;
        this.message = message;
        this.status = status;
    }

    public int getId()
    {
        return id;
    }

    public String getMessage()
    {
        return message;
    }

    public String getStatus()
    {
        return status;
    }
}