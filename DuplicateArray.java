package javarevisited;

public class DuplicateArray {
public static void duplicate(int[] arr) {
	 int[] tmp = new int[arr.length];
	 for(int i = 0; i < arr.length; i++) {
		 int count = 0;
		 for(int j = 0; j < arr.length; j++) {
			 if(arr[i] == arr[j]) {	
				 tmp[i] = arr[i];
				 count++;
			 }		
		 }
		 if(count > 1) {			 
			 System.out.println("Dups are:"+tmp[i]); 
		 }
	 }
	  
}
public static void main(String[] args) {
	int[] arr ={3,3, 4, 7, 1, 4};
	duplicate(arr);
	
	}
}
