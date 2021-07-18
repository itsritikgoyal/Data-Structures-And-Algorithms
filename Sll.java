public class Sll 
{
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
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public int length(){
        if(head ==null)
            return 0;
        int count = 0;
        ListNode temp = head;
        while(temp != null){
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
        if(head == null){
            return null;
        }
        ListNode temp  = head;
        head  = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteEnd(){
        if( head == null || head.next == null ){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;   

    }

    public void insert(int data, int position){
        ListNode newnode = new ListNode(data);
        if(position==1){
            newnode.next = head;
            head = newnode;
        }
        else{
            ListNode previous = head;
            ListNode current  = head;
            int count  = 1;
            while(count < (position-1)){
                previous = previous.next;
                count++;
            }
            current = previous.next;
            previous.next = newnode;
            newnode.next = current;
            
        }
    }

    public void delete(int position){
        if(position == 1 ){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next=current.next;
        }
    }


    public static void main(String[] args) {
        Sll sll = new Sll();

        sll.insert(10, 1);
        sll.insert(10, 1);
        sll.insert(10, 3);
        System.out.println(sll.length()); // Print the length of linked list
        sll.delete(1);
        sll.display(); // Display the Linked List
    }
}
