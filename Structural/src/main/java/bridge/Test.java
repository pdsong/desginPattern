package bridge;

import bridge.devices.Device;
import bridge.devices.Radio;
import bridge.devices.Tv;
import bridge.remotes.AdvancedRemote;
import bridge.remotes.BasicRemote;

public class Test {
    public static void main(String[] args) {
        testDevice(new Tv());
//        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("test with basice remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("test with advanced remote");
        AdvancedRemote advancedRemote=new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
        advancedRemote.channelUp();
        advancedRemote.volumeUp();
        device.printStatus();


    }
}
