//print sum of 2 digit using Funtion & Method concept

import java.util.*;

public class a26 {
    public static int calculateSUm(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int sum = calculateSUm(a, b);
            System.out.println("Sum of 2 digit is:" + sum);
        }
    }
}