package in.co.kani;

public class PrintAndCheckPrime {
	
	
	void printPrimeNo(int n)
	{
		for (int i = 1; i < n; i++) {
			int count = 0;
			for (int j = 2; j < i / 2; j++) {
				if( i % j == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0)
			{
				System.out.print(" "+ i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Checking the Prime Number");
		int n = 47;
		int m = n/2;
		boolean flag = true;
		if(n == 0 || n == 1)
			System.out.println("The number "+ n +"is not a Prime");
		for (int i = 2; i < m; i++) {
			if(n % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("The Number "+ n +"is a Prime");
		}
		else
		{
			System.out.println("The Number "+ n +"is not a Prime");
		}
		
		
		PrintAndCheckPrime prime = new PrintAndCheckPrime();
		prime.printPrimeNo(50);
	}
}
