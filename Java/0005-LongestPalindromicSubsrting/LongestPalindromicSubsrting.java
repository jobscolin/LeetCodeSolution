public class LongestPalindromicSubsrting{
	public static  String longestPalindrome(String s) {
		//先判断为null和空字符串的
        if(s==null||"".equals(s)){
            return "";
        }
        
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
        	//这里直接执行2个，主要是回文会出现长度为奇数或偶数个
            int len1=maxLength(s,i,i);
            int len2=maxLength(s,i,i+1);
            int max=Math.max(len1,len2);
            if(max>=right-left+1){
                left=i-(max-1)/2;
                right=i+max/2;
            }
        }
        return s.substring(left,right+1);
    }
    
    public static int maxLength(String s,int left,int right){
        int minLeft=left;
        int maxRight=right;
        //循环判断醉倒回文字符长度
        while(minLeft>=0&&maxRight<s.length()&&s.charAt(minLeft)==s.charAt(maxRight)){
            minLeft--;
            maxRight++;
        }
        return maxRight-minLeft-1;
    }

    public static void main(String[] args) {
    	System.out.println(longestPalindrome("asf"));
    	System.out.println(longestPalindrome("ababc"));
    	System.out.println(longestPalindrome("aabbccd"));
    }
	
}