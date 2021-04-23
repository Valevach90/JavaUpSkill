package example.coffeeMachine.coffeeMachineSoft;

public class InningOfTea implements IInning {
    public ICup doInning() {
        return new CupOfTea();
    }
}
