package binarytree;

public class LevelOrderTraversal {
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		levelOrderTraversal(tree.root);
	}

	private static void levelOrderTraversal(Node root) {
		int height = getHeight(root);
		for (int level = 1; level <= height; level++) {
			printLevel (root, level);
		}
	} 
	private static void printLevel(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.data + ",");
		}
		else {
			printLevel(root.left, level - 1);
			printLevel (root.right, level - 1);
		}
		
	}

	private static int getHeight(Node root) {
		if (root == null) {
            return 0;
        }
        else {
	        int leftHeight = getHeight(root.left);
	        int rightHeight = getHeight(root.right);
            if (leftHeight > rightHeight) {
                return (leftHeight + 1);
            } else {
               return (rightHeight + 1);
            }
        }
	}
}
