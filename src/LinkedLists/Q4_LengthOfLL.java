package LinkedLists;

public class Q4_LengthOfLL {

	// print iterative
	public static int length(Node head) {
		int count = 0;
		while(head!=null) {
			count++;
			head=head.next;
		}
		return count;
	}
	
	// print recursively
	
	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Node a=new Node(5);
		Node b=new Node(3);
		Node c=new Node(9);
		Node d=new Node(0);
		Node e=new Node(8);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		System.out.println(length(a));
	}
}
