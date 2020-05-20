
package Sorting;
import java.util.Scanner;
public class Sorting {


    public static void main(String[] args) {
                BSI_Sorting inde = new BSI_Sorting();
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the length: ");
                    int length = input.nextInt();
                    int[] A = new int[length];
                    System.out.println("Fill the array: ");
                    for(int i = 0; i < A.length; i++){
                      A[i] = input.nextInt();
                }
                int user1 = 0;
                while(user1 != 4){
                System.out.println("Select a method: 1.bubblesort  2.insertionSort   3.selectionSort  4.Exit");
                user1 = input.nextInt();
                switch(user1){
                    case 1: { System.out.println("The bubblesort is: ");
                    int[] B = BSI_Sorting.bubblesort(A, length);
                    for(int i = 0; i < B.length; i++){
                        System.out.println(B[i]);
                    }
                    System.out.println();
                    break;
                    }
                        
                    case 2: { System.out.println("The insertionSort is: ");
                    int[] C = BSI_Sorting.insertionSort(A, length);
                    for(int i = 0; i < C.length; i++){
                        System.out.println(C[i]);
                    }
                    System.out.println();
                    break;
                    }
                   
                    case 3: { System.out.println("The selectionSort is: ");
                    int[] D = BSI_Sorting.selectionSort(A, length);
                    for(int i = 0; i < D.length; i++){
                        System.out.println(D[i]);
                    }
                    System.out.println();
                    break;
                    }
                    
                    
                    case 4: { System.out.println("End of the program: ");
                    System.out.println();
                    break;
                    }
                    
                }
                
                System.out.println("Thank you!");
    
}
    }
    
}
