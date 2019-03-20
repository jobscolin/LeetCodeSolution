
//使用hashmap优化hashset，遍历一遍字符串，把所有字符为key，并把index+1为value存到hashmap中，
//i偏移只有当存在字符相同时进行偏移到前一个字符为位置index+1所以正好的map的value， 只走o(n)的时间复杂度

import java.util.HashMap;
public class RepeatCharacter3{
	public static int lengthOfLongestSubstring(String s) {
		int n=s.length();
		HashMap<Character, Integer>map=new HashMap<>();
		int max=0;
		for (int i=0,j=0; j<n;j++ ) {
			if (map.containsKey(s.charAt(j))) {
				i=Math.max(i,map.get(s.charAt(j)));
			}
			max=Math.max(max,j-i+1);
			map.put(s.charAt(j),j+1);
		}
		return max;
	}

	public static void main(String[] args) {
		int max=lengthOfLongestSubstring("abstract");
		System.out.print(max);
	}
}