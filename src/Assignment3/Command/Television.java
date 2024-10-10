package Assignment3.Command;

/**
 * The Television class represents the receiver in the Command pattern.
 * It contains the logic to perform various actions like turning on/off,
 * adjusting volume, and changing channels.
 */
public class Television {

    public void turnOn() {
        System.out.println("Television is turned on");
    }

    public void turnOff() {
        System.out.println("Television is turned off");
    }

    public void volumeUp() {
        System.out.println("Television volume up");
    }

    public void volumeDown() {
        System.out.println("Television volume down");
    }

    public void nextChannel() {
        System.out.println("Television next channel");
    }

    public void prevChannel() {
        System.out.println("Television previous channel");
    }
}
