package example.device;

import example.controlElement.DeviceStatus;
import example.marcers.Device;

public class Printer extends DeviceStatus implements Device {
    public Printer(int number, boolean isWorking) {
        super(number, isWorking);
    }
}
