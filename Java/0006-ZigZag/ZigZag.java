public class ZigZag{
    
    public static String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        StringBuilder result=new StringBuilder();
        
        int mid=2*numRows-2;
        for(int i=0;i<numRows;i++){
            for(int j=0;i+j<s.length();j+=mid){
                result.append(s.charAt(i+j));
                if(i!=0&&i!=numRows-1&&j+mid-i<s.length()){
                    result.append(s.charAt(j+mid-i));
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //Input: s = "PAYPALISHIRING", numRows = 3
        //Output: "PAHNAPLSIIGYIR"
        String s = "PAYPALISHIRING";
        int numRows=3;
        String except="PAHNAPLSIIGYIR";
        String result =convert(s,numRows);
        System.out.println(result.equals(except));
    }

}