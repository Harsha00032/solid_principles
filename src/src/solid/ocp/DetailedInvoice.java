package solid.ocp;

// New class for generating detailed invoices
public class DetailedInvoice implements InvoiceGenerator {
    @Override
    public void generateInvoice(double amount) {
        System.out.println("Generating detailed invoice with breakdown for amount: " + amount);
    }
}
