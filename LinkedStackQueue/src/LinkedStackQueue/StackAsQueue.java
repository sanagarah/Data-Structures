package LinkedStackQueue;

public class StackAsQueue<T> implements StackADT<T> {
    
    QueueAsLinkedList queue1 = new QueueAsLinkedList();
    QueueAsLinkedList queue2 = new QueueAsLinkedList();

    @Override
    public void push(T element) {
        queue2.enqueue(element);
        for(int i = 0;i<queue1.size();i++)
            queue2.enqueue(queue1.dequeue());
        QueueAsLinkedList queue = new QueueAsLinkedList();
        queue = queue1;
        queue1 = queue2;
        queue2 = queue;
       
       
    }

    @Override
    public T pop() {
        return (T) queue1.dequeue();
    }

    @Override
    public T peek() {
       return (T) queue1.First();
    }

    @Override
    public int size() {
        return queue1.size();
    }

    @Override
    public boolean isEmpty() {
        return queue1.isEmpty();
    }
    
    public void print(){
        queue1.print();
    }
}
