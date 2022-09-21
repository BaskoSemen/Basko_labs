package Ki36_Basko_Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Клас Lab2_Basko_ki36 реалізує приклад програми до лабораторної роботи №2
 *
 * @author Semen Basko
 * @version 1.0
 * @since version 1.0
 *
 */
public class Lab2_Basko_ki36 {
    /**
     * The static main method is the entry point to the program
     *
     * @param args
     *
     */
    public static void main(String[] args) {
        int nRows;
        char[][] arr;
        String filler;

        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = null;
        try {
            fout = new PrintWriter(dataFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Enter array size: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        for(int i = 0; i < nRows; i++)
        {
            arr[i]= new char[nRows];
        }

        System.out.print("Enter symbol: ");
        filler = in.nextLine();

        if(filler.length() != 1){
            System.out.println("Less or more than 1 symbol");
            return;
        }

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
        }

        for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(nRows % 2 == 0){
                    if(i >= (nRows / 2) && j < (nRows / 2)){
                        arr[i][j] = Character.valueOf( ' ');
                    }

                    if(i < (nRows / 2) && j >= (nRows / 2)){
                        arr[i][j] = Character.valueOf( ' ');
                    }
                    }
                    else{
                        if(i > (nRows / 2) && j < (nRows / 2)){
                            arr[i][j] = Character.valueOf( ' ');
                        }
                        if(i < (nRows / 2) && j > (nRows / 2)){
                            arr[i][j] = Character.valueOf( ' ');
                        }
                    }
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
