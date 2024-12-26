package solid.ocp;

public class Invoice {
    private final double amount;
    private final InvoiceGenerator invoiceGenerator;

    public Invoice(double amount, InvoiceGenerator invoiceGenerator){
        this.amount = amount;
        this.invoiceGenerator = invoiceGenerator;
    }

    public void generateInvoice(double amount) {
        this.invoiceGenerator.generateInvoice(amount);
    }

    public double getAmount(){
        return this.amount;
    }

    public void applyDiscount() {
        System.out.println("Applying discount on invoice: " + amount);
    }
}
