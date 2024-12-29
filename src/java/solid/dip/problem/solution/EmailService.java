package solid.dip.problem.solution;

public class EmailService implements NotificationSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("sent email");
    }
}
