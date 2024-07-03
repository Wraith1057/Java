//find greater number

import java.util.Scanner;

class a09 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the 1st num: ");
            int a = scanner.nextInt();

            System.out.print("Enter the 2nd num: ");
            int b = scanner.nextInt();

            System.out.print("Enter the 3rd num: ");
            int c = scanner.nextInt();
   

            if (a > b && a > c) {
                System.out.println(a);
            }
            else if (b > c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
}
