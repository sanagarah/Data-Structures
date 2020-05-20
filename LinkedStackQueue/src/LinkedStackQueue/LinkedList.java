package LinkedStackQueue;

public class LinkedList<T> {
    
    Node head;
    Node tail;
    
    public LinkedList(){
        head = tail =null;
    }
    
    public void addToHead(T element){
        Node newNode = new Node(element);
        if(head == null)
          head = tail = newNode;
        else{
            newNode.next = head;
            head = newNode;}    
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
        else
            head = head.next;
         return reval;
    }
    
    public T removeFromTail(){
        if(head == null)
            System.out.println("It's Empty");
        T reval = (T) tail.data;
        if(head == tail)
            head = tail = null;
        else{
        Node p = head;
        while(p.next.next != null)
            p = p.next;
        p.next = null;}
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
    
    public int size(){
        int count = 0;
        Node p = head;
        while(p != null){
            count = count++;
            p = p.next;
        }
        return count;
    }
    
    public void reverse(){
        Node p = head;
        Node pre = null;
        while(p != null){
            Node next = p.next;
            p.next = pre;
            pre = p;
            p = next;}
        head = pre;     
    }
    
    public void successorAndPredecessor(T element){
        Node p = head;
        Node succ = null;
        Node pre = null;
        if(p.data == element){
            pre = null;
            succ = p.next;}
        else{
        while(p != null && p.data != element){
            pre = p;
            succ = p.next.next;
            p = p.next;}}
        if(pre != null && succ != null)
            System.out.println(pre.data + "->" + element + "->" + succ.data);
        else if(pre == null && succ != null)
            System.out.println(element + "->" + succ.data);
        else if(pre != null && succ == null)
            System.out.println(pre.data + "->" + element);
        else System.out.println(element);   
    }
    
    public boolean isPresent(Node head, T element){
        Node p = head;
        while(p != null){
            if(p.data == element)
                return true;
            p = p.next;
        }
        return false;
    }
    
    public void push(T element){
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
    }
    
    public void union(LinkedList list1,LinkedList list2){
        Node p1 = list1.head;
        Node p2 = list2.head;
        while (p1 != null) {
            push((T) p1.data);
            p1 = p1.next;
        }

        while (p2 != null) {
            if (!isPresent(head, (T) p2.data)) {
                push((T) p2.data);
            }
            p2 = p2.next;
        }
        }
          
    public void intersection(LinkedList list1,LinkedList list2){
        Node p1 = list1.head;
        Node p2 = list2.head;
        while(p1 != null){
            if(isPresent(p2, (T) p1.data))
                push((T) p1.data);
        p1 = p1.next;}
    }
    
        public void rotate(int k) 
    { 
        if (k == 0) return; 
        Node current  = head; 
        int count = 1; 
        while (count < k && current !=  null) 
        { 
            current = current.next; 
            count++; 
        } 
  
        if (current == null) 
            return; 
 
        Node kthNode = current; 
        while (current.next != null) 
            current = current.next; 
        
        current.next = head;
        head = kthNode.next; 
        kthNode.next = null;
    }

    /* public T max(){
        T max = (T) head.data;
        Node p = head;
        while(p != null){
            if(p.data > max)
                max = (T) p.data;
        p = p.next;}
        return max;
    }*/
    
}


        

    
