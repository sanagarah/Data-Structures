package LinkedStackQueue;

public class QueueAsCircularArray<T> implements QueueADT<T> {
    
    T[] array;
    int front;
    int rear;
    int count;
    int size;
    
    public QueueAsCircularArray(int size){
        array = (T[])new Object[size];
        this.size=size;
        rear = 0;
        front = 0;
        count = 0; 
    }

    @Override
    public void enqueue(T element) {
        if(isFull())
            throw new IllegalArgumentException("item not found");
        else{ 
        array[rear] = element;
        rear = (rear + 1)% size();
        count++;}
    }

    @Override
    public T dequeue() {
         if(isEmpty())
            throw new IllegalArgumentException("item not found");
        else{
            T reval =(T) array[front];
            front = (front + 1)% size();
            count--;
            return reval;
         }
    }

    @Override
    public T First() {
        return array[front];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
       ireturn front == rear;
    }
    
    public boolean isFull(){
if((rear +1)% size() == front);
       return true;
        
    }

    
}
