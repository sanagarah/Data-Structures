
package tree;
import java.util.LinkedList;
public class Queue {
    LinkedList list = new LinkedList();
        
    public void enqueue(Node p) {

        list.addLast(p);
                
    }
    
    public Node dequeue() {
        Node reval = (Node) list.getFirst();
        list.removeFirst();
        return reval;
    }

    public boolean isEmpty() {
       return list.isEmpty();
    }
    
}
