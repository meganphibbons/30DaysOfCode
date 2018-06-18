import java.util.*;

public class Day10 {
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        StringBuilder binary = new StringBuilder("");
        while(n > 0) {
        	int digit = n % 2;
        	n /= 2;
        	binary.append(digit);
        }
        String bin = binary.reverse().toString();
        int maxNum = 0;
        for(int i = 0; i < bin.length(); i++) {
        	int count = 0;
        	while(i != bin.length() && bin.charAt(i) == '1') {
        		count++;
        		i++;
        		if(maxNum < count) {
        			maxNum = count;
        		}
        	}
        }
        System.out.println(maxNum);
    }
}
