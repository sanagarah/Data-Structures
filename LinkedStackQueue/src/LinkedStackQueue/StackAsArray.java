package LinkedStackQueue;

public class StackAsArray<T> implements StackADT<T> {
    
    T[] array;
    int top;
    int size;
 
     public StackAsArray(int size) {
        top = -1;
        array = (T[]) new Object[size];
        this.size = size;
    }
    
    @Override
    public void push(T element) {
        if(isFull())
            throw new IllegalArgumentException("item not found");
        else{
            top++;
            array[top] = element;
          
        }
        
    }

    @Override
    public T pop() {
        if(isEmpty())
            throw new IllegalArgumentException("item not found");
        else{
            T reval = array[top];
            top--;
        return reval;}
    }

    @Override
    public T peek() {
        if(isEmpty())
            throw new IllegalArgumentException("item not found");
        else
        return array[top];
    }
    @Override
    public int size() {
        return top +1;
    }

    @Override
    public boolean isEmpty() {
       return top == -1;
    }

    
    public boolean isFull(){
         if (top < size -1)
        return false;
        else return true;
    }
    
}
