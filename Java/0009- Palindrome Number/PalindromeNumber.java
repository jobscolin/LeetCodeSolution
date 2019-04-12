public class PalindromeNumber{
	public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        
        for(int i=0;i<s.length()/2;i++){
           if(s.charAt(i) != s.charAt(s.length()-1-i)){
               return false;
           }
        } 
        return true;
    }


    public static boolean isPalindrome2(int x){
    	int reverse=0;
        int temp=x;
        while(temp>0){
            reverse=temp%10+reverse*10;
            temp=temp/10;
        }
        return reverse==x;
    }

    public static void main(String[] args) {
    	System.out.println(isPalindrome(121));//except true
    	System.out.println(isPalindrome(-121));//except false
    	System.out.println(isPalindrome(100));//except false


    	System.out.println(isPalindrome2(121));//except true
    	System.out.println(isPalindrome2(-121));//except false
    	System.out.println(isPalindrome2(100));//except false

    }
}