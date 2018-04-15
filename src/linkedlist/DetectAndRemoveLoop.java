package linkedlist;

public class DetectAndRemoveLoop {

	public static void main(String[] args) 
    {       
        LNode node1 = new LNode(1);
        LNode node2 = new LNode(2);
        LNode node3 = new LNode(3);
        LNode node4 = new LNode(4);
        LNode node5 = new LNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        boolean loop = detectAndRemoveLoop(node1);
        if (loop)
        	System.out.println("Loop detected and removed");
        else
        	System.out.println("Loop not detected");
    }
	

	//Detect loop in singly linked list
	static boolean detectAndRemoveLoop (LNode head) {
		LNode slowPtr = head;
		LNode fastPtr = head;
	    while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
	        slowPtr = slowPtr.next;
	        fastPtr = fastPtr.next.next;
	        if (slowPtr == fastPtr) {
	           removeLoop(slowPtr, head);
	           return true;
	        }
	    }
	    return false;
	}

	static void removeLoop (LNode loop, LNode head) {
		LNode ptr1 = loop;
		LNode ptr2 = loop;
		int count = 1;
		while (ptr1.next != ptr2) {
			ptr1 = ptr1.next;
			count ++;
		}
		ptr1 = head;
		ptr2 = head;
		for (int i = 0; i < count; i ++)
			ptr2 = ptr2.next;
		while (ptr2 != ptr1) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		ptr2 = ptr2.next;
		//found loop starting node
		while (ptr2.next != ptr1) {
			ptr2 = ptr2.next;
		}
		ptr2.next = null;
		
	}

}
