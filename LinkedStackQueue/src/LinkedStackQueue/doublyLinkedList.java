package LinkedStackQueue;

public class doublyLinkedList<T> {
    
    Node head;
    Node tail;
    
    public doublyLinkedList(){
        head = tail =null;
    }
    
    public void addToHead(T element){
        Node newNode = new Node(element);
        if(head == null)
          head = tail = newNode;
        else{
            newNode.prev=null;
            newNode.next = head;
            head = newNode;
            head.next.prev = head;} 
        
    }
    
    public void addToTail(T element){
        Node newNode = new Node(element);
        Node p = head;
        if(head == null)
            head = tail = newNode;
        else{
            while(p.next != null)
                p = p.next;
            newNode.next = null;
            p.next = newNode;
            tail = newNode;
            tail.prev.next = tail;
        }       
    }
    
    public void add(T prevElement, T newElement){
        Node newNode = new Node(newElement);
        Node p = head;
        while(p.data != prevElement && p.next != null)
            p = p.next;
        newNode.next = p.next;
        p.next = newNode;      
    }
    
    public T removeFromHead(){
        if(head == null)
            System.out.println("It's Empty");
        T reval = (T) head.data;
        if(head == tail)
            head = tail = null;
        else{
            head = head.next;
            head.prev = null;}
        return reval;
       
    }
    
    public T removeFromTail(){
        if(head == null)
            System.out.println("It's Empty");
        T reval = (T) head.data;
        if(head == tail)
            head = tail = null;
        else{
        Node p = head;
        while(p.next != null)
            p = p.next;
        tail = p = p.prev;
        tail.next = null;
        }
        return reval;
    }
    
    public void remove(T prevElement){
      if(head == null)
            System.out.println("It's Empty");
      Node p = head; 
      while(p.data != prevElement && p.next.next != null)
            p = p.next;
      p.next = p.next.next;     
    }
    
    public T getFirst(){
        return (T) head.data;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void setToNull(){
        head = tail = null;
    }
    
    public void print(){
        if(head == null)
          System.out.println("It's Empty");  
        Node p = head;
        while(p != null){
            System.out.println(p.data + "->");
             p = p.next;
        } 
        System.out.println("/");
    }
    
    public int count(){
        int count = 0;
        Node p = head;
        while(p != null){
            count = count++;
            p = p.next;
        }
        return count;
    }
    
}
    

    
