package Ki36_Basko_Lab3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Monitor {
    /**
     * new Button
     */
    Button button;
    /**
     * new Matrix
     */
    Matrix matrix;
    /**
     * new Stand
     */
    Stand stand;
    /**
     * new PrintWriter
     */
    PrintWriter printWriter;

    /**
     * Constructor
     */

    public Monitor() {
        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Constructor
     * @param button
     * @param matrix
     */
    public Monitor(Button button, Matrix matrix) {
        this.button = button;
        this.matrix = matrix;
        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Constructor
     * @param button
     * @param matrix
     * @param stand
     */
    public Monitor(Button button, Matrix matrix, Stand stand) {
        this.button = button;
        this.matrix = matrix;
        this.stand = stand;

        try {
            this.printWriter = new PrintWriter("Log.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Method for turning on monitor
     */
    public void turnOn(){
        if(button.isOn() == false) {
            button.setOn(true);
            System.out.println("Turning on!");
            printWriter.println("Turning on!");
            printWriter.flush();
        }
    }

    /**
     * Method for turning off monitor
     */
    public void turnOff(){
        if(button.isOn() == true) {
        button.setOn(false);
        System.out.println("Turning off!");
        printWriter.println("Turning off!");
        printWriter.flush();
        }
    }

    /**
     * Method for adding brightness of monitor
     */
    public void addBrightness(){
        if(matrix.getCurrentBrightness() != matrix.getMaxBrightness()){
            matrix.setCurrentBrightness(matrix.getCurrentBrightness() + 1);
            System.out.println("Adding brightness!");
            printWriter.println("Adding brightness!");
            printWriter.flush();
        }
    }

    /**
     * Method for reducing brightness of monitor
     */
    public void reduceBrightness(){
        if(matrix.getCurrentBrightness() != 0){
            matrix.setCurrentBrightness(matrix.getCurrentBrightness() - 1);
            System.out.println("Reducing brightness!");
            printWriter.println("Reducing brightness!");
            printWriter.flush();
        }
    }

    /**
     * Method for screwing stand to monitor
     */
    public void screwStand(){
        if(!stand.isExists()){
            stand.setExists(true);
            System.out.println("Screwing stand!");
            printWriter.println("Screwing stand!");
            printWriter.flush();
        }
    }

    /**
     * Method for unscrewing stand to monitor
     */
    public void unscrewStand(){
        if(stand.isExists()){
            stand.setExists(false);
            System.out.println("Unscrewing stand!");
            printWriter.println("Unscrewing stand!");
            printWriter.flush();
        }
    }

    /**
     * Method for lifting up monitor
     */
    public void liftStandUp(){
        System.out.println("Lifting stand up!");
        printWriter.println("Lifting stand up!");
        printWriter.flush();
    }

    /**
     * Method for lifting down monitor
     */
    public void liftStandDown(){
        System.out.println("Lifting stand down!");
        printWriter.println("Lifting stand down!");
        printWriter.flush();
    }

    /**
     * Method for switching output port
     */
    public void switchOutputPort(){
        System.out.println("Switching output port!");
        printWriter.println("Switching output port!");
        printWriter.flush();
    }

    /**
     * Method for hanging monitor on the bracket
     */
    public void hangOnBracket(){
        if(stand.isExists()){
            stand.setExists(false);
            System.out.println("Hanging monitor on the bracket!");
            printWriter.println("Hanging monitor on the bracket!");
            printWriter.flush();
        }
    }

    /**
     * Method to close file
     */
    public void closePrintWriter(){
        printWriter.println("Closing file");
        printWriter.flush();
        printWriter.close();
    }
}
