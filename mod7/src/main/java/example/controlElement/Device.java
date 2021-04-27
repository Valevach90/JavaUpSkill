package example.controlElement;

public  abstract class Device {
    int number;
    boolean isWorking;

    public Device(int number, boolean isWorking) {
        this.number = number;
        this.isWorking = isWorking;
    }

    public int getNumber() {
        return number;
    }

    public boolean isWorking() {
        return isWorking;
    }
}
