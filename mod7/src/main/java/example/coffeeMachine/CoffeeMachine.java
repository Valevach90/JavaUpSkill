package example.coffeeMachine;

import example.coffeeMachine.coffeeMachineSoft.Cup;
import example.coffeeMachine.coffeeMachineSoft.CupOfCoffee;
import example.coffeeMachine.coffeeMachineSoft.CupOfTea;
import example.coffeeMachine.coffeeMachineSoft.Inning;
import example.soft.CreateReport;
import example.soft.TurnOff;
import example.soft.TurnOn;

public class CoffeeMachine implements TurnOff, TurnOn, CreateReport {
    private int number;

    public static Cup makeCoffee(String order) {
        if ("coffee".equalsIgnoreCase(order)) {
            return new CupOfCoffee();
        } else if ("tea".equalsIgnoreCase(order)) {
            return new CupOfTea();
        } else {
            throw new RuntimeException(order + " unknown");
        }
    }

    public void turnOff() {
        System.out.println("CoffeeMachine is working");
    }

    public void turnOn() {
        System.out.println("CoffeeMachine is stopping");
    }

    public void doReport() {
        System.out.println("CoffeeMachine's number is " + number);
    }
}
