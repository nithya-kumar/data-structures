package linkedlist;

public class MinNodeElement {
	public static void main(String[] args) 
    {       
        LNode node1 = new LNode(2);
        LNode node2 = new LNode(1);
        LNode node3 = new LNode(3);
        LNode node4 = new LNode(4);
        LNode node5 = new LNode(5);
        LNode node6 = new LNode(6);
        LNode node7 = new LNode(7);
        LNode node8 = new LNode(8);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;


        int min = minElement(node1);
        System.out.println(min);
        int max = maxElement(node1);
        System.out.println(max);
    }

    public static int minElement(LNode start)
    {   
        int min = Integer.MAX_VALUE;
        while(start != null) {
        	if (min > start.val)
        		min = start.val;
        	start = start.next;
        }        	
        return min;

    }
    
    public static int maxElement(LNode start)
    {   
        int max = Integer.MIN_VALUE;
        while(start != null) {
        	if (max < start.val)
        		max = start.val;
        	start = start.next;
        }        	
        return max;

    }
}
