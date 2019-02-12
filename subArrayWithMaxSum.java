/**
 * https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
 * https://leetcode.com/problems/maximum-subarray
 * 
 * @author ezhilanmahalingam
 *
 */
public class SubArrayWithLargestSum {

	public static void main(String[] args) {
		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(largestSum(a));

	}

  /**
  Time Complexity: O(N) - N is number of elements in array
  Space Complexity: O(1)
  **/
  
	private static int largestSum(int a[]) {

		if (a.length == 1) {
			return a[0];
		}

		int max = a[0], prev_sum = a[0];

		for (int i = 1; i < a.length; i++) {
			prev_sum = Math.max(a[i], prev_sum + a[i]);
			max = Math.max(max, prev_sum);
		}
		return max;
	}

}
