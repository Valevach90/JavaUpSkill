package example.device;

import example.controlElement.Device;
import example.marcers.IDevice;
import example.service.IColl;

public class TelephoneBoth extends Device implements IDevice, IColl {
    public TelephoneBoth(int number, boolean isWorking) {
        super(number, isWorking);
    }
    
    public TelephoneBoth makeColl() {
        return null;
    }
}
