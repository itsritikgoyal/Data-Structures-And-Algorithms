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
  
  public int length(){    //  function to calculate the length of sll
      if(head==null)
          return 0;
      int count = 0;
      ListNode current = head;
      while(current != null){
          count++;
          current = current.next;
      }
    return count;
  }
  
  public static void main(String[] args){
    
    SinglyLinkedList sll = new SinglyLinkedList();    // insertion elements in a linked list
      sll.head = new ListNode(10);
      ListNode second = new ListNode(1);
      ListNode third = new ListNode(7);
      ListNode fourth = new ListNode(8);
      
      sll.head.next = second;
      second.next = third;
      third.next = fourth;
    
      sll.display();  // display the elements 
      System.out.println(sll.length());   // print the length 
  }
}
