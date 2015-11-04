/*package listPractice;

public class Test {
	/*public static String modifyString(char[] str) {
	    int size = str.length;
	    char[] tmp = new char[size];
	    int j = 0;
	    for(int i = 0; i < str.length; i++) {
	        if((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= '0' && str[i] <= '9')) {
	         tmp[j] = str[i];
	         j++;
	        }
	    } 
	    String res = new String(tmp);
	    return res;
	}
public static void main(String[] args) {
	char[] list = new char[] {'A',',','i','Z','E','o','4','!'};
	String res = modifyString(list);
	System.out.println(res);
} 
	public Node removeElement(int key) {
	    Node curr = head;
	    Node prev = null;
	    while(curr != null &&  curr.data != key) {
	        prev = curr;
	        curr = curr.next;
	    } 
	    prev.next = curr.next;
	    return prev;
	}
	public static void main(String[] args) {
	Test<Integer> list1 = new Test<Integer>();
	 list1.addFirst(1);
	 list1.addFirst(5);
	 list1.addFirst(2);
	 list1.addFirst(3);
	 list1.addFirst(4);
	}
}



“abc” -> “cde”, rot-2, forward
“abc” -> “yza”, rot-2, backward

Input:
[“abc”, “cde”, “yza”, “x”, “abcd”, “bcde”, “afc”]

Output:
[
[“abc”, “cde”, “yza”, “xyz”],
[“afc”],
[“x”],
[“abcd”, “bcde”]
]

public List<List<String>> groupRotEquivalent(List<String> strings, int rotation) {
    List<String> cons = new ArrayList<>();
    List<String> nonCons = new ArrayList<>();
    
    for (int i = 0; i < strings.size(); i++ ) {
        if (isConsChars(strings.get(i)) {
            cons.add(string.get(i));
        } else {
            // noncons.add
        }
    }
    
    List<String> newCons = new ArrayList<>();
    // iterate cons -- for each in cons, get fwdRtn, and add to new Cons
    
    return Arrays.asList(newCons, nonCons);    

}

public boolean isConcChars(String str) {
    for (int i = 1; i < str.length; i++) {
        if ( str.charAt(i-1) != (str.charAt(i) + 1 % 26) ) {
            return false;
        }
    }
    return true;
}


public String forwardRotation(String s, int rot) {
    char[]
    
    char[i] = (s.charAt(i) + rot ) % 26;
}


public String modifyString(char[] str) {
    int size = str.length;
    char[] tmp = new char[size];
    int j = 0;
    for(int i = 0; i < str.length; i++) {
        if((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= '0' && str[i] <= '9')) {
         tmp[j] = str[i];
         j++;
        }
    } 
    String res = new String(tmp);
    return res;
}

char c = 'c';

i/p : a,1_e4
o/p: a1e4

tmp[0] = a
tmp[1] = 1
tmp[2] = e
tmp[3] = 4
 
A,iZEo4!

AiZEo4




package listPractice;

public class Test {
    public static char[] modifyString(char[] str) {
        if (str == null) {
            return null;
        }    
        int j = 0;         
        for (int i = 0; i < str.length; i++) {
            if((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= '0' && str[i] <= '9')) {
                str[j++] = str[i];                 
            }            
        }  
        for (;j < str.length; j++) {
            str[j] = 0;
        }      
        return str;
    }
    
    public static void main(String[] args) {
        String res = modifyString("!AB".toCharArray());
        System.out.println(res);
    }
}

i/p : !!!!!!!!!!!AB
o/p :  
 str[1] = A
 str[2] = B
 
 str[0] = A
 str[1] = B
 
public Node removeElement(int key) {
    Node curr = head;
    Node prev = null;
    while(curr != null &&  curr.data != key) {
        prev = curr;
        curr = curr.next;
    } 
    prev.next = curr.next;
    return prev;
}


http://collabedit.com/e8ha3

*/