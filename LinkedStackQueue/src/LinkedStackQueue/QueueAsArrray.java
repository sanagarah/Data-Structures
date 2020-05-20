package LinkedStackQueue;

public class QueueAsArrray<T> implements QueueADT<T>{
    Object[] array;
    int count;
    int rear;

    public QueueAsArrray(int size) {
        count = 0;
        rear = 0;
        array = (T[]) new Object[size];
    }
    

    @Override
    public void enqueue(T element) {
        if(isFull())
            throw new IllegalArgumentException("item not found");
        else{ 
        array[rear] = element;
        rear++;
        count++;}
            
    }

    @Override
    public T dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("item not found");
        else{
            T reval =(T) array[0];
            for(int i = 1;i<array.length;i++)
                array[i-1] = array[i];
            rear--;
            count--;
            return reval;
        }
    }

    @Override
    public T First() {
        if(isEmpty())
            throw new IllegalArgumentException("item not found");
        else
            return (T) array[0];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull(){
        return count == size();
    }
}
    


