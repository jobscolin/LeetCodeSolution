public class ReverseInterger{

	public static  int reverse(int x) {
		long result=0;
		while(x!=0){
			int mod=x%10;
			x=x/10;
			result=result*10+mod;
		}
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
			return 0;
		}
		return (int)result;
	}
	public static void main(String[] args) {
		
		int x=123;
		int y=-123;
		int z=1230;
		int max=1534236469;
		System.out.println(reverse(x));//except 321
		System.out.println(reverse(y));//except -321
		System.out.println(reverse(z));//except 321
		System.out.println(reverse(max));//except 0
	}
}