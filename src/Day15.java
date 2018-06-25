import java.util.*;

public class Day15 {

    public static  Day15Support insert(Day15Support head,int data) {
        Day15Support first = head;
        Day15Support newDay15Support = new Day15Support(data); 
        if(head == null) {
            return newDay15Support;
        }
        while(head.next != null) {
            head = head.next;
        }
        head.next = newDay15Support;
        return first;
    }
    
	public static void display(Day15Support head) {
        Day15Support start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Day15Support head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
