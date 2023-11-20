package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleUsingList {
    public List<Integer> getRow(int rowIndex) {
		List<List<Integer>> triangle=new ArrayList<>();
		for(int i=0; i<=rowIndex;i++) {
			List<Integer> row=new ArrayList<Integer>();
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
				row.add(1);
				}else {
					int prevRow=i-1;
					int leftValue=triangle.get(prevRow).get(j-1);
					int rightValue=triangle.get(prevRow).get(j);
					row.add(leftValue+rightValue);
				}
			}
			triangle.add(row);
		}
    	return triangle.get(rowIndex);
    }
    public static void main(String[] args) {
		PascalTriangleUsingList p=new PascalTriangleUsingList();
		List<Integer> l1=p.getRow(4);
		System.out.println(l1);
	}
}
