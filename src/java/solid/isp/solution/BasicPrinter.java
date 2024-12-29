package solid.isp.solution;


public class BasicPrinter implements Print {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }
}
