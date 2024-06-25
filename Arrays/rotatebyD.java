import java.util.*;

public class rotatebyD{
	
	public static void Reverse(int[] arr, int start, int end) {
		while (start <= end) {
			int temp = arr[start]; 
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}