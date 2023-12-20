package LinkedLists;

import org.w3c.dom.Node;

public class Q1_Basics {

	public static class Node {
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
		System.out.println(a);
		System.out.println(a.next);
		System.out.println(b);
		System.out.println(a.next.data);
		System.out.println(a.next.next.data);
		System.out.println(a.next.next.next.data);
}
}
