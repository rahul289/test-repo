public class MyLinkedList {
    class DoublyLinkedListNode {

        int val;
        DoublyLinkedListNode next;
        DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
    int i=-1;
    DoublyLinkedListNode head;
    DoublyLinkedListNode tail;
    public MyLinkedList() {
        head = new DoublyLinkedListNode(-1);
        tail = new DoublyLinkedListNode(-1);
        head.next = tail;
        tail.prev = head;
        i=-1;
    }

    public int get(int index) {
        if(index>i)
            return -1;

        //traverse list and get value
        int j=0;
        DoublyLinkedListNode cur=head.next;
        while(j<(index))
        {
            cur=cur.next;
            j++;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        DoublyLinkedListNode cur = new DoublyLinkedListNode(val);
        cur.prev=head;
        cur.next=head.next;
        head.next.prev=cur;
        head.next=cur;
        i++;
    }

    public void addAtTail(int val) {
        DoublyLinkedListNode cur = new DoublyLinkedListNode(val);
        cur.prev=tail.prev;
        cur.next=tail;
        tail.prev.next=cur;
        tail.prev=cur;
        i++;
    }

    public void addAtIndex(int index, int val) {
        if(index==0)
            addAtHead(val);
        else{
            int j=0;
            DoublyLinkedListNode cur=head.next;
            while(j<(index-1))
            {
                cur=cur.next;
                j++;
            }
            DoublyLinkedListNode now=new DoublyLinkedListNode(val);
            now.next=cur.next;
            now.prev=cur;
            cur.next.prev=now;
            cur.next=now;
            i++;
        }

    }

    public void deleteAtIndex(int index) {
        if(index>i || index<0)
            return;
        if(index==0)
        {
            head.next.next.prev=head;
            head.next=head.next.next;
        }
        else if(index==i)
        {
            tail.prev.prev.next=tail;
            tail.prev=tail.prev.prev;
        }
        else
        {
            int j=0;
            DoublyLinkedListNode cur=head.next;
            while(j<(index-1))
            {
                cur=cur.next;
                j++;
            }
            cur.next.next.prev=cur;
            cur.next=cur.next.next;
        }
        i--;
    }

    public static void main(String args[])throws Exception
    {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        System.out.println(myLinkedList.get(1));              // return 2
        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        System.out.println(myLinkedList.get(1));              // return 3
    }
}
