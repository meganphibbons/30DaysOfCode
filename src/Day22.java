public class Day22 {
	public static int getHeight(Node root){
		if(root == null || root.left == null && root.right == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}  
	}
}
