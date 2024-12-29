package solid.dip.problem.solution;

public class SMSService implements NotificationSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("sent SMS: " + message);
    }
}
