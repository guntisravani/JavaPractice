package listPractice;
class ListNode1 {
	int data;
	ListNode1 next;
	public ListNode1(int x) {
		data = x;
		next = null;
	}
	public String toString() {
    	ListNode1 curr =  this;
    	String output = "";
    	while(curr != null) {
    		output += "[" +curr.data+"]";
    		curr = curr.next ;
    	}
    	return output;
    }	 
}
public class FrontBackSplit {
	public static ListNode1 add(ListNode1 list, int data) {
		ListNode1 tmp = new ListNode1(data);
		tmp.next = list;
		return tmp;
	}
	public static void split(ListNode1 head) {
		ListNode1 cur = head;
		int c = size(head);
 	 
	}
	public static int size(ListNode1 curr) {
	 	   if(curr == null) {
	 		   return 0;
	 	   }
	 	   return 1+size(curr.next);
	 	    }
	public static void main(String[] args) {
		ListNode1 list1 = new ListNode1(0);
		list1 = add(list1,1);
		list1 = add(list1,6); 
		list1 = add(list1,3); 
		list1 = add(list1,2); 
		list1 = add(list1,3); 
		System.out.println("List is: " + list1);
	}
}