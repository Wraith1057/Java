//2D Array -> Take a metrics as input from the user search for given 
//            number X and print the indices at which it occurs.

import java.util.*;

public class a35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();


            int[][] numbers = new int[rows][cols];
            //input
            //rows
            for (int i=0; i<rows; i++) {
                //columns
                for (int j=0; j<cols; j++) {
                    numbers[i][j] =  sc.nextInt();
                }
            }

            int x = sc.nextInt();

            //output
            for (int i=0; i<rows; i++) {
                for (int j=0; j<cols; j++) {
                    if (numbers[i][j] == x) {
                        System.out.println("x found at location (" + i + "," + j + ")");
                    }
                }
            }
        }
    }
}