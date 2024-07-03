//switch case 

import java.util.*;

public class a07 {
    public static void main(String arg[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

            switch (button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.out.println("Nameste");
                case 3 -> System.out.println("Konichiva");
                default -> System.out.println("Invalid button");
            }
        }
    }
}

// import java.util.*;

// public class a07 {
//     public static void main(String arg[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int button = sc.nextInt();

//             if(button == 1) {
//                 System.out.println("Hello");
//             } 
//             else if(button == 2) {
//                 System.out.println("Nameste");
//             }
//             else if(button == 3) {
//                 System.out.println("Konichiva");
//             }
//             else {
//                 System.out.println("Invalid button");
//             }
//         }
//     }
// }