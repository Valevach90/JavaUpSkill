package example.coffeeMachine.coffeeMachineSoft;

public class InningOfCoffee implements Inning {
    public Cup doInning() {
        return new CupOfCoffee();
    }
}
