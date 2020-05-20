package LinkedStackQueue;

public interface QueueADT<T> {
    
    public abstract void enqueue(T element);
    
    public abstract T dequeue();
    
    public abstract  T First();
    
    public abstract int size();
    
    public abstract boolean isEmpty();
    
    
    
}
