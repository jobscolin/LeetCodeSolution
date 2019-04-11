public class Atoi{
	public static int myAtoi(String str) {
		if(str==null){
			return 0;
		}
		String s=str.trim();

		int result =0;
		int flag=1;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(i==0&&c=='-'){
				flag=-1;
			}else if(i==0&&c=='+'){
				flag=1;
			}else if(c<='9'&&c>='0'){
				int mod=0;
				for(int j=0;j<10;j++){
					mod+=result;
                    if(result<0&&mod>result){//超出最小值
                    	return Integer.MIN_VALUE;
                    }else if(result>0&&mod<result){//超出最大值
                    	return Integer.MAX_VALUE;
                    }
                }
                mod=mod+(c-'0')*flag;

                if(result<0&&mod>result){//超出最小值
                	return Integer.MIN_VALUE;
                }else if(result>0&&mod<result){//超出最大值
                	return Integer.MAX_VALUE;
                }
                result = mod;

            }else{
            	break;
            }
        }

        return result;
    }


    public static void main(String[] args) {
    	System.out.println(myAtoi("   111")); //except 111
    	System.out.println(myAtoi("fsdfsaa11")); //except 0
    	System.out.println(myAtoi("-+123")); //except 0
    	System.out.println(myAtoi("22 34")); //except 22
    	System.out.println(myAtoi("1234567890000000000000")); //except Integer.MAX_VALUE
    }
}