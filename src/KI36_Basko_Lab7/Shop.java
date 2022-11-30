package KI36_Basko_Lab7;

/**
 * Class Shop that implements interface Room
 */
public class Shop implements Room //клас, який реалізує заданий інтерфейс
{
    private double area;
    private int floor;

    public static int count;
    /**
     * Constructor
     * @param area
     * @param floor
     */
    public Shop(double area, int floor)
    {
        count++;
        this.area = area;
        this.floor = floor;
    }

    /**
     * Overrided method getArea
     * @return area
     */
    @Override
    public double getArea()
    {
        return area;
    }

    /**
     *Overrided method PrintInfo
     */
    @Override
    public void PrintInfo()
    {
        System.out.println("Shop: -area: " + area + "; -floor: " + floor + ";");
    }

    /**
     * Setter for area
     * @param area
     */
    public void setArea(double area)
    {
        this.area = area;
    }

    /**
     * Getter for floor
     * @return floor
     */
    public int getFloor()
    {
        return floor;
    }

    /**
     * Setter for floor
     * @param floor
     */
    public void setFloor(int floor)
    {
        this.floor = floor;
    }

}
