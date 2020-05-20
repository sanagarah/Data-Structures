package LinkedStackQueue;

public class LinkedListAsQueue<T> implements QueueADT<T>{
    
    LinkedList list = new LinkedList();
    int count = 0;
    
    @Override
    public void enqueue(T element) {
        count++;
        list.addToTail(element);
                
    }

    @Override
    public T dequeue() {
        count--;
        T reval = (T) list.getFirst();
        list.removeFromHead();
        return reval;
    }

    @Override
    public T First() {
        return (T) list.getFirst();
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
       return list.isEmpty();
    }
    
}
