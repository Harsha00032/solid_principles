package solid.isp.problem;

public class BasicPrinter implements Printer {
    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        // This printer can't scan, so we throw an exception
        throw new UnsupportedOperationException("Basic printer can't scan documents.");
    }

    @Override
    public void faxDocument(String document) {
        // This printer can't fax, so we throw an exception
        throw new UnsupportedOperationException("Basic printer can't fax documents.");
    }

    @Override
    public void stapleDocument(String document) {
        // This printer can't staple, so we throw an exception
        throw new UnsupportedOperationException("Basic printer can't staple documents.");
    }
}