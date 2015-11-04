//import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashSet;
//Determine if a string has all unique characters.
public class UniqueChar {
  //Method 1
  public static boolean uniqueChar(String str) {
     for(int i = 0; i < str.length(); i++) {
      int count = 0;
      char c = str.charAt(i);
      for(int j = i; j < str.length(); j++) {
        if( c == str.charAt(j)) {
          count ++; 
        }
      }
      if(count > 1) {
        return false; 
      }  
     }
      return true;  
  }

  //Method 2
  public static boolean unique(String str) {
    boolean res = false;
  HashSet<Character> uni = new HashSet<Character>();
  for(int i = 0; i < str.length(); i++) {
    res = uni.add(str.charAt(i));
    if(res == false)
      return false;
  }
  return true;
  }
  
public static void main(String[] args) {
  boolean det = uniqueChar("Sravani");
  System.out.println("String returned"+ det);
  System.out.println("method 2 result" + unique("Sravz"));
}
}