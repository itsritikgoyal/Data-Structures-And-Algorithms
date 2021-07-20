public class Cll {
    private ListNode last;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;
        
        public ListNode (int data){
            this.data = data;
        }

    }
    public Cll(){
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public int isLength(){
        return length;
    }

    public void isDisplay(){
        if(isEmpty()){
            System.out.println("No element present");
            return;
        }
        ListNode temp = last.next;
        while(temp!=last){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public void insertFirst(int data) {
        ListNode newnode = new ListNode(data);
        if(isEmpty()){
            last=newnode;
        }
        else{
            newnode.next = last.next;
        }
        last.next = newnode;
        length++;
    }

    public void insertEnd(int data){
        ListNode newnode = new ListNode(data);
        if(isEmpty()){
            last = newnode;
            last.next = newnode;
        }
        else{
            newnode.next = last.next;
            last.next = newnode;
            last = newnode;
        }
        
        length++;
    }

    public ListNode deleteFirst(){
        ListNode temp = last.next;
        if(isEmpty())
            System.out.println("List is empty");
        else{
            
            last.next = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        Cll cll = new Cll();
        cll.insertFirst(5);
        cll.deleteFirst();
        System.out.println(cll.isLength());
        cll.isDisplay();
    }

}
