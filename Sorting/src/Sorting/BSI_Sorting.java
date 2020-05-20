
package Sorting;

public class BSI_Sorting{

    
    public static int[] bubblesort(int[] a, int length){
        for(int i = 0; i<(length-1); i++)
        {
          for(int j = length-1; j>i; j--)
          {
              if(a[j-1] > a[j])
              {
                  int temp = a[j-1];
                  a[j-1] = a[j];
                  a[j] = temp;
              }
          }
        }
        return a;
    }
    
    public static int[] selectionSort(int[] A,int length)
    {
          for(int i = 0; i<(length-1); i++)
        {
          for(int j = i+1; j > length; j++)
          {
              if(A[i] > A[j])
              {
                  int temp = A[i];
                  A[i] = A[j];
                  A[j] = temp;
              }
          }
    }
          return A;
}
    
    public static int[] insertionSort(int[] A,int length){
    for(int i =1; i< length; i++)
    {
        int j = i;
        int key = A[i];
        while((j > 0) && (A[j-1] > key))
        {
            A[j] = A[j-1];
            j--;
        }
        A[j] = key;
        }
    return A;
    }
    
}
