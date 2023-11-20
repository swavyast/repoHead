package problemSolving;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class RemoveDuplicates {


    public int removeDuplicates(int[] nums) {

	int k=0;
	IntStream s1=Arrays.stream(nums).sorted();
	OptionalInt s2=Arrays.stream(nums).sorted().distinct().reduce((i, j)->i);
	k=(int) s1.distinct().count();
	return k;
    }

    public static void main(String[] args) {
	RemoveDuplicates rd=new RemoveDuplicates();
	int a[]= {5, 2, 6, 3, 4, 1, 8, 7, 9, 3, 4, 5, 6, 2};
	int k=rd.removeDuplicates(a);
	System.out.println("Number of Unique Elements in array a : "+k);
    }
}