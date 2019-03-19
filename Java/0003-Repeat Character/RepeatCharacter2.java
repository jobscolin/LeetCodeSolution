//这里讲一种暴力解法 直接遍历 n*n*n 时间复杂度n(n^3)
import java.util.HashSet;
public class RepeatCharacter2{
	public static int lengthOfLongestSubstring(String s) {
		int max=0;
		int n=s.length();
		for (int i=0;i<n ;i++ ) {
			for (int j=i+1;j<=n;j++ ) {
				HashSet<Character>set=new HashSet<>();
				boolean isUnique=true;
				for (int k=i;k<j ;k++ ) {
					if (set.contains(s.charAt(k))) {
						isUnique=false;
						break;
					}else {
						set.add(s.charAt(k));
					}
				}
				if (isUnique) {
					max=Math.max(max,j-i);
				}
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int max=lengthOfLongestSubstring("ababa");
		System.out.print(max);	
	}

}