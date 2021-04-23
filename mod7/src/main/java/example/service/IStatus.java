package example.service;

import example.marcers.Device;

public interface IStatus {
    boolean showStatus(Device device);
    boolean switchStatus(Device device,boolean switchStatus);
}
