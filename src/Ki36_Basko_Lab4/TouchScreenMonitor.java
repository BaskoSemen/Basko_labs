package Ki36_Basko_Lab4;

public class TouchScreenMonitor extends Monitor implements TouchScreen{
    /**
     * Constructor
     */

    public TouchScreenMonitor() {
    }

    /**
     * Constructor
     * @param button
     * @param matrix
     */

    public TouchScreenMonitor(Button button, Matrix matrix) {
        super(button, matrix);
    }

    /**
     * Constructor
     * @param button
     * @param matrix
     * @param stand
     */
    public TouchScreenMonitor(Button button, Matrix matrix, Stand stand) {
        super(button, matrix, stand);
    }

    /**
     * Implementing method that help touch screen
     */
    @Override
    public void touchScreenFeatures() {
        System.out.println("Touching screen by finger!");
        printWriter.println("Touching screen by finger!");
        printWriter.flush();
    }
}
