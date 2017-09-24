package linkedlist;

public class ReverseSecondHalfOfLL 
{
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


        LNode res = reverse(node1);

        LNode node = node1;
        while (node != null)
        {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static LNode reverse(LNode start)
    {   
        int counter = 0;
        LNode node = start;
        LNode pre = start;

        while (node!= null)// for count how many elements in linked list
        {
            counter += 1;
            node = node.next;           
        }

        for (int i=0; i< (counter / 2) ; i++)//no matter counter is even or odd, when it divided by 2, the result is even
        {   
            pre = start;
            start = start.next; 
        }


        LNode temp = null;
        LNode preNext = null;// this variable is used to track the next val behind pre
        // for example, 2->1->3->4->5->6->7->8
        // at this moment, pre:4, start:5
        // I treated 5->6->7->8 as an independent linkedlist
        // I reversed the linkedlist 
        // Finally, set the pre node's next value to the reversed linkedlist's head
        // The first half and second half have been connected together


        while (start != null)
        {
            temp = start.next;
            start.next = preNext;
            preNext = start;
            start = temp;
        }
        pre.next = preNext;

        return start;

    }
}