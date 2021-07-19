
public class Dll {
    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
        this.data = data;
        }
    }
    public Dll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode temp = tail;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertFisrt(int data){
        ListNode newnode = new ListNode(data);
        if(isEmpty()){
            tail = newnode;
        }
        else{
            head.previous = newnode;
            newnode.next = head;
        }
        head = newnode;
        length++;
    }

    public void insertLast(int data){
        ListNode newnode = new ListNode(data);
        if(isEmpty()){
            head = newnode;
        }
        else{
            tail.next = newnode;
            newnode.previous = tail;
        }
        tail = newnode;
        length++;
    }

    public void deleteFirst(){
        if(isEmpty())
            System.out.println("No element present here");
        else{
            head=head.next;
            head.previous = null;
            length--;
        }
    }

    public void deletelast(){
        if(isEmpty())
            System.out.println("No element present here");
        else{
            tail=tail.previous;
            tail.next = null;
            length--;
        }
    }

    public static void main(String[] args) {
        Dll dll = new Dll();
        dll.insertFisrt(50);
        dll.insertFisrt(40);
        dll.insertFisrt(30);
        dll.insertFisrt(20);
        dll.insertFisrt(10);
        System.out.println("length = "+dll.length());
        dll.insertLast(60);
        dll.deleteFirst();
        dll.displayForward();
        dll.displayBackward();

    }
}
