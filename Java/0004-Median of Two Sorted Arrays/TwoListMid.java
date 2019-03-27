//求2个有序数组的中位数，要求时间复杂度是O(log(m+n));长度分别为m,n
//假设吧两个数组分辨拆分为2个数组，分辨拆分点为 i，j；并且i-1+j-1=m+n-i-j-1-1,
//此时我们只需要论证nums1[i-1]<nums2[j]&&nums2[j-1]<nums1[i],那么我们就可以认为我们找到了中位数，max(nums1[i-1],nums2[j-1])和min(nums1[i],nums2[j])


public class TwoListMid{
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
        //这里主要是让nums1的长度小于nums2的长度
		if(m>n){
			int [] temp=nums1;
			nums1=nums2;
			nums2=temp;
			int x=m;
			m=n;
			n=x;
		}
		int half=(m+n+1)/2;
		int imin=0;
		int imax=m;
		while(imin<=imax){
			int i=(imin+imax)/2;
			int j=half-i;
			if(i<imax && nums2[j-1]>nums1[i]){
				imin=i+1;
			}else if(i>imin && nums1[i-1]>nums2[j]){
				imax=i-1;
			}else{
				int maxLeft=0;
                if(i==0){//nums1 中最小值都比中位数大
                	maxLeft=nums2[j-1];
                }else if(j==0){//这个时候应该是nums1和nums2长度相等，并且nums2最小值都比nums1最大值大     
                	maxLeft=nums1[i-1];
                }else{//nums1 nums2中的值交错
                	maxLeft=Math.max(nums1[i-1],nums2[j-1]);
                }
                
                if((m+n)%2==1){//当总数量为奇数时直接返回就是中位数
                	return maxLeft;
                }
                
                int minRight=0;
                if(i==m){// nums1中最大值比中位数小，取右边最小值应该是nums2[j]
                	minRight=nums2[j];
                }else if(j==n){//nums2最大值比中位数小
                	minRight=nums1[i];
                }else{
                	minRight=Math.min(nums1[i],nums2[j]);
                }
                return (maxLeft+minRight)/2.0;
            }
            
        }
        return 0.0;
    }


    public static void main(String[] args) {
    	int[] list1={1,2,3,4,9,11,34,67,90,200};
    	int [] list2={2,4};
    	System.out.print(findMedianSortedArrays(list1,list2));
    }

}