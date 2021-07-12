public class Sll {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void display(){
        ListNode temp = head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public int length(){
        if(head.next==null)
            return 0;
        int count = 0;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void insertFirst(int data){
        if(length()==0){
            ListNode newnode = new ListNode(data);
            head = newnode;
        }
        else{
            ListNode newnode = new ListNode(data);
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertEnd(int data){
        ListNode newnode = new ListNode(data);
        if(head==null){
            head = newnode;
            return;
        }
        ListNode temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public ListNode deleteFirst(){
        
    }

    public static void main(String[] args) {
        Sll sll = new Sll();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(20);

        sll.head.next = second;
        second.next = third;

        sll.insertFirst(5);
        sll.insertFirst(6);

        sll.insertEnd(10);

        sll.display(); // Display the Linked List
        System.out.println(sll.length()); // Print the length of linked list
    }
}
