package binarytree;

public class CheckIfBST {
	public static void main (String args[]) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		System.out.println(isBST(tree.root));
	}

	private static boolean isBST(Node root) {
		return isBSTUtil(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private static boolean isBSTUtil(Node node, int maxValue, int minValue) {
		/* base case - empty tree is BST */
		if (node == null)
			return true;
		/* false if this node violates the min/max constraints */
		if (node.data < minValue || node.data > maxValue)
			return false;
		/* otherwise check the subtrees recursively
        tightening the min/max constraints */
		return (isBSTUtil(node.left, minValue, node.data - 1) && isBSTUtil(node.right, node.data + 1, maxValue));
	}
}
