//2D Array -> print the array required

import java.util.*;

public class a34 {
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
            //output
            for (int i=0; i<rows; i++) {
                for (int j=0; j<cols; j++) {
                    System.out.println(numbers[i][j] + " ");
                }
            }
        }
    }
}