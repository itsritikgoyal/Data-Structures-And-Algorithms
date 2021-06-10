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
  
  public void insertfirst(int value){   // insert a new node at the starting 
      ListNode first = new ListNode(value);
      first.next = head;
      head = first;
  }
  
  public void insertend(int value){   //insert a new node at the end 
      ListNode end = new ListNode(value);
      if(head == null){
        head = end;
        return;
      }
      ListNode current = head;
      while(current.next != null){
        current = current.next;
      }
      current.next = end;
  }
  
  public void insert(int value, int position){    // add a node at any place in the list
      ListNode node = new ListNode(value);
    if( position == 1){
      node.next=head;
      head = node;
    }
    else{
      int count = 1;
      ListNode previous = head;
      while (count < position -1){
          previous = previous.next;
          count++;
      }
    }
    ListNode current = previous.next;
    node.next = current;
    previous.next = node;
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
    
      sll.insertfirst(9); // insert a new node at first 
      sll.insertend(7); // insert a new node at last
      sll.insert(3,2); // insert a node at position 2 
      sll.display();  // display the elements 
      System.out.println(sll.length());   // print the length 
  }
}
