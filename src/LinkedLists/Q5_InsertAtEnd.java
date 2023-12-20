package LinkedLists;

public class Q5_InsertAtEnd {

	public static class linkedlist {
		Node head=null;
		Node tail=null;
		
		// insert node at end.
		
		void insertAtEnd(int value) {
			Node temp=new Node(value);
			if(head==null) {
				head=temp;
			}
			else {
				tail.next=temp;
			}
			tail=temp;
		}
		
		// insert node at begining
		
		void insertAtBegining(int value) {
			Node temp=new Node(value);
			if(head==null) {
				head=tail=temp;
			}
			else {
				temp.next=head;
				head=temp;
			}
		}
		
		// insert node at any place
		
		void insertAtAnyPlace(int idx, int value) {
			Node t=new Node(value);
			Node temp=head;
			if(idx==length()) {
				insertAtEnd(value);
				return;
			}
			else if(idx==0) {
				insertAtBegining(value);
				return;
			}
			else if(idx<0 || idx>length()) {
				System.out.println("Wrong index");
				return;
			}
			for(int i=1; i<=idx-1; i++) {
				temp=temp.next;
			}
			t.next=temp.next;
			temp.next=t;
		}
		
		// display the node.
		
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		// find the length of the node.
		
		int length() {
			Node temp=head;
			int count=0;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}
			return count;
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
      linkedlist l1=new linkedlist();
      l1.insertAtEnd(2);
      l1.insertAtEnd(3);
      l1.insertAtEnd(4);
      l1.insertAtEnd(5);
      l1.insertAtEnd(6);
      l1.display();
      System.out.println();
      l1.insertAtBegining(7);
      l1.display();
      int size=l1.length();
      System.out.println( );
      System.out.println(size);
      l1.insertAtAnyPlace(2, 9);
      System.out.println();
      l1.display();
	}
}
