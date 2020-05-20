package LinkedStackQueue;

public class Node<T> {
    Node next;
    Node prev;
    T data;
    
      public Node(){
        next = null;
        prev = null;
        data = null;
    }
    
    public Node(T element){
        data=element;
    }
    
    public Node(T element, Node newNode){
        data=element;
        next=newNode;
    }
    
    
}
