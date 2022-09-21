package Ki36_Basko_Lab4;

public class Button {
    /**
     * Work status
     */

    private boolean isOn;

    /**
     * Constructor
     */

    public Button() {
    }

    /**
     * Constructor
     * @param isOn
     */

    public Button(boolean isOn) {
        this.isOn = isOn;
    }

    /**
     * Get work status
     * @return
     */
    public boolean isOn() {
        return isOn;
    }

    /**
     * Set work status
     * @param on
     */
    public void setOn(boolean on) {
        isOn = on;
    }
}
