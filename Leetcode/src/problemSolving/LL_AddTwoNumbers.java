package problemSolving;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}

public class LL_AddTwoNumbers {
	int sum = 0;
	int carry = 0;
	ListNode result = new ListNode();

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) throws NullPointerException {
		switch(sum=1) {
		case 1:
		    System.out.println("1");
		case 2:
		    System.out.println("2");
		    break;
		case 3:
		    System.out.println("3");
		    break;
		default:
		    System.out.println("default");
		    //break;
		case 4:
		    System.out.println("x");
		}
		System.out.print(l1.val);
		System.out.print(l1.next.val);
		System.out.println(l1.next.next.val);
		System.out.print(l2.val);
		System.out.print(l2.next.val);
		System.out.println(l2.next.next.val);
		while (l1 != null || l2 != null) {
			sum = l1.val + l2.val + carry;
			if (sum > 10) {
				result.val = result.val * 10 + sum;
				result.next = new ListNode();
				l1 = l1.next;
				l2 = l2.next;
			} else {
				carry = sum / 10;
				sum = sum % 10;
				result.val = result.val * 10 + sum;
				result.next = new ListNode();
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		// result.next.next.val=result.val;
		return result;
	}

	public static void main(String[] args) {
		LL_AddTwoNumbers ln = new LL_AddTwoNumbers();
		ListNode res = new ListNode();

		ListNode m1 = new ListNode(2);
		ListNode m2 = new ListNode(4);
		m1.next = m2;
		ListNode m3 = new ListNode(3);
		m2.next = m3;
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(6);
		n1.next = n2;
		ListNode n3 = new ListNode(5);
		n2.next = n3;
		res = ln.addTwoNumbers(m1, n1);
		System.out.println(res.val);
	}
	
	 
}
