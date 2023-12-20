package LinkedLists;


public class Q2_Basics {

	public static void display(Node head) {
	//  Printing using while loop.
			Node temp=head; 
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
	}
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
		
	//	Printing using for loop.
		/*
		Node temp=a;
		for(int i=1; i<=5; i++) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		*/
		display(a);
	}
}
