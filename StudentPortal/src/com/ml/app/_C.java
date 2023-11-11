package com.ml.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _C {
	int a[]=new int[3];
	int b[]=new int[3];
	List<int[]> l;
	
    public List<List<Integer>> threeSum(int[] nums) {
    	System.out.println(l);
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length-1;j++){
                for(int k=2;k<nums.length-1;k++){
                    if(i!=j&&i!=k&&j!=k&&((nums[i] + nums[j] + nums[k]) == 0)){
                    	a[0]=i;
                    	a[1]=j;
                    	a[2]=k;
                    	l=Arrays.asList(a);
                    }
                }
            }
        }
        l.forEach(System.out::println);
        //System.out.println(main);
        return new ArrayList<List<Integer>>();
    }
    public static void main(String a[]){
        _C s=new _C();
        int n[]={-1,0,1,2,-1,-4};
        List<List<Integer>> result=s.threeSum(n);
        System.out.print(result);
    }
}
