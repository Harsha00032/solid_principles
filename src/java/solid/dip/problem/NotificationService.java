package solid.dip.problem;

public class NotificationService {

    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    private void sendMessage(String message) {
        emailService.sendEmail(message);
    }
}
