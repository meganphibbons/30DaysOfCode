import java.util.Scanner;

public class Day20 {	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        Day20 calculate = new Day20();
        int[] vals = calculate.numFirstLast(a);
        System.out.println("Array is sorted in " + vals[0] + " swaps.");
        System.out.println("First Element: " + vals[1]);
        System.out.println("Last Element: " + vals[2]);
    }
    
    public int[] numFirstLast(int[] a) {
    	int totSwaps = 0;
    	for (int i = 0; i < a.length; i++) {
    	    // Track number of elements swapped during a single array traversal
    	    int numberOfSwaps = 0;
    	    
    	    for (int j = 0; j < a.length - 1; j++) {
    	        // Swap adjacent elements if they are in decreasing order
    	        if (a[j] > a[j + 1]) {
    	            a = swap(a, j, j + 1);
    	            numberOfSwaps++;
    	        }
    	    }
    	    totSwaps+= numberOfSwaps;
    	    // If no elements were swapped during a traversal, array is sorted
    	    if (numberOfSwaps == 0) {
    	        break;
    	    }
    	}
    	int[] retVal = new int[3];
    	retVal[0] = totSwaps;
    	retVal[1] = a[0];
    	retVal[2] = a[a.length - 1];
    	return retVal;
    }
    
    private int[] swap(int[] a, int x, int y) {
    	int tempX = a[x];
    	int tempY = a[y];
    	a[y] = tempX;
    	a[x] = tempY;
    	return a;
    }

}
