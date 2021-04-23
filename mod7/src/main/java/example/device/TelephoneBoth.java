package example.device;

import example.controlElement.DeviceStatus;
import example.marcers.Device;

public class TelephoneBoth extends DeviceStatus implements Device {
    public TelephoneBoth(int number, boolean isWorking) {
        super(number, isWorking);
    }
}
