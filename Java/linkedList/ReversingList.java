package linkedList;

public class ReversingList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        //int[] arr = {1};
        Node head = GenerateList.generateList(arr);
        int left = 3;
        int right = 6;

        Node leftPrev = new Node(0,head);
        Node curr = head;

        // Make curr read the left node

        while(curr.val!=left){
            leftPrev = curr;
            curr = curr.next;
        }

        // Reverse the linked list
        Node prev = null;
        for(int i=0; i<(right-left+1); ++i){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        leftPrev.next.next = curr;
        leftPrev.next=prev;

        Traversal.printList(head);

    }

    public static Node reverseList(Node head){
        Node prevNode = null;
        Node currNode = head;
        while(currNode!=null){
            Node temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        return prevNode;
        //Traversal.printList(head);
    }
}
