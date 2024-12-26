package solid.ocp;

public class BasicInvoiceGenerator implements  InvoiceGenerator{
    @Override
    public void generateInvoice(double amount) {
        System.out.println("basic generator"+ amount);
    }
}