package solid.dip.problem.solution;

public class NotificationService {
    private final NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendMessage(String message) {
        this.notificationSender.sendMessage(message);
    }
}
