package solid.ocp.solution;

public class InternationalInvoiceGenerator implements InvoiceGenerator {

    @Override
    public void generateInvoice(double amount) {
        System.out.println("International invoice generator");
    }
}
