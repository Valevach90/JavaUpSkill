package example.device;

import example.controlElement.DeviceStatus;
import example.marcers.Device;

public class CoffeeMachine extends DeviceStatus implements Device {

    public CoffeeMachine(int number, boolean isWorking) {
        super(number, isWorking);
    }
}
