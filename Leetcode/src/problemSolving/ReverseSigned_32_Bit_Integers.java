package problemSolving;

public class ReverseSigned_32_Bit_Integers {
	public int reverse(int x) {
		int temp = 0;
		int rev = 0;
		int len = 0;
		int first = x % 10;
		int second = (x / 10) % 10;
		int lastF = x / 1000000000;
		int lastS = (x / 100000000) % 10;
		System.out.println("initial value of first: " + first);
		System.out.println("initial value of second: " + second);
		System.out.println("initial value of lastF: " + lastF);
		System.out.println("initial value of lastS: " + lastS);
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x /= 10;
			len++;
			temp = rev;
			if (len == 10) { // main if starts
				if (first > 2) {
					rev = 0;
				} else if (first == 2 && second > 1) {
					rev = 0;
				} else if (lastS > 4) {
					rev = 0;
				} else if (lastS == 4 && lastS > 7) {
					rev = 0;
				} else {
					if (first < -2) {
						rev = 0;
					} else if (first == -2 && second < -1) {
						rev = 0;
					} else if (lastS < -4) {
						rev = 0;
					} else if (lastS == -4 && lastS < -8) {
						rev = 0;
					} else {
						rev = temp;
					}
				}
			} else {
				if (rev > 2147483647 || rev < -2147483648) {
					rev = 0;
				} else {
					rev = temp;
				}
			}
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		ReverseSigned_32_Bit_Integers rsint = new ReverseSigned_32_Bit_Integers();
		int res = rsint.reverse(1534236469);
		System.out.println(res);
		System.out.println("end");
	}
}

/*
 * -2147483648 2147483647
 * 
 * **********test cases ******** 1463847412 **************** 2147483641
 * 1563847412 **************** 0 -2147483648 **************** 0 1534236469
 * **************** 0 -2147483412 **************** -2143847412 120
 * **************** 21 -123 **************** -321 123 **************** 321
 * 
 */
