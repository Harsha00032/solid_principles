package solid.lsp.solution;

public class ElectricCar extends  Vehicle{
    @Override
    public void refuel() {
        recharge();
    }

    public void recharge() {
        System.out.println("Electric car is recharging");
    }
}
