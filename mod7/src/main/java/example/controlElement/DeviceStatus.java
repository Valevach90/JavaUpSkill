package example.controlElement;

public  abstract class DeviceStatus {
    int number;
    boolean isWorking;

    public DeviceStatus(int number, boolean isWorking) {
        this.number = number;
        this.isWorking = isWorking;
    }
}
