package example.phoneBoth;

import example.soft.ICreateReport;
import example.soft.ITurnOff;
import example.soft.ITurnOn;

public class PhoneBoth implements ITurnOff, ITurnOn, ICreateReport {
    private int number;

    public void turnOff() {
        System.out.println("PhoneBoth is working");
    }

    public void turnOn() {
        System.out.println("PhoneBoth is stopping");
    }

    public void doReport() {
        System.out.println("PhoneBoth's number is "+number);
    }
}
