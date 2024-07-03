//multiply the number to the parameter defined(table)

import java.util.*;

public class a15 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i=1; i<11; i++) {
                System.out.println(i*n);
            }
        }
    }
}