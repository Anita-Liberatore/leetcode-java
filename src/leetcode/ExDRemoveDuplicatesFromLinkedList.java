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

}

class Main {
    public static void main(String[] args) {
        /* Start with the empty list */
        LinkedList list = new LinkedList();
        ListNode node;
        node = list.push(4);
        node = list.push(1);
        node = list.push(1);

        node = list.deleteDuplicates(node);
        list.printList();


    }
}
