package example.service;

import example.marcers.Device;

import java.util.List;
import java.util.logging.Logger;

public class ControlSystem implements InteractionDeviceToControlSystem, IStatus {
    private List<Device> deviceQuantity;
    Logger LOGGER;

    public ControlSystem(List<Device> deviceQuantity) {
        this.deviceQuantity = deviceQuantity;
    }
    public  void showLoggerMessage(Device device){
       if(!showStatus(device)||!addDevice(device)||!removeDevice(device)){
           LOGGER.info(device+" unknown");
       }
    }

    public boolean showStatus(Device device) {
        return true;
    }

    public boolean switchStatus(Device device, boolean switchStatus) {
        return true;
    }


    public boolean addDevice(Device device) {
        return true;
    }

    public boolean removeDevice(Device device) {
        return true;
    }
}
