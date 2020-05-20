package LinkedStackQueue;
import java.util.ArrayList;

public class ArrayListAsStack<T> implements StackADT<T> {
    
    ArrayList list = new ArrayList();
    int count = 0;
    
    public ArrayListAsStack(int size){
        list.ensureCapacity(size);
    }
    
    @Override
    public void push(T element) {
        list.add(element);
        count++;
    }

    @Override
    public T pop() {
        count--;
        return (T) list.remove(list.size() -1);
    }

    @Override
    public T peek() {
        return (T) list.get(list.size() -1);
    }
    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public void clear(){
        list.clear();
    }

}
