//replace empty spaces with values.
public class Replace {
  public static String spaceReplace(String str) {
   str = str.replace(" ","%20");
   return str;
  }
  public static void main(String[] args) {
  String res = spaceReplace("hi how are you?");
  System.out.println("resultant string is:"+res);
  }
}