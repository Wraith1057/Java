//if else -> age

import java.util.*;

public class a04 {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if(age > 18) {
                System.out.println("Adult");
            }
            else {
                System.out.println("Not Adult");
            }
        }
        
    }
}