package solid.lsp.solution;

// Main class to test the hierarchy
public class Main {
    public static void main(String[] args) {
        // Using Car object
        Vehicle myCar = new Car();
        myCar.start();
        myCar.refuel(); // Car-specific refueling behavior
        myCar.stop();

        System.out.println();

        // Using ElectricCar object
        Vehicle myElectricCar = new ElectricCar();
        myElectricCar.start();
        myElectricCar.refuel(); // Calls recharge() via refuel()
        myElectricCar.stop();
    }
}
