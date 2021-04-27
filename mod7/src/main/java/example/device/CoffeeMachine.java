package example.device;

import example.controlElement.Device;
import example.marcers.IDevice;
import example.service.ICoffee;

public class CoffeeMachine extends Device implements IDevice, ICoffee {

    public CoffeeMachine(int number, boolean isWorking) {
        super(number, isWorking);
    }

    public CoffeeMachine makeCoffee() {
        return null;
    }
}
