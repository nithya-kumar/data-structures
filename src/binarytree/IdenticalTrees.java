package binarytree;
// To check if a binary tree is sub tree of another binary tree **/

public class IdenticalTrees {
	public static void main (String args[]) {
		BinarySearchTreeImpl T = new BinarySearchTreeImpl();
		BinarySearchTreeImpl S = new BinarySearchTreeImpl();
		boolean isSubTree = checkSubTree(T.root, S.root);
		System.out.print("Is sub tree: " + isSubTree);
	}

	private static boolean checkSubTree(Node T, Node S) {
		if (S == null) {
			return true;
		}
		if (T == null) {
			return false;
		}
		if (areIdentical(T, S)) {
			return true;
		}
		return checkSubTree(T.left, S) || checkSubTree(T.right, S);
	}

	private static boolean areIdentical(Node T, Node S) {
		if (T == null && S == null) {
			return true;
		}
		if (T == null || S == null) {
			return false;
		}
		return (T.data == S.data && areIdentical(T.left, S.left) && areIdentical(T.right, S.right));
	}
}
