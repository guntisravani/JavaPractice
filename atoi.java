//Convert String to Integer in java.
// int i = Integer.parseInt(toString);
//import java.io.*;

public class atoi
{
  public static void main(String[] args)
  {
    String s = "100";
    try
    {
    int i = Integer.parseInt(s.trim());
    System.out.println("Int i :"+i);
    }
    catch(NumberFormatException e)
    {
      System.out.println("Number format exception:"+e.getMessage());
    }
  }
}