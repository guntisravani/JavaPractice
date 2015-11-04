//TreeMap is unsynchronized collection class which means it is not suitable for thread safe operations until unless synchronized explicitly.
/*Say? you ?have ?an ?array ?containing ?information ?regarding ?n ?people.??Each? person ?is?
described ?using? a? string?(their?name)?and? a ?number?(their ?position? a long? a ?number?
line).??Each ?person ?has ?three ?friends,?which ?are? the ?three ?people? whose? number ?is?
nearest? their? own.??Describe ?an? algorithm? to ?identify? each? person's? three ?friends.*/

import java.util.*;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Neighbor
{
  public static void main(String[] args)
  {
    //declaring TreeMap
    TreeMap<Integer, String> tmap = new TreeMap<Integer,String>();
    //Adding elements to treemap
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of values to be entered:");
    int size = in.nextInt();
    int key;
    String value;
    for(int i = 0; i<= size; i++)
    {
    key = in.nextInt(); 
    in.nextLine();
    value = in.nextLine();
    tmap.put(key, value);
    }
    in.close();
    
    Set set = tmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext())
    {
      Map.Entry mapEntry =(Map.Entry)iterator.next();
      System.out.print("Key is: "+ mapEntry.getKey()+"Value is: ");
      System.out.println(mapEntry.getValue());
    }
     
  }
}