// Given two strings, write a method to decide if one is a permutation of the other.

public class Permutation {
  public static boolean isPermutate(String s1, String s2) {
  int count = 0;
  if( s1.length() != s2.length()) {
    return false;
  }
  for(int i = 0; i < s1.length(); i++) {
    char c = s1.charAt(i);
    System.out.println("frst string:"+ c);
    for(int j = 0; j < s2.length(); j++) {
      if(c == s2.charAt(j)) {
        System.out.println("second string"+ s2.charAt(j));
        count ++;
      }
    }
  }
  if(count == 0) {
    return false;
  } else {
    return true;
  }
 }
  public static void main(String[] args) {
    boolean res = isPermutate("aac","cca");
    System.out.println("Permutation :" + res);
  }
}