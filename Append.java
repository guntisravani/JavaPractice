package listPractice;

import java.util.ArrayList;

//takes two lists, 'a' and 'b', appends 'b' onto the end of 'a',and then sets 'b' to NULL
 
class ListNode {
	int data;
	ListNode next;
	public ListNode(int x) {
		data = x;
		next = null;
	}
	public String toString() {
    	ListNode curr =  this;
    	String output = "";
    	while(curr != null) {
    		output += "[" +curr.data+"]";
    		curr = curr.next ;
    	}
    	return output;
    }	 
}
public class Append {
	public static ListNode add(ListNode list, int data) {
		ListNode tmp = new ListNode(data);
		tmp.next = list;
		return tmp;
	}
    public static ListNode appending(ListNode list1,ListNode list2) {
    	System.out.println("In appending");    	 
    	if(list1 == null) {
    		System.out.println("in if");
    		return list2;
    	} else {
    		System.out.println("in else");
    	ListNode tmp = list1;
    	while(tmp.next.next != null){
    		tmp = tmp.next;
    	}
    	tmp.next.next = list2;    	
    	return list1;
    	}    	 
    }
    public static int size(ListNode curr) {
 	   if(curr == null) {
 		   return 0;
 	   }
 	   return 1+size(curr.next);
 	    }
  
	public static void main(String[] args) {
		ListNode list1 = new ListNode(0);
		list1 = add(list1,1);
		list1 = add(list1,6); 
		list1 = add(list1,3); 
		list1 = add(list1,2); 
		list1 = add(list1,3); 
		  
		 System.out.println("List 1: "+list1);
		 ListNode list2 = new ListNode(0);
		 list2 = add(list2,1);
		 list2 = add(list2,10); 
		 list2 = add(list2,11); 
		 list2 = add(list2,112); 
		 System.out.println("List 2:" + list2);
		 System.out.println("Appended lists:" + appending(list1, list2));
		 System.out.println("List 1 again:" +list1);
	}
}