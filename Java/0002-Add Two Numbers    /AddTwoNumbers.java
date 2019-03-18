public class AddTwoNumbers{
	static class ListNode {
    	int val;
    	ListNode next;
    	ListNode(int x) { val = x; }
 	}
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        	ListNode p=l1,q=l2;
        	ListNode head=new ListNode(1);
        	ListNode result=head;
        	int add=0;
        	while(p!=null||q!=null){
        		int x = p==null ? 0 :p.val;
        		int y = q==null ? 0 :q.val;
        		int sums=x+y+add;
        		add=sums/10;
        		head.next=new ListNode(sums%10);
        		head=head.next;
        		if (p!=null) {
        			p=p.next;
        		}
        		if (q!=null) {
        			q=q.next;
        		}
        	}
        	if (add>0) {
        		head.next=new ListNode(1);
        	}
        	return result.next;
    }

    public static void main(String[] args) {
    	ListNode l1=new ListNode(1);
    	l1.next=new ListNode(3);
    	l1.next.next=new ListNode(6);

    	ListNode l2=new ListNode(2);

    	ListNode result=addTwoNumbers(l1,l2);
    	while(result!=null){
    		System.out.println(result.val);
    		result=result.next;
    	}
    }
	
}