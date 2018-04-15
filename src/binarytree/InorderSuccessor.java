package binarytree;

/*1) If right subtree of node is not NULL, then succ lies in right subtree. Do following.
Go to right subtree and return the node with minimum key value in right subtree.
2) If right sbtree of node is NULL, then succ is one of the ancestors. Do following.
Travel up using the parent pointer until you see a node which is left child of it’s parent. The parent of such a node is the succ.*/

public class InorderSuccessor {

	public static void main(String[] args) {
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		Node temp = tree.root.left.right.right;
		Node suc = inOrderSuccessor(tree.root, temp);
		if (suc != null) {
            System.out.println("Inorder successor of " + temp.data + 
                                                      " is " + suc.data);
        } else {
            System.out.println("Inorder successor does not exist");
        }
	}

	private static Node inOrderSuccessor(Node root, Node n) {
		// step 1 of the above algorithm 
        if (n.right != null) {
            return minValue(n.right);
        }
 
        // step 2 of the above algorithm
        Node p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
	}

	private static Node minValue(Node right) {
		Node current = node;
		 
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
	}

}
