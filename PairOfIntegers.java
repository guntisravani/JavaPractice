package javarevisited;

import java.util.ArrayList;

//Find all pair of integer array whose sum is equal to given number.	
public class PairOfIntegers {
public static void pairOfInt(int[] arr, int k) {
	 for(int i = 0;i < arr.length; i++) {
		 for(int j = i+1;j < arr.length; j++) {
			 int tmp = arr[i] +arr[j];
			 if(tmp == k) {
				 System.out.println(arr[i] +","+ arr[j]);
			 }
		 }
	 }
	
}
public static void main(String[] args) {
	int[] arr = {0,1,2,2,3,4,5};
	pairOfInt(arr, 4);
}
}