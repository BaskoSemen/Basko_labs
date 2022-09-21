package Ki36_Basko_Lab3;

public class Matrix {

    /**
     * Maximum of allow Brightness
     */
    private int maxBrightness;
    /**
     * Current Brightness
     */
    private int currentBrightness;

    /**
     * Expansion of matrix
     */
    private String expansion;

    /**
     * Constructor
     */

    public Matrix() {
    }

    /**
     * Constructor
     * @param maxBrightness
     * @param currentBrightness
     * @param expansion
     */
    public Matrix(int maxBrightness, int currentBrightness, String expansion) {
        this.maxBrightness = maxBrightness;
        this.currentBrightness = currentBrightness;
        this.expansion = expansion;
    }

    /**
     * Get Current Brightness
     * @return
     */
    public int getCurrentBrightness() {
        return currentBrightness;
    }

    /**
     * Set Current Brightness
     * @param currentBrightness
     */
    public void setCurrentBrightness(int currentBrightness) {
        this.currentBrightness = currentBrightness;
    }

    /**
     * Get maximum of allow brightness
     * @return
     */
    public int getMaxBrightness() {
        return maxBrightness;
    }

    /**
     * Set maximum of allow brightness
     * @param maxBrightness
     */
    public void setMaxBrightness(int maxBrightness) {
        this.maxBrightness = maxBrightness;
    }

    /**
     * Get expansion of monitor
     * @return
     */
    public String getExpansion() {
        return expansion;
    }

    /**
     * Set expansion of monitor
     * @param expansion
     */
    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }
}
