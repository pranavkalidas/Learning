package linkedList;

public class GenerateList {
    public static Node generateList(int[] arr){

        Node head = new Node();
        Node curr = head;

        for(int i: arr){
            Node temp = new Node(i);
            curr.next = temp;
            curr = temp;
        }

        return head.next;

//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        Node node4 = new Node(4);
//        Node node5 = new Node(5);
//        Node node6 = new Node(6);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        node5.next=node6;


    }
}
