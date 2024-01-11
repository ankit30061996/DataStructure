package LinkedLists;

public class Q9_InsertAtEnd {

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public static void display(Node head) {

		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	public static void insertAtEnd(Node head, int value) {
		Node temp=new Node(value);
		Node t=head;
		while(t.next!=null) {
			t=t.next;
		}
		t.next=temp;
	}
	
	public static void main(String[] args) {
	
	Node a=new Node(5);
	Node b=new Node(7);
	Node c=new Node(10);
	a.next=b;
	b.next=c;
	display(a);
	System.out.println();
	insertAtEnd(a,50);
	display(a);
	}
}
