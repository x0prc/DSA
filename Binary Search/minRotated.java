import java.util.*;

public class minRotated{
	public static int findMin(int[] arr){
		int low = 0, high = arr.length - 1;
		int ans = Integer.MAX_VALUE;
		while(low <= high){
			int mid = (low + high) / 2;
			//left part sorting
			if(arr[low] <= arr[high]){
				ans = Math.min(ans, arr[low]);
				low = mid + 1; //eliminate left half
			} else {
				//right part sorting
				ans = Math.min(ans, arr[mid]);
				high = mid - 1; //eliminate right half
			}
		}
			return ans;
		}
		public static void main(String[] args){
			int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
			int ans = findMin(arr);
			System.out.println("The minimum element is: " + ans);
		}
	}
}