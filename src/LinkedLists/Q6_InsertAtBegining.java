package LinkedLists;

public class Q6_InsertAtBegining {

	public static class linkedlist {
		Node head=null;
		Node tail=null;
		
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
      l1.insertAtBegining(7);
      l1.insertAtBegining(5);
      l1.insertAtBegining(9);
      l1.insertAtBegining(0);
      l1.insertAtBegining(4);
      l1.display();
      System.out.println( );
      int size=l1.length();     
      System.out.println(size);
	}
}