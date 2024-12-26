package solid.ocp.problem;

// Adding new logic for each invoice type is the problem - we're modifying the existing logic - violates OCP
public class OldInvoice {
    private double amount;

    public OldInvoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    // Adding new logic for each invoice type is the problem - we're modifying the existing logic
    public void generateInvoice(String type) {
        if (type.equals("basic")) {
            System.out.println("Generating basic invoice for amount: " + amount);
        } else if (type.equals("international")) {
            System.out.println("Generating international invoice for amount: " + amount);
        }
    }

    public void applyDiscount() {
        System.out.println("Applying discount on invoice: " + amount);
    }
}
