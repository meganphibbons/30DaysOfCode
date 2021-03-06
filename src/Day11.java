import java.util.*;

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < arrRowItems.length; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
            if(arrRowItems.length < 6) {
            	for(int j = arrRowItems.length; j < 6; j++) {
            		arr[i][j] = 0;
            	}
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int r = 0; r < 4; r++) {
        	for(int c = 0; c < 4; c++) {
        		currSum = arr[r][c] + arr[r][c + 1] + arr[r][c + 2] + arr[r + 1][c + 1] + arr[r + 2][c] + arr[r + 2][c + 1] + arr[r + 2][c + 2];
        		if(currSum > maxSum) {
        			maxSum = currSum;
        		}
        	}
        }
        
        System.out.println(maxSum);

        scanner.close();
    }
}