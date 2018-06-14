import java.util.*;

class Day8 {
	
    public static void main(String []args){
    	HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            System.out.println(phonebook.get(s));
        }
        in.close();
    }
}