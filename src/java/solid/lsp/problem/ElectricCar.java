package solid.lsp.problem;

public class ElectricCar extends Car {
    @Override
    public void refuel() {
        // Electric cars don't use fuel, so what do we do here? - this violates the LSP
        throw new UnsupportedOperationException("Electric cars don't need refueling");
    }

    public void reCharge() {
        System.out.println("Car is recharging");
    }
}
