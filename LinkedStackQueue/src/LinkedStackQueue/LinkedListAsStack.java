package LinkedStackQueue;

public class LinkedListAsStack<T> implements StackADT<T>{
    
    LinkedList list = new LinkedList();
    int count = 0;

    @Override
    public void push(T element) {
        list.addToHead(element);
        count++;
    }
    
    @Override
    public T pop() {
        T reval = (T) list.getFirst();
        list.removeFromHead();
        count--;
        return reval;
    }

    @Override
    public T peek() {
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
