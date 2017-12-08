package in.co.kani;

public class StackArray {
	int capacity = 5;
	int arr[] = new int[capacity];
	int top = -1;

	public void push(int data)
	{
		if(top < capacity -1)
		{
			top++;
			arr[top] = data;
		}
		else
		{
			System.out.println("Stack Overflow Error !!!");
		}
	}


	public int pop()
	{
		int popval;
		if(top == -1)
		{
			System.out.println("Stack is Empty !!!");
			return -1;
		}
		else
		{
			popval = arr[top];
			top--;
		}
		return popval;
	}

	public static void main(String[] args) {
		StackArray array = new StackArray();
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		array.push(5);
		array.push(6);
		array.push(7);
		array.push(8);
		array.push(9);
		System.out.println(array.pop());
	}
}
