import java.util.*;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        try {
        	System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e) {
        	System.out.println("Bad String");
        }
    }
}