public class RegularExpressionMatching{

	public static boolean isMatch(String text, String pattern) {
  		//如果pattern为空的话，那么验证text是否为空
		if(pattern.isEmpty()){
			return text.isEmpty();
		}
        //text不为空的情况下，验证text和pattern第一个字符是否相等，或者pattern的第一个字符是否为'.'
		boolean firstMatch=!text.isEmpty()&&(text.charAt(0)==pattern.charAt(0)||pattern.charAt(0)=='.');

        //如果pattern长度大于等于二，去查看第二个字符是否是’*‘，不是的话很好理解直接验证下一个字符；如果是的话
        //那么久要分2中情况 *是0个还是多个，0个的时候那么前一个
		if(pattern.length()>=2 && pattern.charAt(1)=='*'){
			return (firstMatch&&isMatch(text.substring(1),pattern))
			||isMatch(text,pattern.substring(2));
		}else{
			return firstMatch&&isMatch(text.substring(1),pattern.substring(1));
		}
	}

	public static void main(String[] args) {
		System.out.println(isMatch("abcd","abc"));  //except false
		System.out.println(isMatch("aabd","a*bd")); //except true 
		System.out.println(isMatch("adfadsfasd",".*")); //except true
	}
}