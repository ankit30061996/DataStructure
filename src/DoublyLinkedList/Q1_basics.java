package DoublyLinkedList;



public class Q1_basics {
	public static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data=data;
		}
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
		
		public static void display2(Node tail) {
			Node temp=tail;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prev;
			}
		}
		
	public static void main(String[] args) {
		Node a=new Node(5);
		Node b=new Node(6);
		Node c=new Node(7);
		Node d=new Node(8);
		Node e=new Node(9);
		a.prev=null;
		a.next=b;
		b.prev=a;
		b.next=c;
		c.prev=b;
		c.next=d;
		d.prev=c;
		d.next=e;
		e.prev=d;
		e.next=null;
		display(a);
		System.out.println();
		display2(e);
	}
}
