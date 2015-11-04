import java.util.*;

public class ReverseWord
{
  public static String reverseString(String s)
  {
    StringBuilder revers = new StringBuilder();
    for(int i =s.length()-1; i >= 0; i-- )  
      revers.append(s.charAt(i));
    return revers.toString();
  }
  
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    in.close();
    a= reverseString(a);
    System.out.println("reversed string"+" "+a);
  }
  
}