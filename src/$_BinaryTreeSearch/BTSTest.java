package $_BinaryTreeSearch;

public class BTSTest {
	public static void main(String[] args) {
		Node n = new Node(100);
		n.left = new Node(75, new Node(12), null);
		n.right = new Node(120, new Node(88), new Node(130));
		
		System.out.println(n);
		
		System.out.println(n.find(88));
	}
}
