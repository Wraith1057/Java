//print name by giving as input using Funtion & Method concept

import java.util.*;

public class a25 {
    public static int printMyName(String name) {
        System.out.println(name);
        return 0;
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            printMyName(name);
        }
    }
}
