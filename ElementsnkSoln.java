package javarevisited;

public class ElementsnkSoln {

	public static int[] elementsNK(int[] arr,int k) {
		 int[] tmp = new int[arr.length];
		 for(int i = 0; i < arr.length; i++) {
			 int count = 0;
			 for(int j = 0; j < arr.length; j++) {
				 if(arr[i] == arr[j]) {	
					 tmp[i] = arr[i];
					 count++;
				 }		
			 }
			 if(count >(arr.length/k) )  {			 
				 System.out.println("Dups are:"+tmp[i]); 
				 return tmp;
			 }			 
		 }
		 return null;
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,3,3,3,4,4,5,6}; 
		elementsNK(arr,6);
		//System.out.println
	}
}
