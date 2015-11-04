public class Permute {
  public static boolean isPermute(String s1, String s2) {
    if(s1.length() != s2.length()) {
      return false;
    }
    return sort(s1).equals(sort(s2));
  }
  public static String sort(String str) {
    char[] c = str.toCharArray();
    java.util.Arrays.sort(c);
    return new String(c);
  }
  public static void main(String[] args) {
  boolean res = isPermute("aac","cca");
  System.out.println("permutation is:"+res);
  }
}