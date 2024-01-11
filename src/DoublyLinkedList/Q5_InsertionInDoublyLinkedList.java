package DoublyLinkedList;

public class Q5_InsertionInDoublyLinkedList {

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
		System.out.println();
	}
	
	// insertion at begining
	
	public static Node insertAtBegining(Node head, int x) {
		Node t=new Node(x);
		t.next=head;
		head.prev=t;
		head=t;
		return head;
	}
	
	// insertion at end
	
	public static void insertAtEnd(Node head, int x) {
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node t=new Node(x);
		temp.next=t;
		t.prev=temp;
	}
	
	// insert at any end
	
	 public static void insertAtAnyIndex(Node head, int index, int x) {
		 // s t r
		 Node s=head;
		 for(int i=1; i<=index-1; i++) {
			 s=s.next;
		 }
		 Node r=s.next;
		 Node t=new Node(x);
		 s.next=t;
		 t.prev=s;
		 t.next=r;		 
		 r.prev=t;
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
		Node t=insertAtBegining(a,40);
		display(t);
		System.out.println();
		insertAtEnd(a,90);
		display(a);
		insertAtAnyIndex(a, 3, 50);
		display(a);
	}
}
