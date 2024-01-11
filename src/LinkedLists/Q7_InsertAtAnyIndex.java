package LinkedLists;

public class Q7_InsertAtAnyIndex {

 public static class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    	}
     }
 
 public static class linkedlist {
        Node head=null;
        Node tail=null;
 
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
    		 head=tail=temp;
    	 }
    	 else {
    		temp.next=head;
    		head=temp;
    	 }
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
     }
     
     void insertNodeAtAnyIndex(int index, int value) {
    	 Node t=new Node(value);
    	 Node temp=head;
    	 
    	 if(index==size()) {
    		 insertAtEnd(value);
    		 return;
    	 }
    	 else if(index==0) {
    		 insertAtBegining(value);
    		 return;
    	 }
    	 else if(index<0 || index>size()) {
    		 System.out.println("Wrong Entry");
    	 }
    	 
    	 for(int i=1; i<index-1; i++) {
    		 temp=temp.next;
    	 }
    	 t.next=temp.next;
    	 temp.next=t;
     }
     
     
     int size() {
    	int count=0;
    	Node temp=head;
    	while(temp!=null) {
    		count++;
    		temp=temp.next;
    	}
    	return count;
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
	}
}
