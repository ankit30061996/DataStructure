package LinkedLists;

public class Q11_DisplayLinkedList {

	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;	
			this.next=null;
			}
	}
	
	public static class linkedlist {
		Node head=null;
		Node tail=null;

		public void add(int data) {
			Node temp=new Node(data);
			if(head==null) {
				head=temp;
			}
			else {
				tail.next=temp;				
			}
			tail=temp;
		}
		
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		linkedlist l=new linkedlist();
        l.add(1);
        l.add(3);
        l.add(6);
        l.add(8);
        l.display();
	}

}
