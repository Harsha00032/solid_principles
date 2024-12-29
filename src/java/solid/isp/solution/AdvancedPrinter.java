package solid.isp.solution;

public class AdvancedPrinter implements Print, Fax, Scan, Staple{
    @Override
    public void faxDocument(String document) {
        System.out.println("faxing...."+ document);
    }

    @Override
    public void printDocument(String doc) {
        System.out.println("Printing...."+ doc);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("scanning"+ document);
    }

    @Override
    public void stapleDocument(String document) {
        System.out.println("stapling..."+ document);
    }
}
