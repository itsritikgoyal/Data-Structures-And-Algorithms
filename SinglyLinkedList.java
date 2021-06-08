public class SinglyLinkedList {
  
  private ListNode head;
  
  private static class ListNode {   // creation of a Node
    private int data;
    private ListNode next;
    
    public ListNode(int data){
      this.data = data;
      this.next = null;
    }
  }
  
  public void display(){    // used to print the linked list  
    ListNode current = head;
    while(current!=null){
      System.out.println(current.data);
      current = current.next;
    }
    System.out.println(null);
  }
  
  public static void main(String[] args){
    
    SinglyLinkedList ssl = new SinglyLinkedList();    // insertion elements in a linked list
      ssl.head = new ListNode(10);
      ListNode second = new ListNode(1);
      ListNode third = new ListNode(7);
      ListNode fourth = new ListNode(8);
      
      ssl.head.next = second;
      second.next = third;
      third.next = fourth;
    
      sll.display();  // display the elements 
  }
}
