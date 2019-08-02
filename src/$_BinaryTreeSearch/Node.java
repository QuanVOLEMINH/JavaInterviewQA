package $_BinaryTreeSearch;

public class Node {
	int value;
	Node left, right;

	Node() {
		this.value = 0;
		this.left = null;
		this.right = null;
	}

	Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}

	Node(int value, Node l, Node r) {
		this.value = value;
		this.left = l;
		this.right = r;
	}

	Node find(int v) {
		Node current = this;
		while (current != null) {
			if (v == current.value) {
				return current;
			}

			current = v < current.value ? current.left : current.right;
		}
		return null;

	}

	@Override
	public String toString() {
		String result = "";
		result += this.value + "\n";
//		result += "|    |";
		String l = this.left == null ? "" : this.left.toString();
		String r = this.right == null ? "" : this.right.toString();
		result += l + "--" + r;
		return result;
	}
}
