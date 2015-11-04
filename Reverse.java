// Reverse a string.

public class Reverse {
  public static String reverseString(String str) {
    String temp = "";
    for(int i = str.length() - 1 ; i >= 0 ; i--) {
      temp = temp + str.charAt(i);           
    }
    return temp;
  }
  public static void main(String[] args) {
  String str = reverseString("Sravani"); 
  System.out.println("Reversed string is : " + str);
  }
}
