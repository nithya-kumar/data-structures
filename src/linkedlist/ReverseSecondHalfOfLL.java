package linkedlist;

public class ReverseSecondHalfOfLL {
	public static void main(String args[]) {
		LNode node1 = new LNode (2);
		LNode node2 = new LNode (3);
		LNode node3 = new LNode (6);
		LNode node4 = new LNode (1);
		LNode node5 = new LNode (4);
		LNode node6 = new LNode (8);
		LNode node7 = new LNode (9);
		LNode node8 = new LNode (7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		
		LNode node = reverse(node1);
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	private static LNode reverse(LNode node) {
		
		LNode prev = null;
		LNode next = null;
		LNode current = node;
		
		if (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
}
