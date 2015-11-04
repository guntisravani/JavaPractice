package javarevisited;

public class ReverseArrayInPlace {
public static void reverse(int[] data) {
	int left = 0;
    int right = data.length - 1;

    while( left < right ) {
        // swap the values at the left and right indices
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        // move the left and right index pointers in toward the center
        left++;
        right--;
    }
	/*for(int i = 0; i < arr.length; i++) {
		int tmp = arr[i];
		arr[i] = arr[arr.length - i - 1];
		arr[arr.length - 1] = tmp;
		System.out.println(arr[i]);
	}*/
}
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	for(int i =0 ; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
	reverse(arr); 	
	System.out.println("");
	for(int i =0 ; i < arr.length; i++) {
		System.out.print(arr[i]);
	}
}
}
