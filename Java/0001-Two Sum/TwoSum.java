/**
* 最暴力的解法，直接遍历n*(n-1)，O(n^2)
*/
public class TwoSum{

	static class Solution {
    	public int[] twoSum(int[] nums, int target) {
    	int[] result=new int[2];
        	for(int i=0;i<nums.length-1;i++){
        		for (int j=1; j<nums.length; j++) {
        			if (target==nums[i]+nums[j]) {
        				result[0]=i;
        				result[1]=j;
        				return result;
        			}
        		}
        	}

        	throw new IllegalArgumentException("have not nums");

    	}
	}
	public static void main(String[] args){
		Solution solution=new Solution();
		int [] nums = {2, 7, 11, 15};
		int[] result=solution.twoSum(nums,18);
		System.out.print("["+result[0]+","+result[1]+"]");

	}
}