package solid.ocp;

public class InternationalInvoiceGenerator implements InvoiceGenerator {

    @Override
    public void generateInvoice(double amount) {
        System.out.println("International invoice generator");
    }
}
