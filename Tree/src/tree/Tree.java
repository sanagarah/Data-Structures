package tree;
import java.util.Scanner;
public class Tree {

    
    public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
                Scanner input = new Scanner(System.in);
                int user1 = 0;
                int user2;
                while(user1 != 11){
                System.out.println("Select a method: 1.insert   2.delete   3.preOrder  4.inorder    5.postorder    6.levelOrder    7.count     8.sum     9.search     10.isEmpty  11.exit");
                user1 = input.nextInt();
                switch(user1){
                    case 1: { System.out.println("The number of insertion is:");
                    user2 = input.nextInt();
                    bt.insert(user2);
                    break;
                    }
                        
                    case 2: { System.out.println("Enter what you want to delete:");
                    user2 = input.nextInt();
                    bt.delete(user2);
                    System.out.println();
                    break;
                    }
                   
                    case 3: { System.out.println("BinaryTree preOrder:");
                    bt.preOrder();
                    System.out.println();
                    break;
                    }
                    
                    
                    case 4: { System.out.println("BinaryTree inOrder:");
                    bt.inOrder();
                    System.out.println();
                    break;
                    }
                    
                    case 5: { System.out.println("BinaryTree postOrder:");
                    bt.postOrder();
                    System.out.println();
                    break;
                    }
                    
                    case 6: { System.out.println("BinaryTree levelOrder:");
                    bt.breadthFirst();
                    System.out.println();
                    break;
                    }
                  
                    case 7: { System.out.println("How many nodes are there ?");
                    int co = bt.count();
                    System.out.println(co);
                    break;
                    }
                    
                    case 8: {System.out.println("The sum is: ");
                    int sum = bt.sum();
                    System.out.println(sum);
                    break;
                    }
                    
                    case 9: { System.out.println("Enter what you want to find:");
                    user2 = input.nextInt();
                    boolean b = bt.search(user2);
                    System.out.println(b);
                    break;
                    }
                    
                    case 10: { System.out.println("Is it Empty ?");
                    if(bt.isEmpty())
                        System.out.println("yes");
                        else
                        System.out.println("No");
                    }
                    break;
                }
                }
                
                System.out.println("Thank you! see you soon");
    
}
}