package example.service;

import example.marcers.IDevice;

public interface IControlService {
    boolean addDevice(IDevice device);
    boolean removeDevice(IDevice device);


}
