package leetcode;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class LinkedList {

    ListNode head;

    /* Inserts a new Node at front of the list. */
    public ListNode push(int new_data) {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;

        return new_node;
    }

    /* This function prints contents of linked list starting from
        the given node */
    public void printList() {
        ListNode node = head;
        while (node != null)
        {
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode node=head;
        while(head!=null && head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }
            else head=head.next;
        }
        return node;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;


        while(current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);

        System.out.println("Given linked list");
        list.printList();
        list.head = list.reverseList(list.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList();

    }
}
