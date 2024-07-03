//String -> print your name

import java.util.Scanner;

//String

public class a37 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Your name is: " + name);
        }
    }
}
