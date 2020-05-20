package LinkedStackQueue;


public class Test {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.addToHead(1);
        list1.add(1, 2);
        list1.add(2, 3);
        list1.addToTail(4);
        list2.addToHead(5);
        list2.add(5, 2);
        list2.add(2, 6);
        list2.addToTail(7);
        list1.rotate(3);
        list1.print();
        
        
       
    }
    
}
