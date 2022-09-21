/**
 * lab3 package
 */
package Ki36_Basko_Lab3;

/**
 * Ki36_Basko_Lab3 class implements main method for Rifle
 class possibilities demonstration
 * @author Semen Basko
 * @version 1.0
 */
public class Ki36_Basko_Lab3 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(new Button(false),new Matrix(100,85,"Full HD"),new Stand(true));
        monitor.turnOn();
        monitor.turnOn();
        monitor.liftStandUp();
        monitor.hangOnBracket();
        monitor.reduceBrightness();
        monitor.reduceBrightness();
        monitor.closePrintWriter();
    }
}
