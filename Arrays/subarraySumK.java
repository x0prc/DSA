import java.util.*;

public class subarraySumK{
	public static int findAllSubarraysWithGivenSum(int arr[], int k) {
		int n = arr.length;
		Map mpp = new HashMap();
		int preSum = 0, cnt = 0;
		
		mpp.put(0, 1);
		for(int i = 0; i < n; i++) {
			preSum += arr[i];
			int remove = preSum - k;
			cnt += mpp.getOrDefault(remove, 0);
			mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
		}
		return cnt;
	}
	public static void main(String[] args){
		int[] arr = {3, 1, 2, 4};
		int k = 6;
		int cnt = findAllSubarraysWithGivenSum(arr, k);
		System.out.println("The number of subarrays is" + cnt);
	}
}