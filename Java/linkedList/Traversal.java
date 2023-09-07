package linkedList;

public class Traversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node head = GenerateList.generateList(arr);
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
    }

    public static void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.val+" -> ");
            curr = curr.next;
        }
    }
}
