package in.co.kani;

public class Factorial {
	
	int fact(int n)
	{
		if(n == 0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		int fact = 5;
		int ans = 1;
		for (int i = 1; i <= fact; i++) {
			ans = ans * i;
		}
		System.out.println("ans = "+ans);
		
		//Recursive Factorial
		Factorial factorial = new Factorial();
		int factValue = factorial.fact(5);
		System.out.println("fact ="+factValue);
	}
}
