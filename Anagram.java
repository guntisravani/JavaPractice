// Given an english word in the form of a string, how can you quickly find all valid anagrams for that string.
//Your are allowed to precompute whatever you want to and store whatever you optionally pre-compute on disk.

public class Anagram {
  public static void main(String[] args) {
    String[] Anagram = new String[] {"dog", "god", "tool", "loot", "rose", "sore"};
    HashMap<String, String> h = new HashMap<String, String>();
    QuickSort q = new QuickSort();
    for(int i = 0;i < Anagram.length; i++) {
      String temp = new String();
      temp = q.quickSort(Anagram[i]); // sorted word Ex: dgo for dog
      if(!h.containsKey(temp)) {
        h.put(temp, Anagram[i]);
      } else {
        String s = h.get(temp);
        h.put(temp, s + "," + Anagram[i]); 
      }    
    }
    String word = new String(){"tolo"};
    String sortedword = q.quickSort(word);
    if(h.containsKey(sortedword.toLowerCase())) {
      System.out.println("Anagrams from Dictionary:" + h.get(sortedword.toLowerCase()));
    }
  }
}