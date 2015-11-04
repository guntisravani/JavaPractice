// Assume you have a method isSubstring which checks if one word is a substring of another. Given 2 strings, s1 and s2, 
//write code to check if s2 is a rotation of s1 using only one call to isSubstring.
public class SubstringRotate {
public static boolean isRotation(String s1, String s2) {
 // int len = s1.length();
  if(s1.length() == s2.length() && s1.length() > 0) {
   String s1s1 = s1 + s1;
   System.out.println("String s1s1:"+s1s1);
   System.out.println("if sub string:"+ isSubstring(s1s1,s2));
   return isSubstring(s1s1, s2);
  }
   return false;
}
public static boolean isSubstring(String s1s1, String s2) {
   System.out.println("Contains:"+ s1s1.contains(s2));
return s1s1.contains(s2);
}
public static void main(String[] args) {
boolean res = isRotation("waterbottle","erbottlewat");
System.out.println("Substring:"+res);
}
}