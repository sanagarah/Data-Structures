package LinkedStackQueue;

public class StackAsLinkedList<T> implements StackADT<T> {
    
    Node top;
    int count;
    
     public StackAsLinkedList(){
        top = null;
        count = 0;
    }
    
    @Override
    public void push(T element) {
        Node newNode = new Node(element);
        count++;
        if(top == null)
          top = newNode;
        else{
            newNode.next = top;
            top = newNode;} 
    }

    @Override
    public T pop() {
       count--;
        if(top == null)
            throw new IllegalArgumentException("item not found");
        else{
            T reval =(T) top.data;
            top = top.next;
        return reval;}
    }

    @Override
    public T peek() {
        return (T) top.data;
    }
    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    
}
