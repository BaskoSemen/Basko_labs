package Ki36_Basko_Lab5;

/**
 * Class calculator that have only one method
 */
public class Calculator {
    /**
     * Method that calculate by own formula
     * @param x
     * @return result of formula
     */
    public double calculate(double x){
        if(x == 0) throw new RuntimeException("Trying to devide by zero");
        return (Math.cos(x) / Math.sin(x)) / Math.tan(x);
    }
}
