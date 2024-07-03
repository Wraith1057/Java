//addition of 3 number54

import java.util.Scanner;

class a10 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the 1st num: ");
            int a = scanner.nextInt();

            System.out.print("Enter the 2nd num: ");
            int b = scanner.nextInt();

            System.out.print("Enter the 3rd num: ");
            int c = scanner.nextInt();

            System.out.println("Sum of all 3 values is: " + (a+b+c));
        
        }
    }
}
