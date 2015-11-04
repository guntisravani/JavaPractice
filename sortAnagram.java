//Sorting Approach to find if two words are anagrams  
public class sortAnagram{
  public static void main(String[] args) {
  String s1 = "Sravani";
  String s2 = "Sravani";  
  char[] arrayS1 = s1.toCharArray();
  char[] arrayS2 = s2.toCharArray();
  if(isAnagram(arrayS1, arrayS2)) {
    System.out.println("the two strings are anagram of each other");
  } else {
    System.out.println("the two strings are not anagram of each other");
  }
  }
  
  public static boolean isAnagram(char[] s1, char[] s2) {    
  int c1 = s1.length;
  int c2 = s2.length;
  if(c1 != c2) {
    return false;
  }  
  sort(s1, 0, c1 - 1);
  sort(s2, 0, c2 - 1);
  for(int i =0; i <  c1; i++) {
    if(s1.equals(s2)) {
      return true;
    }  
   }
    return false;
  }
  
  public static void sort(char s[], int lo, int hi) {
    if(hi <= lo)
      return;
    int part = partition(s, lo, hi);
    sort(s, lo, part - 1);
    sort(s, part + 1, hi);
  }
  private static int partition(char[] a, int lo, int hi) {
    char x = a[hi];
    int i = lo - 1;
    int j;
    for (j = lo; j <= hi - 1; j++) {
      if(a[j] <= x) {
        i++;
        exchange(a[i], a[j]);
      }
    }
    exchange(a[i+1], a[hi]);
    return (i+1);
  }
  
  public static void exchange(char a, char b) {
   char temp = a ;
        a = b;
        b = temp;
  }
  }