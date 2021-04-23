package example.phoneBoth;

import example.soft.TurnOff;
import example.soft.TurnOn;

public class PhoneBoth implements TurnOff, TurnOn {
    private int number;

    public void turnOff() {
        System.out.println("PhoneBoth is working");
    }

    public void turnOn() {
        System.out.println("PhoneBoth is stopping");
    }
}
