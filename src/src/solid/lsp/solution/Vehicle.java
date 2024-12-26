package solid.lsp.solution;

public abstract class Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }

    public void stop() {
        System.out.println("Car is stopping");
    }

    public abstract void refuel();
}
