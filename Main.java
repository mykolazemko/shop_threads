package LinkedList;

public class Main {
    public static class LinkedList{
        public void display(ListNode head){
            if(head == null){
                return;
            }
            ListNode current = head;

            while (current != null){
                System.out.print(current.data + "->");
                current = current.next;
            }
        }
    }

    private static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        head.next = second;
        second.next = third;

        LinkedList list123 = new LinkedList();
        list123.display(head);
    }

}
