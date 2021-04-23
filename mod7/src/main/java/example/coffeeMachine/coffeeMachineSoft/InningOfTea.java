package example.coffeeMachine.coffeeMachineSoft;

public class InningOfTea implements Inning {
    public Cup doInning() {
        return new CupOfTea();
    }
}
