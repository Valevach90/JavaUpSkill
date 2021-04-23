package example.coffeeMachine.coffeeMachineSoft;

public class InningOfCoffee implements IInning {
    public ICup doInning() {
        return new CupOfCoffee();
    }
}
