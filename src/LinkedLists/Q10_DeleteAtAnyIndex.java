package LinkedLists;

public class Q10_DeleteAtAnyIndex {

	public static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public static class linkedlist{
		Node head=null;
		Node tail=null;
		int size=0;

		 // insert node at begining
		 
		     void display() {
		    	 Node temp=head;
		    	 while(temp!=null) {
		        	 System.out.print(temp.data +" ");
		    		 temp=temp.next;
		    	 }
		     }   
		        
		     void insertAtBegining(int value) {
		    	 Node temp=new Node(value);
		    	 if(head==null) {
		    		 head=tail=null;
		    	 }
		    	 else {
		    		temp.next=head;
		    		head=temp;
		    	 }
		    	 size++;
		     }
		     
		     // insert node at end
		     
		     void insertAtEnd(int value) {
		    	 Node temp=new Node(value);
		    	 if(head==null) {
		    		 head=temp;
		    	 }
		    	 else {
		    		 tail.next=temp;
		    	 }
		    	 tail=temp;
		    	 size++;
		     }
		     
		     void insertNodeAtAnyIndex(int index, int value) {
		    	 Node t=new Node(value);
		    	 Node temp=head;
		    	 
		    	 if(index==size) {
		    		 insertAtEnd(value);
		    		 return;
		    	 }
		    	 else if(index==0) {
		    		 insertAtBegining(value);
		    		 return;
		    	 }
		    	 else if(index<0 || index>size) {
		    		 System.out.println("Wrong Entry");
		    	 }
		    	 
		    	 for(int i=1; i<index-1; i++) {
		    		 temp=temp.next;
		    	 }
		    	 t.next=temp.next;
		    	 temp.next=t;
		    	 size++;
		     }
		     

			int getValueAtIndex(int index) {				
				if(index<0 || index>size) {
		    		 System.out.println("Wrong Entry");
		    		 return -1;
		    	 }
				Node temp=head;
				for(int i=1; i<=index; i++) {
					temp=temp.next;
				}
				return temp.data;
			}

			 void deleteAtAnyIndex(int index) {
				if(index==0) {
					head=head.next;
					size--;
					return;
				}
				Node temp=head;
				for(int i=1; i<=index-1; i++) {
					temp=temp.next;
				}
				temp.next=temp.next.next;
				tail=temp;
				size--;
			}
	}
	
	public static void main(String[] args) {
 
		linkedlist l=new linkedlist();
		l.insertAtEnd(2);
	    l.insertAtEnd(3);
	    l.insertAtEnd(4);
	    l.insertAtEnd(5);
	    l.insertAtEnd(6);
	    l.insertAtBegining(7);
	    l.insertAtBegining(5);
	    l.insertAtBegining(9);
	    l.insertAtBegining(0);
	    l.insertAtBegining(4);
		l.insertNodeAtAnyIndex(0, 5);
		l.insertNodeAtAnyIndex(7, 6);
		l.insertNodeAtAnyIndex(9, 15);
        l.display();
        System.out.println();
        l.deleteAtAnyIndex(2);
        l.display();
		
	}
}
