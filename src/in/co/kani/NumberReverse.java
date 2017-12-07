package in.co.kani;

public class NumberReverse {
	public static void main(String[] args) {
		System.out.println("Reversing the Number");
		int num = 12345;
		int temp = 0;
		int s = 0;
		while(num > 0)
		{
			temp = num % 10;
			s = (s * 10) + temp;
			num = num / 10;
		}
		System.out.println("Temp REverse sum = "+s);
	}
}
