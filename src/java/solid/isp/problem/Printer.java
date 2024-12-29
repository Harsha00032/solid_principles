package solid.isp.problem;

// A Fat interface who ever implements this would need to implement all the methods in it which may be unnecessary
public interface Printer {
    void printDocument(String document);
    void scanDocument(String document);
    void faxDocument(String document);
    void stapleDocument(String document);
}
