package problemSolving;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
	double med = 0;
	double sum=0;
	int l=0;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) throws IndexOutOfBoundsException {
    	int[] nums=new int[nums1.length+nums2.length];
    	System.arraycopy(nums1, 0, nums, 0, nums1.length);
    	System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
    	Arrays.sort(nums);
    	l=nums.length;
    	if(l%2==0){
    		sum=((nums[(l/2)-1]+nums[l/2]));
    		if(sum>0) {
    		med=sum/2;
    		}else {
    			sum=0;
    			for(int i:nums) {
    				sum=sum+i;
    				System.out.println(sum);
    				}
    			med=sum/2;
    		}
    	}else if(l==1) {
    		med=nums[0];
    	}else{
    		try {
    		med=nums[l/2];
    		}catch(Exception e) {e.printStackTrace();}
    	}
        return med;
    }
	public static void main(String[] args) {
		MedianOfTwoSortedArrays m=new MedianOfTwoSortedArrays();
		int a[]= {};
		int b[]= {1,2,3,4,5};
		double med=m.findMedianSortedArrays(a, b);
		System.out.println(med);
		//System.out.println(sum);
	}

}
/*
 * if(nums.length/2==0) median=nums[nums.length/2+1]; else
 * median=nums[nums.length/2];
 *     	for(int i:nums)
    	System.out.println(i);
 */