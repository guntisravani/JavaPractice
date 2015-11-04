//A sorted of given integers, how can you find the location of a particular integer x.
//Ans: Use binary search 

import java.util.*;

public class BinarySearch
{
  private static int indexOf(int[] a, int key)
  {
    int lo =0;
    int hi = a.length -1;
    while( lo < hi)
    {
      System.out.println("Entered index while");
      int mid = lo +(hi - lo)/2;
      if(key < a[mid] )
        hi = mid -1;
     else if( key > a[mid])
       lo = mid + 1;
     else 
       return mid;    
     System.out.println("Exiting index while");
     }
    System.out.println("returning -1");
    return -1;
   }
  
  public static int rank(int key, int[] a)
  {
    System.out.println("Came to rank");
    return indexOf(a,key);
     
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    
    int[] array = new int[size];
    for(int j =0; j < array.length; j++)
    {
      int k = in.nextInt();
      array[j] = k;
    }

    Arrays.sort(array);
    System.out.println("ENter the key to be found:");
    
      int key = in.nextInt();
          in.close();
      if(BinarySearch.indexOf(array, key) != -1)
        System.out.println("Index is "+BinarySearch.indexOf(array, key));
    System.out.println("Executing.....");
  }
}