package in.co.kani;

public class ReverseSinglyLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		list.display(list.head);
		list.reverseDisplay(list.head);
	}
}
class Node
{
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList
{
	public Node head;

	public LinkedList() {
		head = null;
	}

	public void addNode(int data)
	{
		Node n = new Node(data);
		n.next = head;
		head = n;
	}

	public void display(Node head)
	{
		Node curNode = head;
		while(curNode != null)
		{
			System.out.print("->"+curNode.data);
			curNode = curNode.next;
		}
	}
	
	public void reverseDisplay(Node head)
	{
		Node curNode = head;
		Node prevNode = null;
		Node nextNode = null;
		while(curNode != null)
		{
			nextNode = curNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			curNode = nextNode;
		}
		head = prevNode;
		display(head);
	}
}
