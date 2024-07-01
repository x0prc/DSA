import java.util.*;

public class inversionsCount {
	private static int merge(int[] arr, int low, int mid, int high){
		ArrayList<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		int cnt = 0;
		
		//elements in sorted temp array
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				cnt += (mid - left + 1);
				right++
			}
		}
		// if elements on left are still left
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		// if elements on right are still left
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i = low; i <= high; i++){
			arr[i] = temp.get(i - low);
		}
		return cnt;
	}
	
	pubic static int mergeSort(int[] arr, int low, int high){
		int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
	}
		public static int numberOfInversions(int[] a, int n) {
			return mergeSort(a, 0, n - 1); //number of pairs
		}
		
		public static void main(String[] args){
			int[] a = {5, 4, 3, 2, 1};
			int n = 5;
			int cnt = numberOfInversions(a, n);
			System.out.println("The number of inversions are" + cnt);
		}

}	

