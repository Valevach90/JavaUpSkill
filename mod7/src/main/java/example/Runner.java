package example;

import example.device.CoffeeMachine;
import example.device.Printer;
import example.device.TelephoneBoth;
import example.marcers.Device;
import example.service.ControlSystem;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Device> deviceQuantity = new ArrayList<Device>();
        ControlSystem controlSystem = new ControlSystem(deviceQuantity);
        Device coffeeMachine = new CoffeeMachine(1,false);
        Device printer = new Printer(2,false);
        Device telephoneBoth = new TelephoneBoth(3,false);
        controlSystem.addDevice(coffeeMachine);
        controlSystem.addDevice(printer);
        controlSystem.addDevice(telephoneBoth);
        controlSystem.switchStatus(coffeeMachine,true);

    }
}
