package in.co.kani;

public class StackStringReverse 
{
	char[] revChar;
	int top = -1;
	public StackStringReverse() {
	}

	public StackStringReverse(String str)
	{
		push(str);
	}

	public void push(String str)
	{
		if(str != null) {
		int len = str.length();
		revChar = new char[len];
			for (int i = 0; i < len; i++) {
				top++;
				revChar[top] = str.charAt(i);
			}
		}
	}
	
	public void print()
	{
		while(top != -1)
		{
			System.out.print(revChar[top]);
			top--;
		}
	}

	public static void main(String[] args) 
	{
		StackStringReverse stringReverse = new StackStringReverse("hello kani");
		stringReverse.print();
	}
}
