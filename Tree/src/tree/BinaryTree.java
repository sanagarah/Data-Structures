package tree;

public class BinaryTree {
    
    private Node root;
 
    public BinaryTree(){
        root = null;
}
    
    public void insert(int element){
        Node p = root;
        Node prev = null;
        while(p != null){
            prev = p;
            if(element > p.data)
                p = p.right;
            else p = p.left;     
        }
        if(root == null)
            root = new Node(element);
        else if(element > prev.data)
            prev.right = new Node(element);
        else prev.left = new Node(element);  
    }
    
    public void delete(int element) 
    { 
        root = delete(root, element); 
    } 
    
    public Node delete(Node root, int element) { 
        if (root == null)
            return root; 
        if (element < root.data) 
            root.left = delete(root.left, element); 
        else if (element > root.data) 
            root.right = delete(root.right, element);                                            
        else { 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
            root.data = min(root.right);   
            root.right = delete(root.right, root.data); 
        } 
        return root; 
    }
    
    public int min(Node p){
        while(p.left != null)
            p = p.left;
        return p.data;
}
    
    public void inOrder() {
        inOrder(root);
}
    
    public void inOrder(Node p) {
	if (p != null) {
	   inOrder(p.left);
	   System.out.print(p.data + " ");
	   inOrder(p.right);
	}
}
    
    public void preOrder() {
        preOrder(root);
}
    
    public void preOrder(Node p) {
	if (p != null) {
	   System.out.print(p.data + " ");
	   preOrder(p.left);
	   preOrder(p.right);
	}
}
    public void postOrder() {
        postOrder(root);
}
    
    public void postOrder(Node p) {
	if (p != null) {
	    postOrder(p.left);
            postOrder(p.right);
            System.out.print(p.data + " ");
		}
}
    public void breadthFirst(){
        Node p = root;
        Queue q = new Queue() {};
        if(p != null){
            q.enqueue(p);
            while(!q.isEmpty()){
                p = q.dequeue();
                visit(p);
                if(p.left != null)
                    q.enqueue(p.left);
                if(p.right != null)
                    q.enqueue(p.right);
            }
                
        }
    }
    
    public void mirror() {
        root = mirror(root);
    }
    
    public Node mirror(Node p) {
        if(p != null)
        return null;
       Node Mroot = new Node(p.data);
       Mroot.left = mirror(root.right);
       Mroot.right = mirror(root.left);
       return Mroot;
 }
        
    public void visit(Node p){
            System.out.println(p.data);
 }
        
    public boolean isEmpty() {
	return root == null;
}
        
    public int count(){
        return count(root);
    }
    
    public int count(Node p){
        if(p == null)
        return 0;
        else{
          return 1 + count(p.left) + count(p.right);     
        }
}
    
    public int sum(){
        return sum(root);
    } 
    
    public int sum(Node p){
        if(p == null)
            return 0;
        else{
        return p.data + sum(p.left) + sum(p.right);
        }
    }

    public boolean search(int element){
      Node p = root;
      while(p != null){
          if(element == p.data)
              return true;
          else if(element < p.data)
              p = p.left;
          else p = p.right;}
      return false;
    }
    
    public int nFNHelper(Node sRoot) {
      if ( sRoot == null ) return 0;
      int count = sRoot.left != null && sRoot.right != null ? 1 : 0;
      return count + nFNHelper(sRoot.left) + nFNHelper(sRoot.right);
}
    
    public int getTreeHeight(Node node){
      if (node == null)
      return 0;
      else{
      int lDepth = getTreeHeight(node.left);
      int rDepth = getTreeHeight(node.right);
      if (lDepth > rDepth)
      return (lDepth + 1);
      else
      return (rDepth + 1);
    }
} 
    
}
