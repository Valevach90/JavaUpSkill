package example.coffeeMachine;

import example.coffeeMachine.coffeeMachineSoft.ICup;
import example.coffeeMachine.coffeeMachineSoft.CupOfCoffee;
import example.coffeeMachine.coffeeMachineSoft.CupOfTea;
import example.soft.ICreateReport;
import example.soft.ITurnOff;
import example.soft.ITurnOn;

public class CoffeeMachine implements ITurnOff, ITurnOn, ICreateReport {
    private int number;

    public static ICup makeCoffee(String order) {
        if ("coffee".equalsIgnoreCase(order)) {
            return new CupOfCoffee();
        } else if ("tea".equalsIgnoreCase(order)) {
            return new CupOfTea();
        } else {
            throw new RuntimeException(order + " unknown order");
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
