package LinkedStackQueue;

public class QueueAsLinkedList<T> implements QueueADT<T> {
    
    Node front;
    Node rear;
    int count;
    
    public QueueAsLinkedList(){
        front = null;
        rear = null;
        count = 0;
    }

    @Override
    public void enqueue(T element) {
         Node newNode = new Node(element);
         count++;
        Node p = front;
        if(front == null)
            front = newNode;
        else{
            while(p.next != null)
                p = p.next;
            newNode.next = null;
            p.next = newNode;
            rear = newNode;}
        }

    @Override
    public T dequeue() {
        count--;
        if(front == null)
            throw new IllegalArgumentException("item not found");
        else{
            T reval = (T) front.data;
            front = front.next;
        return reval;}
    }

        
    @Override
    public T First() {
        return (T) front.data;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    
    public void print(){
        Node p = front;
        while(p != null){
            System.out.println(p.data);
            p = p.next;}
    }
}