package in.co.kani;

public class StackLinkedList {
	StackNode head;
	int size = 0;

	public int getSize() {
		return size;
	}
	
	public void push(int data)
	{
		StackNode temp = new StackNode(data);
		if(getSize() == 0)
		{
			head = temp;
		}
		else
		{
            StackNode tmp = head;
            temp.next = tmp;
			head = temp;
		}
		size++;
	}
	
	public int pop()
	{
		if(getSize() == 0)
		{
			System.out.println("Stack is Empty!!!");
			return -1;
		}
		else
		{
			StackNode temp = head;
			head = head.next;
			return temp.data;
		}
	}
	public void printStack()
	{
		StackNode stackNode = head;
		while(stackNode != null)
		{
			System.out.print(" "+stackNode.data);
			stackNode = stackNode.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		StackLinkedList stackLinkedList = new StackLinkedList();
		stackLinkedList.push(10);
		stackLinkedList.push(15);
		stackLinkedList.push(20);
		stackLinkedList.printStack();
		System.out.println(stackLinkedList.pop());
		stackLinkedList.push(25);
		stackLinkedList.push(30);
		stackLinkedList.push(35);
		stackLinkedList.push(40);
		stackLinkedList.push(45);
		stackLinkedList.push(50);
		stackLinkedList.printStack();
		System.out.println(stackLinkedList.pop());
	}
}

class StackNode
{
	int data;
	StackNode next;
	
	public StackNode(int data) {
		this.data = data;
	}
}
