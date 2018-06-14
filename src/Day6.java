import java.util.*;

public class Day6 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int numInputs = scan.nextInt();
    	for(int i = 0; i < numInputs; i++) {
    		String s = scan.next();
    		String even = "";
    		String odd = "";
    		for(int j = 0; j < s.length(); j++) {
    			if(j % 2 == 0) {
    				even += s.charAt(j);
    			} else {
    				odd += s.charAt(j);
    			}
    		}
    		System.out.println(even + " " + odd);
    	}
    	scan.close();
    }
}