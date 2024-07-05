import java.util.*;

public class sqrtBinary {
	public static int floorSqrt(int n){
		int low = 1, high = n;
		
		while(low <= high) {
			long mid = (low + high) / 2;
			long val = mid * mid;
			if (val <= (long)(n)){
				low = (int)(mid + 1);
			} else {
				high = (int)(mid - 1);
			}
		}
		return high;
	}
	public static void main(String[] args){
		int n = 28;
		int ans = floorSqrt(n);
		System.out.println("The square root of" + n + "is: " + ans);
	}
}
