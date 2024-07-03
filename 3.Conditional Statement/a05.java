//if else -> even or odd 

import java.util.Scanner;

public class a05 {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();

            if ( x % 2 == 0){
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }
}