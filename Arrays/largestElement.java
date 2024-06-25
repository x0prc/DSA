import java.util.*;

// sol strategies : bruteforce -> better -> optimal

// declare arrays -> create arr[0] -> compare arr[i] with max value using for and if.

public class largestElement() {
	
	public static void main(String args[]) {
		
		int arr1[] = {2, 5, 1, 3, 0};
		System.out.println("The largest element is:" + sort(arr1));
		
		int arr2[] = {8, 10, 5, 7, 9};
		System.out.println("Largest element in this array is") + sort(arr2));
	}
	
	static int sort(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++){
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}