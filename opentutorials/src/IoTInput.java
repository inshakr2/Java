import org.opentutorials.iot.*;
import javax.swing.*;

public class IoTInput {
    public static void main(String[] args) {

        String My_ID = JOptionPane.showInputDialog("Input Your Addr :");
        String bright = JOptionPane.showInputDialog("Set Your Lamp Bright :");
        //String My_ID = args[0];
        //String bright = args[1];

        // Elevator call
        Elevator myElevator = new Elevator(My_ID);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(My_ID);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(My_ID + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(My_ID + " / floorLamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights(My_ID + "moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();


    }
}
