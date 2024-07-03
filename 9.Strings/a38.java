//String -> concatenation

public class a38 {
    public static void main(String args[]) {
        String fname = "Tony";
        String lname = "Stark";
        String fullname = fname + "@" + lname;
        //Tony@Stark
        System.out.println(fullname);  
        System.out.println(fullname.length());

        //charAt
        for (int i=0; i<fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
