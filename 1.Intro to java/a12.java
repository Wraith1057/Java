//adding values by taking input from user

import java.util.*;

public class a12 {
    public static void main(String a[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int m,n;
            System.out.print("Enter 2 number:");
            m = sc.nextInt();
            n = sc.nextInt();

            System.out.println("sum = " + (m+n));
        }
    }
}
