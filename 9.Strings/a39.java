//String -> comparision

public class a39 {
    public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";

        //1. s1 < s2 -> -ve value
        //2. s1 = s2 -> = value
        //3. s1 > s2 -> +ve value

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}
