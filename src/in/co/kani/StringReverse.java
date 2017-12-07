package in.co.kani;

public class StringReverse {
	public static void main(String[] args) {
		String pstr ="";
		String str = "RadaR";
		for (int i = str.length() - 1; i >= 0 ; i--) {
			pstr = pstr + str.charAt(i);
		}
		System.out.println("The reversed String is : "+pstr);
		if(str.equals(pstr))
			System.out.println("The String is a Palindrome");
		else
			System.out.println("The String is not a Palindrome");
	}
}
