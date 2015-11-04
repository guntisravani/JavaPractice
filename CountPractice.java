package listPractice;

import java.util.*;

 public class CountPractice<Item> implements Iterable<Item> {
	 private Node<Item> head;
	 //constructs an empty list
	 public CountPractice() {
		 head = null;
	 }
	 //Node class
	 private static class Node<Item> {
		 private Item data;
		 private Node<Item> next;
		 public Node(Item data, Node<Item> next) {
			 this.data = data;
			 this.next = next;
		 }
	 }
	 //inserts new node at the beginning of this list.
	 public void addFirst(Item item) {
		 head = new Node<Item>(item, head); 
	 }
	 //1: Count()- counts the number of times a given int occurs in a list. 
	 public int count(Item item) {
		 int count = 0;
		 Node<Item> tmp = head;
		 if(head == null) {
			 return 0;
		 }
		 while(tmp != null) {
			 if( tmp.data.equals(item)) {
			 count ++;
			 }
			 tmp = tmp.next;
		  }		 
		 return count;
	 }
	 //2: getNth() - takes an index and returns the data value stored at that index position. 
	 public Item getNth(int index) {
	   if(head == null)
		   throw new IndexOutOfBoundsException("Number doesnt exist");
	   Node<Item> tmp = head;
	   for(int i =0; i < index; i++) {
		   tmp = tmp.next;
		   if(tmp == null)
			   throw new IndexOutOfBoundsException("Number doesnt exist");
	   }
	   return tmp.data;
 	}
	 //3:delete() - takes a list, deallocates all of its memory and sets head pointer to null
	 public void delete() {
		head = null;
	 }
	 //4: pop() - takes a non empty list, deletes the head node and return the head notes data 
	  public Item pop() {
		Item tmp = head.data;
		head = head.next;
		return tmp;		
	 } 
	  //5: insertNth() - insert a new node at any index within a list.
	  public void insertNth(Item item, int index) {
		  if( index <= 0) {
			  System.out.println("an element cannot be inserted");
		  }
		  Node<Item> currE = head;
		  Node<Item> nextE = head.next; 
		  int count = 0;
		  while(nextE != null && count < index-1) {
			  currE = nextE;
			  nextE = nextE.next;
			  count++;
		  }
		  if(count != index-1) {
			  System.out.println("Sorry! there are less than" + (index -1)+"items in the list" );			  
		  } else {
			  Node<Item> tmp = currE.next;
			  Node<Item> newNode = new Node<Item>(item,tmp.next);
			  currE.next = newNode;
			  newNode.next = tmp;			  
		  }		  
  	  }
	  /*6: SortedInsert() - given a list sorted in increasing order, and a single node,
	  inserts the node into the correct sorted position in the list.SortedInsert() takes an existing node, 
	  and just rearranges pointers to insert it into the list.*/ 
	  public void sortedInsert(Node<Item> item) {
		  Node<Item> newNode = item;
		  Node<Item> cur = head;
		  Node<Item> prev = cur;
		  if(cur == null) {
			  cur = newNode;
		  } else {
			  if((Integer)item.data < (Integer)head.data) {
				  newNode.next = head;
				  head = newNode;
			  } else {
				  while(cur != null) {
					  if((Integer)item.data > (Integer)cur.data) {
						  prev = cur;
						  cur = cur.next;
					  } else {
						  prev.next = newNode;
						  newNode.next = cur;						  
					  }
					  if(cur == null) {
						  prev.next = newNode;
						  newNode.next = null;
					  }
				  }
			  }
		  }		  
	  } 
	  /*7: InsertSort() - function which given a list, rearranges its nodes so they are sorted in increasing order*/
	  /*public void insertSort() {
		  System.out.println("entered insert sort");
		   while(head != null || head.next !=null) {
		  System.out.println("in while now");
		  Node<Item> cur = head;
		  Node<Item> point = head.next;
		  while(point != null) {
			  System.out.println("inside point");
			  Node<Item> innerPoint = cur;
			  Node<Item> next = point.next;
			  if((Integer)point.data <= (Integer)cur.data) {
				  System.out.println("lallaa");
				  Node<Item> oldHead = cur;
				  cur = point;
				  cur.next = oldHead;
			  } else {
				  System.out.println("tututut");
				  while(innerPoint.next != null) {
					  System.out.println("hahaha");
					  if((Integer)point.data > (Integer)innerPoint.data && (Integer)point.data <= (Integer)innerPoint.data) {
						Node<Item> oldnext = innerPoint.next;
						innerPoint.next = point;
						point.next = oldnext;
					  }
					  innerPoint = innerPoint.next;
				  }
				if(innerPoint.next == null && (Integer)point.data > (Integer)innerPoint.data) {
					innerPoint.next = point;
					point.next = null;
				}
			  }
			  point = next;
		  }
		   }
	  }*/
	 //  public void 
	 public static void main(String[] args) {
		 CountPractice<Integer> list = new CountPractice<Integer>();
		 CountPractice<Integer> list1 = new CountPractice<Integer>();
		 list.addFirst(1);
		 list.addFirst(5);
		 list.addFirst(2);
		 list.addFirst(3);
		 list.addFirst(4);
		 list.addFirst(8);
		 list.addFirst(1);
		 list1.addFirst(5);
		 list1.addFirst(6);
		 list1.addFirst(9);
		 list1.addFirst(10);
		 System.out.println("List is: "+list); 
		 int tmpCount = list.count(1);		  
		 System.out.println("count of char"+ tmpCount);
		 System.out.println("Nth element is:"+list.getNth(1));
		 System.out.println("Nth element is:"+list.getNth(2));
		 System.out.println("Nth element is:"+list.getNth(3));
		 System.out.println("Nth element is:"+list.getNth(4));
		  list.insertNth(7,3);
		  list.insertNth(9,10);
		  int x = list.count(7);		  
		 System.out.println("count of char"+ x);	 
		 // list.insertSort();
		 System.out.println("Nth element is:"+list.getNth(2));
		// list.sortedInsert(11);
		 	 
	 }
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
 }