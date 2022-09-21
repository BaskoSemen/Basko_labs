package Ki36_Basko_Lab4;

public class Stand {

    /**
     * Work status
     */
    private boolean isExists;

    /**
     * Constructor
     */

    public Stand() {
    }

    /**
     * Constructor
     * @param isExists
     */
    public Stand(boolean isExists) {
        this.isExists = isExists;
    }

    /**
     * Get work status
     * @return
     */
    public boolean isExists() {
        return isExists;
    }

    /**
     * Set work status
     * @param exists
     */
    public void setExists(boolean exists) {
        isExists = exists;
    }
}
