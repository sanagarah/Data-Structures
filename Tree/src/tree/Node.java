package tree;


public class Node {
    
    Node left, right;
    int data;
    
    public Node(){
        left = null;
        right = null;
        data = 0;
    }
    
    public Node(int n){
        left = null;
        right = null;
        data = n;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getData() {
        return data;
    }
    
}
