// Array of integers and increment each integer by 1
import java.util.*;
public class Increment
{
  public static int[] doIncrement(int[] arr)
  {
    for(int i =0; i<arr.length ; i++)
    {
      arr[i] = arr[i]+1;
    }
    return arr;
  }
  public static void main(String a[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter length of array inserted");
    int size = in.nextInt();
    System.out.println("Enter"+" "+size+" "+"values:");
     int[] array = new int[size];
    for(int j =0; j< array.length; j++)                   
    { 
      int k = in.nextInt();
      array[j] = k;
    }
    in.close();
                       int[] arr2 = doIncrement(array);
                       for(int i:arr2)
                         System.out.print(i);
                       System.out.print(",");
  }
    
}