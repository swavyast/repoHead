package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleUsingArray {
	public List<Integer> getRow(int rowIndex) {
		int triangle[][]=new int[rowIndex+1][rowIndex+1];
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<rowIndex+1;i++)
			for(int j=0; j<=i; j++) {
				if(j==0||j==i) {
					triangle[i][j]=1;
				}else {
					int left=triangle[i-1][j-1];
					int right=triangle[i-1][j];
					triangle[i][j]=(left+right);
				}
					l.add(j, triangle[i][j]);
			}
		return l.subList(0, rowIndex+1);
	}
	public static void main(String[] args) {
		PascalsTriangleUsingArray pt=new PascalsTriangleUsingArray();
		List<Integer> l1=pt.getRow(4);
		System.out.println(l1);
	}
}