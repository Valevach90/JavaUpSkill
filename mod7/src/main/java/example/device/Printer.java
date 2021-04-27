package example.device;

import example.controlElement.Device;
import example.marcers.IDevice;
import example.service.IPrint;

public class Printer extends Device implements IDevice, IPrint {
    public Printer(int number, boolean isWorking) {
        super(number, isWorking);
    }

    @Override
    public boolean isWorking() {
        return super.isWorking();
    }

    public Printer makePrint() {
        return null;
    }
}
