package listPractice;

class Node {
	int data; 
	Node next;
	public Node(int item) {
		  data = item;
		  next = null;
	}
	 public String toString() {
    	Node curr =  this;
    	String output = "";
    	while(curr != null) {
    		output += "[" +curr.data+"]";
    		curr = curr.next ;
    	}
    	return output;
    }	
}

public class Deletion {
	private static Node head;
	public static Node add(Node list, int data) {
		Node tmp = new Node(data);
		tmp.next = list;
		return tmp;
	}
 	public static void deleteLastOccurence(Node head) {
	Node cur = head;
	 while(cur.next.next != null) {
		 cur = cur.next;
	 }
	 cur.next = null;
	 System.out.println("cur.d ::::" + cur.data);
	}
	public static int size(Node curr) {
		if(curr == null) {
			return 0;
		}
		return 1+size(curr.next);
	}
	public static void main(String[] args) {
		Node list1 = new Node(3);
		list1 = add(list1,1);
		list1 = add(list1,6); 
		list1 = add(list1,3); 
		list1 = add(list1,2); 
		list1 = add(list1,3); 
		System.out.println("List :" +list1);
		 deleteLastOccurence(list1);
			System.out.println("List after deletion :" +list1);
	}
}
