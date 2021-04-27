package example.service;

import example.marcers.IDevice;

public interface IStatus {
    boolean showStatus(IDevice device);
    boolean switchStatus(IDevice device, boolean switchStatus);
}
