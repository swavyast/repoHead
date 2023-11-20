package problemSolving;

public class Palindrome {

	public boolean isPalindrome(int x) {
		boolean result = false;
		int temp=0;
		int sum=0;
		int r=0;
		temp=x;
		while(x>0) {
			r=x%10;
			sum=(sum*10)+r;
			x=x/10;
		}
		if(sum==temp)
			result=true;
		return result;
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean result=p.isPalindrome(121);
		System.out.println(result);
	}
}