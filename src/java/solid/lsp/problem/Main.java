package solid.lsp.problem;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car();
        myCar.start();
        myCar.refuel(); // This works fine as expected for a regular car
        myCar.stop();

        // Creating an instance of ElectricCar
        Car myElectricCar = new ElectricCar(); // We are treating ElectricCar as a Car
        myElectricCar.start();

        // Here's the problem: - violation of Liskov Substitution principle
        // When we call the refuel() method, it throws an exception
        // because ElectricCar doesn't need refueling
        myElectricCar.refuel();  // This will throw an UnsupportedOperationException

        myElectricCar.stop(); // This works, but refuel() breaks the program
    }
}
