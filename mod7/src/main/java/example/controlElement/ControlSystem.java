package example.controlElement;

import example.marcers.IDevice;
import example.service.IControlService;
import example.service.IStatus;

public class ControlSystem implements IStatus, IControlService {
    public boolean addDevice(IDevice device) {
        return false;
    }

    public boolean removeDevice(IDevice device) {
        return false;
    }

    public boolean showStatus(IDevice device) {
        return false;
    }

    public boolean switchStatus(IDevice device, boolean switchStatus) {
        return false;
    }
}
