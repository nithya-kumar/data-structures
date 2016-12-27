package binarytree;

public class BinarySearchTreeImpl {
	Node root;
	
	BinarySearchTreeImpl(int key) {
		root = new Node(key);
	}
	
	BinarySearchTreeImpl() {
		root = new Node (10);
		insert(root, 6);
		insert(root, 12);
		insert(root, 3);
		insert(root, 8);
		insert(root, 11);
		insert(root, 15);
		insert(root, 25);
	}
	
	public void insert (Node node, int key) {
		if (key < node.data) {
			if (node.left != null) {
				insert(node.left, key);
			} else {
				node.left = new Node(key);
			}
		} else {
			if (node.right != null) {
				insert(node.right, key);
			} else {
				node.right = new Node(key);
			}
		}
	}
	
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		System.out.println("Traversing tree inorder...");
		printInOrder (tree.root);
		System.out.println("Traversing tree preorder...");
		printPreOrder (tree.root);
		System.out.println("Traversing tree postorder...");
		printPostOrder (tree.root);
	}

	private static void printPostOrder(Node node) {
		if (node != null) {
			printPostOrder(node.left);			
			printPostOrder(node.right);
			System.out.println(" Traversed " + node.data);
		}
	}

	private static void printInOrder(Node node) {
		if (node != null) {
			printInOrder(node.left);
			System.out.println(" Traversed " + node.data);
			printInOrder(node.right);
		}
	}
	
	private static void printPreOrder(Node node) {
		if (node != null) {
			System.out.println(" Traversed " + node.data);
			printPreOrder(node.left);			
			printPreOrder(node.right);
		}
	}
}
