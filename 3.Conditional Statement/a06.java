//nested - if else -> equal, grater or lesser

import java.util.*;

public class a06 {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

                if (a == b) {
                    System.out.println("Equal");
                }
                else {
                if (a > b){
                    System.out.println("a is greater");
                }
                else {
                    System.out.println("a is lesser");
                }
            }
        }
    }
}
