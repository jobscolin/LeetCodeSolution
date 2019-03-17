
// 目前为止的最优解，通过hashmap，时间复杂度只有一个for循环O(n).

import java.util.HashMap;
public class TwoSum2{
		static class Solution {
    	public int[] twoSum(int[] nums, int target) {
    		int[] result=new int[2];
    		HashMap<Integer, Integer> map = new HashMap<>();
        	for(int i=0;i<nums.length;i++){
        		int cut=target-nums[i];
        		if (map.containsKey(cut)) {
        			result[0]=map.get(cut);
        			result[1]=i;
        			return result;
        		}
        		map.put(nums[i],i);
        	}

        	throw new IllegalArgumentException("have not nums");

    	}
	}
	public static void main(String[] args){
		Solution solution=new Solution();
		int [] nums = {2, 7, 11, 15};
		int[] result=solution.twoSum(nums,9);
		System.out.print("["+result[0]+","+result[1]+"]");

	}
}