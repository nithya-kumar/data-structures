package binarytree;

public class HeightOfBTree {
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		System.out.println(getHeight(tree.root));
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
