package in.co.kani;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintSStrings {
	
	public void printSStrings(List<String> list)
	{
		/*for (String string : list) {
			if(string.startsWith("S") || string.startsWith("s"))
			{
				System.out.println(string);
			}
		}*/
		
		// using Java 8
		Stream<String> s = list.stream().filter(str -> str.startsWith("s") || str.startsWith("S"));
		System.out.println(s.collect(Collectors.toList()));
		
		// Output will be 
		
		// [Sehwag, sachin, Sharma]

	}
	
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Kani");
	list.add("Sehwag");
	list.add("lisa");
	list.add("sachin");
	list.add("Dhoni");
	list.add("Sharma");
	list.add("Emily");
	PrintSStrings sStrings = new PrintSStrings();
	sStrings.printSStrings(list);
}
}
