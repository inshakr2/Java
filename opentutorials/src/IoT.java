import org.opentutorials.iot.*;

public class IoT {
    public static void main(String[] args) {

        String My_ID = "CHANY APT 136";

        // Elevator call
        Elevator myElevator = new Elevator(My_ID);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(My_ID);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(My_ID + " / Hall Lamp");

        Lighting floorLamp = new Lighting(My_ID + " / floorLamp");


    }
}
