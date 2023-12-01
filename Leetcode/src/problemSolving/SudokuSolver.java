package problemSolving;

public class SudokuSolver {
    
    public void solveSudoku(char[][] board) {
	
	char[][] block= new char[3][3];
        
	for(int i=0;i<=board[i].length-1;i++) {
	    for(int j=0;j<=board[i].length-1;j++) {
		for(int k=0;k<=block[i].length-1;k++) {
		    for(int l=0;l<=block[i].length-1;l++){
			if(i<=3&&j<=3) {
			block[k][l]=board[i][j];
			}else {
			    k=l=0;
			}
		    }
		}
	    }
	}
	System.out.println("printing block-wise");
	for(int i=0;i<=board[i].length-1;i++) {
	    for(int j=0;j<=board[i].length-1;j++) {
		for(int k=0;k<=block[i].length-1;k++) {
		    for(int l=0;l<=block[i].length-1;l++){
			if(i<=3&&j<=3) {
			System.out.println(board[k][l]);
			}else {
			    k=l=0;
			}
		    }
		}
		System.out.println("#");
	    }
	}
    }
    
    public static void main(String[] args) {
	
	SudokuSolver ss=new SudokuSolver();
	char [][] board = {{'5','3','.','.','7','.','.','.','.'},
	                     {'6','.','.','1','9','5','.','.','.'},
	                     {'.','9','8','.','.','.','.','6','.'},
	                     
	                     {'8','.','.','.','6','.','.','.','3'},
	                     {'4','.','.','8','.','3','.','.','1'},
	                     {'7','.','.','.','2','.','.','.','6'},
	                     
	                     {'.','6','.','.','.','.','2','8','.'},
	                     {'.','.','.','4','1','9','.','.','5'},
	                     {'.','.','.','.','8','.','.','7','9'}};
	ss.solveSudoku(board);
	
    }
}
