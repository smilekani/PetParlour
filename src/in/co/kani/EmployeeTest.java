package in.co.kani;

import java.util.Arrays;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee[] empList = new Employee[3];
		empList[0] = new Employee(3, "kani", "Chennai");
		empList[1] = new Employee(2, "abc", "Chennai");
		empList[2] = new Employee(1, "elisa", "Chennai");
		Arrays.sort(empList);
		for (Employee employee : empList) {
			System.out.println("employee === "+employee);
		}
//		empList[3] = new Employee(4, "babi", "Chennai");
//		empList[4] = new Employee(5, "sharma", "Chennai");
//		empList[5] = new Employee(6, "Anna", "Chennai");
//		empList[6] = new Employee(7, "Mani", "Chennai");
//		System.out.println(empList);
//		System.out.println(empList);
	}
}
