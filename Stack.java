import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Stack(){
        this.top = null;
        this.length = 0;
    }

    public int isLength(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void push(int data){
        ListNode newnode = new ListNode(data);
        newnode.next = top;
        top = newnode;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
