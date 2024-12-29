package solid.dip.problem;

// Tight coupling on EmailService - instead it should depend on abstractions
public class NotificationService {

    private final EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    private void sendMessage(String message) {
        emailService.sendEmail(message);
    }
}
