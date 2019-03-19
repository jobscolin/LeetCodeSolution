//[i,j]左右平移，时间复杂度O(2n)
import java.util.HashSet;
public class RepeatCharacter{
	static class Solution {
		public int lengthOfLongestSubstring(String s) {
			int i=0, j=0,max=0;
			int n=s.length();
			HashSet<Character>set=new HashSet<>();
			while(i<n&&j<n){
				if(!set.contains(s.charAt(j))){
					set.add(s.charAt(j));
					j++;
					max=Math.max(max,j-i);
				}else{
					set.remove(s.charAt(i));
					i++;
				}
			}
			return max;
		}
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
		int max=solution.lengthOfLongestSubstring("abstract");
		System.out.print(max);
	}
}